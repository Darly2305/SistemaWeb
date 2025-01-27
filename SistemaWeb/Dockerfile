
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM java:23
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} SistemaWeb.jar
ENTRYPOINT ["java","-jar","/SistemaWeb.jar"]