pipeline {
  agent any
  stages {
    stage('test') {
      sh './gradlew dependencies --configuration=compileClasspath'
      sh './gradlew test'
    }
  }
  post {
    always {
      junit 'build/reports/**/*.xml'
    }
  }
}
