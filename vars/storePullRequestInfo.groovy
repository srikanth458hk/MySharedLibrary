// vars/storePullRequestInfo.groovy
def call(String pullRequestId) {
    // In this example, we will just write the pull request ID to a file.
    // You can customize this function based on your specific storage needs.

    // Replace '/path/to/pull_request_ids.txt' with the actual file path where you want to store the pull request IDs.
    def filePath = '/var/lib/jenkins/workspace/pull_request_ids.txt'

    // Create or append the pull request ID to the file.
    new File(filePath) << pullRequestId + '\n'

    // You can add additional logic or actions here if needed.
    echo "Pull request ID ${pullRequestId} stored successfully."
}

