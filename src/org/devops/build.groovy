package org.devops

//构建类型
def Build(buildType,buildShell){
    
    def buildTools = ["mvn":"M2","ant":"ANT","gradle":"Gradle","npm":"NPM"]
    println("当前选择的vouj类型为 ${buildType}")
    buildHome = tool buildTools[buildType]
    sh "${buildHome}/bin/${buildType} ${buildShell}"

}
