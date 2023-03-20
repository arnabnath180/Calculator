pipeline {
    agent any
    stages {
        stage('Clone Git') { /*you can also specify git location */
            steps {
                git 'https://github.com/arnabnath180/Calculator.git'
            }
        }
        stage('Maven Build') { /*you can also specify git location */
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Building our image') { /*you can also specify git location */
            steps {
                sh 'docker build -t arnabxyz/calculator:latest .'
            }
        }
        stage('Pushing image to Dockerhub') { /*you can also specify git location */
            steps{
                script {
                   docker.withRegistry('', "dockerhub" ) {
                        sh 'docker push arnabxyz/calculator:latest'
                    }
                }
            }
        }
        stage('Ansible Deploy') { /*you can also specify git location */
            steps {
                ansiblePlaybook credentialsId: 'ansible', disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml'
            }
        }
    }
    post{
        failure{
            emailext to: "arnabnath3030@gmail.com",
            subject: "jenkins build:${currentBuild.currentResult}: ${env.JOB_NAME}",
            body: "${currentBuild.currentResult}: Job ${env.JOB_NAME}",
            attachLog: true
        }
    }
}