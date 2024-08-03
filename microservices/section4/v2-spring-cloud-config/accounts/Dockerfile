#Start with the base image containing Java runtime. Means pull image if jdk that will be required to run
#accounts microservice
FROM openjdk:21-jdk-slim

#Who is maintaining this image
MAINTAINER Paurav_Easybytes

#Path where this jar is located and the name of jar that is to be included in Docker image
#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Starting point of our application
#Execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]