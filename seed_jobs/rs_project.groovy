folder('RoboShop_WebApp') {
  displayName('RoboShop_WebApp')
  description('RoboShop_WebApp')
}

pipelineJob('RoboShop_WebApp/mongo') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-mongo.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/mysql') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-mysql.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/redis') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-redis.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/rabbitmq') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-rabbitmq.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/cart') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-cart.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/catalogue') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-catalogue.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/user') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-user.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/shipping') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-shipping.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/payment') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-payment.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/frontend') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-frontend.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}

pipelineJob('RoboShop_WebApp/vpc') {
  triggers {
  { pollSCM('H */4 * * 1-5') }
    }  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/imjitthu/tfas-VPC.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
      }
      'scriptPath'('jenkinsfile')
      'lightweight'(true)
    }
  }
}