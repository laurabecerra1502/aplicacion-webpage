pipelineJob('jobprueba3') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/laurabecerra1502/devops.git')
                    }
                    branches('main')
                    scriptPath('jenkinsfile')
                }
            }
        }
    }
}