FROM openjdk:11
EXPOSE 9999
ADD target/springboot-image-new.jar springboot-image-new.jar
ENTRYPOINT ["java","-jar","/springboot-image-new.jar"]