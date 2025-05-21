# Usa una imagen base de Java 23
FROM eclipse-temurin:23-jdk

# Argumento que le dice a Docker dónde buscar el .jar
ARG JAR_FILE=target/*.jar

# Copia el .jar dentro de la imagen con el nombre "app.jar"
COPY ${JAR_FILE} app.jar

# Comando que se ejecutará al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "/app.jar"]
