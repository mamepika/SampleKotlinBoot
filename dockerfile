FROM maven:3.3.9-jdk-8 AS build1
RUN mkdir -p /opt/java/src
ADD ./pom.xml /opt/java/
ADD ./src /opt/java/src
RUN cd /opt/java && mvn install



FROM openjdk:8-jdk-alpine
WORKDIR /tmp
COPY ./target/samplekotlinboot-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]