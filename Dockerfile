FROM openjdk:latest
WORKDIR /app
COPY ./target/detect.jar /app
EXPOSE 9092
CMD ["java","-jar","detect.jar"]