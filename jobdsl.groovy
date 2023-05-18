pipelineJob('retodevops') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/laurabecerra1502/aplicacion-webpage.git')
                    }
                    branches('feature')
                    scriptPath('jenkinsfile')
                }
            }
            triggers {
                pollSCM('* * * * *')
            }
        }
    }                     
}
