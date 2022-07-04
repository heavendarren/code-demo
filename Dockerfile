FROM openjdk:17

MAINTAINER wangqx

RUN mkdir -p /demo/server
RUN mkdir -p /demo/server/logs
RUN mkdir -p /demo/server/temp

WORKDIR /demo/server

EXPOSE 8080

ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
