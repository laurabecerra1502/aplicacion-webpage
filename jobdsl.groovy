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
            scm('* * * * 1-5')
        }
    }
}                     
