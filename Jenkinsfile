pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh './gradlew dependencies --configuration=runtimeClasspath'
        sh './gradlew test'
      }
    }
  }
  post {
    always {
      junit 'lib/build/test-results/**/*.xml'
    }
  }
}
