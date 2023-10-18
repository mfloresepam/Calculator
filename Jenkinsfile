pipeline {
    agent any
    parameters {
        choice(name: 'BUILDTOOL',
                choices: ['Maven', 'Gradle'],
                description: 'Select the build tool.')        
    }
    
    tools {
        maven 'Maven'
        gradle 'Gradle'
    }
   
    stages {
        stage('release') {
            steps {
                script {
                    if ( params.BUILDTOOL == 'Maven') {
                        echo 'Executing Maven build'
                        sh 'mvn -DskipTests package '
                    }
                    else {
                        echo 'Executing Gradle build'
                        sh 'gradle clean build'
                    }
                }
            }
        }
    }
}
