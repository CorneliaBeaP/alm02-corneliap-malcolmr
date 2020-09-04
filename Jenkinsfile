pipeline{
    agent any
    parameters{
        choice(name: 'DEPLOY_ENV', choices: ['int', 'stage', 'prod'], description:'Target environment')
    }

    stages{
            stage('Build application, run tests and publish test results'){
                agent {
        docker{ image 'rasilva1986/java-maven:alm'}
                }
        
                steps{
                    sh 'mvn clean install'
                }
                
                post{
                    always {
                        junit 'ejb_mod/target/surefire-reports/*.xml'
                        publishHTML([
                            allowMissing: false, 
                            alwaysLinkToLastBuild: false, 
                            keepAll: false, 
                            reportDir: 'ejb_mod/target/surefire-reports', 
                            reportFiles: 'index.html', 
                            reportName: 'Unit tests', 
                            reportTitles: 'Unit tests'
                        ])
                        
                        publishHTML([
                            allowMissing: false, 
                            alwaysLinkToLastBuild: false, 
                            keepAll: false, 
                            reportDir: 'ejb_mod/target/site/jacoco/', 
                            reportFiles: 'index.html', 
                            reportName: 'Test coverage', 
                            reportTitles: 'Test coverage'
                            ])
                    }
               

                }
              
            }
            stage('Save artifact'){
                agent any
                steps{
                    archive 'web_mod/target/web_mod-1.0-SNAPSHOT.war'
                }
            }
            
            stage('Deploy application'){
                agent any
                steps{
                    sh 'asadmin --port 4848 deploy --force --name alm02-corneliap-malcolmr-${DEPLOY_ENV} --contextroot alm02-corneliap-malcolmr-${DEPLOY_ENV} web_mod/target/web_mod-1.0-SNAPSHOT.war'
                }

            }
            
        }

}

