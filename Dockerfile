# Usamos una imagen base de Java
FROM openjdk:17-jdk-slim

# Directorio de trabajo dentro del contenedor
WORKDIR /appcd

# Copiar el JAR al contenedor
COPY PrintMay-1.0.jar PrintMay-1.0.jar

# Deja el contenedor en una shell por defecto
ENTRYPOINT ["/bin/sh"]

# docker build -t --- .
# docker run -it ---
# java -jar ---