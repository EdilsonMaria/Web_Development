# Use uma imagem base do OpenJDK com Alpine
FROM openjdk:17-jdk-alpine

# Instale o Maven
RUN apk add --no-cache maven

# Crie o diretório de aplicação
RUN mkdir /app

# Copie os arquivos de configuração do Maven (opcional, se houver)
COPY pom.xml /app/
COPY src /app/src

# Defina o diretório de trabalho
WORKDIR /app

# Compile a aplicação usando Maven sem exibir os logs
RUN mvn clean package -DskipTests

# Exponha a porta da aplicação
EXPOSE 8080

# Copie o JAR executavel da aplicação para o diretório de trabalho
RUN mv target/*.jar app.jar

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]