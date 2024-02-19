FROM eclipse-temurin:17
COPY target/rpc.jar rpc.jar
CMD ["java", "-jar", "rpc.jar"]