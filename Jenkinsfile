pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                bat "./gradlew clean test"
            }

            stage('BUILD') {
                steps {
                    bat "./gradlew build"
                }
            }
        }
    }
}
