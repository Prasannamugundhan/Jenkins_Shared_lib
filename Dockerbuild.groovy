def call (Map stageParams){
    sh 'docker build -t jenshrd/latest .'
}