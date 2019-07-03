pipeline {
    agent { docker { image 'jdkcontainer' } }
    stages {
        stage('build') {
            steps {
                bat 'mvn install'
            }
        }
    }
}