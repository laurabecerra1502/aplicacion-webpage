pipelineJob('pruebita') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/laurabecerra1502/aplicacion-webpage.git')
                    }
                    branches('main')
                    scriptPath('jenkinsfile')
                }
            }
            triggers {
                    githubPush()
            }                        
        }
    }
}
