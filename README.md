# gRPC Client Implementation in Spring Boot, Java


gRPC client uses 8001 port, for changing the port change ```grpc.server.port``` variable in [application.properties](src/main/resources/application.properties)

gRPC server port and name values are defined in also [application.properties](src/main/resources/application.properties)

To build and run this project use following commands in project folder:

```bash
mvn clean package # For installing required libraries
mvn spring-boot:run # For starting the project (server side) 
```

Note: grpcproto project should be installed via ```mvn install``` before running gRPC client project.