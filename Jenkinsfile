pipeline {
    agent any
    environment {
        PATH = "${env.PATH};C:\\Windows\\System32"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'MKRadius', url: 'https://github.com/MKRadius/docker_redo.git'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvn test'
                bat 'mvn jacoco:prepare-agent install jacoco:report'
            }
            post {
                success {
                    // Publish JUnit test results
                    junit '**/target/surefire-reports/TEST-*.xml'
                    // Generate JaCoCo code coverage report
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}
