pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                bat "./gradlew clean test"
            }
        }

        stage('Build'){
            steps {
                bat "./gradlew build"
            }
        }

        stage('Build'){
            steps {
                bat "echo monesha"
            }
        }

    }
}
