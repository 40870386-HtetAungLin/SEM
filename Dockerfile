FROM eclipse-temurin:25-jdk

COPY ./target/classes/com /tmp/com
COPY ./target/dependency/*.jar /tmp/lib/

WORKDIR /tmp

ENTRYPOINT ["java", "-cp", "/tmp:/tmp/lib/*", "com.napier.sem.Main"]