pipeline {
	parameters {
	    choice (name: 'Stack', choices: ['dev', 'test', 'prod'], description: 'Stack to deploy')
	    choice (name: 'Customer', choices: ['Akron', 'Houston Methodist', 'Yale'], description: 'Customer environment to deploy')
	    choice (name: 'Product', choices: ['PeraServer', 'PeraTrend', 'PeraWatch'], description: 'Stack to deploy')
	    string (name: 'Version', defaultValue: 'Enter version X.X.X.X (i.e. 4.2.0.15)', description: 'Version including build to deploy', trim: true)
	    }
	agent any
	environment {}
	stages {
	    stage('Deploy') {
	        echo 'Deploying ${params.Product} v${params.Version} to ${params.Customer} ${params.Stack} stack'
	    }
	}
}
