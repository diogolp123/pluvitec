pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'java -jar target/pluvitec-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}