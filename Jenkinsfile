pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh './gradlew dependencies --configuration=compileClasspath'
      }
      steps {
        sh './gradlew test'
      }
    }
  }
  post {
    always {
      junit 'build/reports/**/*.xml'
    }
  }
}
