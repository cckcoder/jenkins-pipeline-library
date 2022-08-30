def call(Map config) {
  node {
    echo "${config}"

    if ("${config.isReleaseCandidate}" == "false") {
      return config.rcNumber + '+ci.' + env.BUILD_NUMBER
    } else {
      return config.rcNumber
    }
  }
}
