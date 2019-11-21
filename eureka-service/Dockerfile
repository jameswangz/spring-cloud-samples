FROM java:8-jdk-alpine

COPY ./target/eureka-service-1.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch eureka-service-1.0-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar", "eureka-service-1.0-SNAPSHOT.jar"]