//declarative pipeline
pipeline{
    agent any
    stages{
        stage("clone code"){
            steps{
                println " Here I'm cloning the code to jenkins machine "
            }
        }
        stage("Build code"){
            steps{
                println "Here I'm building the code -- mvn clean package"
            }
        }
        stage("upload artifacts"){
            steps{
                println "Here I'm uploading artifacts to - S3 bucket"
            }
        }
        stage("deployment"){
            steps{
                println "here I'm deploying the code to tomcat servers"
            }
        }
    }
}