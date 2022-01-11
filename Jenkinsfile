pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh './gradlew :lib:dependencies --configuration=compileClasspath'
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
