pipeline {
    agent any

    parameters {
        string(name: 'BRANCH', defaultValue: 'main', description: 'Rama a construir')
        booleanParam(name: 'RUN_TESTS', defaultValue: true, description: 'Ejecutar tests')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${params.BRANCH}",
                    url: 'https://github.com/maeshubu/practica-cicd.git'
            }
        }
        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw -B clean package -DskipTests'
            }
        }
        stage('Test') {
            when { expression { params.RUN_TESTS } }
            steps {
                sh './mvnw -B test'
            }
        }
    }

    post {
        success { echo 'Pipeline OK' }
        failure { echo 'Pipeline FALLO: revisar Console Output' }
    }
}
