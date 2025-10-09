# 🎬 Videoclub Microservicios


![Imagen del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/videoclub-microservicios-FRONTEND/refs/heads/master/Captura.JPG?raw=true)
![Imagen del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/videoclub-microservicios-FRONTEND/refs/heads/master/Captura3.JPG?raw=true)



## Ejemplo en vivo
https://victorgranadosjimenez.github.io/videoclub-microservicios-FRONTEND/

## Descripción 📑

Este proyecto representa un sistema de videoclub basado en arquitectura de microservicios, construido con Spring Boot y PostgreSQL.
Cada microservicio gestiona una parte del dominio: películas, categorías e idiomas, y se comunican entre sí mediante REST API usando RestTemplate.

El frontend (HTML, CSS y JS puro) se aloja en GitHub Pages, desde donde consume las APIs desplegadas en Render.


* Frontend: Publicado en GitHub Pages, muestra las películas en tarjetas.

* Películas Service: Gestiona las películas y consume los otros microservicios.

* Categorías e Idiomas Service: Proveen los nombres asociados a cada ID.

* PostgreSQL: Una sola base de datos compartida entre los tres servicios en Render.



## Despliegue paso a paso en Render 📌

1. Crear una base de datos PostgreSQL

En Render → New → PostgreSQL.

Guarda host, db, user y password.

2. Configurar application.properties

spring.datasource.url=jdbc:postgresql://<host>:5432/<db>
spring.datasource.username=<usuario>
spring.datasource.password=<contraseña>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


3. Conectarte desde pgAdmin

Añadir nuevo servidor → usar los datos de Render.

Verifica que las tablas se crean al ejecutar el backend.

4. Subir cada microservicio a Render

Render → New Web Service → Conecta tu repo → Deploy.

Si Render no detecta Java, usa Dockerfile.

* Errores comunes:

🚫 Error con permisos en mvnw

git update-index --chmod=+x mvnw
git commit -m "Fix: make mvnw executable for Render"
git push

🚫 Render no detecta Java correctamente
→ Crear un Dockerfile en la raíz del proyecto.

FROM openjdk:21-jdk
COPY . /app
WORKDIR /app
RUN ./mvnw clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/*.jar"]


## Tecnologías 🛠
[![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://es.wikipedia.org/wiki/Java_(lenguaje_de_programaci%C3%B3n))
[![SPRINGBOOT](https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white)](https://en.wikipedia.org/wiki/Spring_Boot)

## Vista previa del proyecto
Si quieres hechas un vistazo al proyecto, te recomiendo:

![Imagen del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/videoclub-microservicios-FRONTEND/refs/heads/master/Captura.JPG?raw=true)
![Imagen del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/videoclub-microservicios-FRONTEND/refs/heads/master/Captura2.JPG?raw=true)
![Imagen del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/videoclub-microservicios-FRONTEND/refs/heads/master/Captura3.JPG?raw=true)


## Autor ✒️
VÍCTOR GRANADOS JIMÉNEZ

<img src="https://avatars.githubusercontent.com/u/57761479?v=4" width=115><br>

* [Perfil Github](https://github.com/victorgranadosjimenez)
* [Correo](granadosvictor01@gmail.com)
* [LinkedIn](www.linkedin.com/in/victorgranadosjimenez/)


## Instalación 
Este proyecto no necesita de instalación. Simplemente abre la carpeta o haz doble click en el .html
  
## Licencia 📄
MIT Public License v3.0
No puede usarse comencialmente.


