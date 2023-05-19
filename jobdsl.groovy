pipelineJob('retodevops') {
    definition {
        cpsScm {
            scm {
                git {
                    branch('feature')
                    remote {
                        url('https://github.com/laurabecerra1502/aplicacion-webpage.git')
                    }
                    scriptPath('jenkinsfile')
                } 
            }      
        }

        triggers {
            cron('0 */3 * * 1-5')
        }
    }
}                     
