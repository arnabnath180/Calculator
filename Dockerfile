FROM openjdk
WORKDIR ./
COPY ./target/devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java", "-jar", "devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]