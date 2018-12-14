# use alpine as base image
FROM openjdk:jdk-alpine
# recommended by spring boot
VOLUME /tmp
# create directory for application
RUN mkdir /app
WORKDIR /app
# add user for application
RUN adduser -S sboot
USER sboot
# set entrypoint to execute spring boot application
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar build/libs/samplekotlinboot-0.0.1-SNAPSHOT.jar" ]