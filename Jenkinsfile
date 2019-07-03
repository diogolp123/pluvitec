pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                bat 'java -jar pluvitec-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}