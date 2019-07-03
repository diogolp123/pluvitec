pipeline {
    agent { docker { image '8-jdk' } }
    stages {
        stage('build') {
            steps {
                bat 'mvn install'
            }
        }
    }
}