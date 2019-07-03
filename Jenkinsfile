pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn install'
            }
        }
        stage('run') {
            steps {
                bat 'java -jar target/pluvitec-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}