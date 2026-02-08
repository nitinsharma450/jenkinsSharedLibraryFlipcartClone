def call(string imageName,String tag){
    echo 'Start building Docker image'
    sh 'docker build -t ${imageName}:${tag} .'
    echo 'Docker image built successfully'
}
