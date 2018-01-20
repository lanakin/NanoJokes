**backend - run configuration works**

Executing tasks: [:backend:assemble]

Configuration on demand is an incubating feature.
Gradle now uses separate output directories for each JVM language, but this build assumes a single directory for all classes from a source set. This behaviour has been deprecated and is scheduled to be removed in Gradle 5.0
	at build_8tkjqlrhrlq0g42zx5a8ni44y.run(/Users/annekenl1/Documents/ANDROID_NANO-workspace/github/NanoJokes/backend/build.gradle:19)
The setTestClassesDir(File) method has been deprecated and is scheduled to be removed in Gradle 5.0. Please use the setTestClassesDirs(FileCollection) method instead.
	at build_8tkjqlrhrlq0g42zx5a8ni44y.run(/Users/annekenl1/Documents/ANDROID_NANO-workspace/github/NanoJokes/backend/build.gradle:19)
:backend:appengineDownloadSdk
:jokesLib:compileJava
warning: [options] bootstrap class path not set in conjunction with -source 1.7
1 warning

:backend:compileJava
warning: [options] bootstrap class path not set in conjunction with -source 1.7

:backend:processResources NO-SOURCE
:backend:classes
:backend:appengineEndpointsGetClientLibs
API client library written to /Users/annekenl1/Documents/ANDROID_NANO-workspace/github/NanoJokes/backend/build/client-libs/myApi-v1-java.zip
:backend:appengineEndpointsGetDiscoveryDocs
API Discovery Document written to /Users/annekenl1/Documents/ANDROID_NANO-workspace/github/NanoJokes/backend/build/discovery-docs/myApi-v1-rpc.discovery
API Discovery Document written to /Users/annekenl1/Documents/ANDROID_NANO-workspace/github/NanoJokes/backend/build/discovery-docs/myApi-v1-rest.discovery
:jokesLib:processResources NO-SOURCE
:jokesLib:classes
:jokesLib:jar
:backend:war
:backend:appengineExplodeApp
:backend:assemble

BUILD SUCCESSFUL in 6s
8 actionable tasks: 8 executed
