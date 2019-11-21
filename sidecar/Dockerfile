FROM java:8-jdk-alpine

COPY ./target/sidecar-1.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch sidecar-1.0-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar", "sidecar-1.0-SNAPSHOT.jar"]