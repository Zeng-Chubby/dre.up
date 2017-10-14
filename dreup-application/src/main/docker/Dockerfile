FROM frolvlad/alpine-oraclejdk8:slim

ADD dreup-application-1.0-SNAPSHOT.jar dre-application.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]