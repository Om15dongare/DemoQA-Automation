pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                dir('DemoQAAutomation') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                dir('DemoQAAutomation') {
                    bat 'mvn test'
                }
            }
        }

        stage('Report') {
            steps {
                dir('DemoQAAutomation') {
                    publishHTML([
                        allowMissing: true,
                        alwaysLinkToLastBuild: true,
                        keepAll: true,
                        reportDir: 'target',
                        reportFiles: 'ExtentReport.html',
                        reportName: 'Extent Report'
                    ])
                }
            }
        }
    }
}
