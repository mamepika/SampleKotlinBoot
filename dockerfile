FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD app.jar app.jar
RUN bash -c 'touch /samplekotlinboot-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/samplekotlinboot-0.0.1-SNAPSHOT.jar"]