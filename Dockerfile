FROM openjdk:8-jre-alpine

ADD target/productinfo-0.0.1-SNAPSHOT.jar /app.jar

RUN sh -c 'touch /app.jar'

EXPOSE 8080

CMD ["java", "-Xms128m", "-Xmx256m", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
