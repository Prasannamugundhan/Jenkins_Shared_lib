def call(Map stageParams){
sh 'docker build -t Dockerfile --target runner -t imagename:1.0 .'
}