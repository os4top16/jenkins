package org.devops

//构建类型
def Build(buildType,buildShell){
    
    def buildTools = ["mvn":"M2","ant":"ANT","gradle":"Gradle","npm":"NPM"]
    println("当前选择的类型为 ${buildType}")
    buildHome = tool buildTools[buildType]
    
    if ("${buildType == "npm"}"){
        //npmHome = tool "NodeJS"
        sh "export NODE_HOME=/usr/local/node-v14.15.1-linux-x64 && export PATH=\$NODE_HOME/bin:\$PATH  && ${npmHome}/bin/npm ${buildShell}"
    }else {
        sh "${buildHome}/bin/${buildType} ${buildShell}"
    }
}
