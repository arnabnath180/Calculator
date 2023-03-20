FROM openjdk
WORKDIR ./
COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]