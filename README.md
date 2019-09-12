### spring cloud samples

#### Build project

```
mvn clean package
```

#### Setup Eureka cluster

First, add the following hostnames in your hosts file

```
127.0.0.1 eureka-server-1
127.0.0.1 eureka-server-2
127.0.0.1 eureka-server-3
```

To start up multiple eureka instances(you can only start one if you don't need cluster),
run the following commands in eureka-service folder:

```
java -Dspring.profile.active=node1 -jar target/eureka-service-1.0-SNAPSHOT.jar
java -Dspring.profile.active=node2 -jar target/eureka-service-1.0-SNAPSHOT.jar
java -Dspring.profile.active=node3 -jar target/eureka-service-1.0-SNAPSHOT.jar
```

Go to any of the node page(eg: http://eureka-server-1:8761) and check there are registered replicas

