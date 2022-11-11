node {
    
    stage ('Git Clone'){
       // git credentialsId: 'focusmindonline', url: 'https://github.com/focusmindonline/sonarqube-jacoco-project.git'
       git credentialsId: 'omprakashpandit', url: 'https://github.com/omprakashpandit/SONARWithJACOCO.git'
    }
    stage('JACOCO'){
        jacoco()
     }
     
    stage ('Maven Clean Build'){
        def mavenHome = tool name: "Maven-3.8.6", type: "maven"
        def mavenCMD = "${mavenHome}/bin/mvn"
        sh "${mavenCMD} clean package"
    }
    stage('SonarQube analysis') {
			withSonarQubeEnv('Sonar-Server-9.5') {
			def mavenHome = tool name: "Maven-3.8.6", type: "maven"
			def mavenCMD = "${mavenHome}/bin/mvn"
			sh "${mavenCMD} sonar:sonar"
    	}
    }
    
}
