# Installation and Setup  
In order to run this project, UAA OAuth server needs to be set up first. 

## Steps to set up Cloud Foundry UAA server
```
 git clone git://github.com/cloudfoundry/uaa.git  
 
 copy uaa.yml from /src/main/resources/uaa.yml to <uaa-root-dir>/uaa/src/main/resources  
  
 ./gradlew  run
 
 ```

## Steps to build and run  
```
mvn clean install
(uaa runs on port 8080, so select any other port to run this app)
mvn springboot-run -Dserver.port=8085  
```
