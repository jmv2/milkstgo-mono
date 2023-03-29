FROM openjdk:17
ARG JAR_FILE=target/milkstgo-prod.jar
COPY $JAR_FILE milkstgo-prod.jar
ENTRYPOINT ["java", "-jar", "/milkstgo-prod.jar"]