# 🏮 Akihabara Product Service

Microservicio REST desarrollado en Spring Boot para la gestión de productos otaku de la tienda **Akihabara Market**. Permite operaciones CRUD sobre figuras, mangas y más, con validaciones, documentación Swagger y despliegue vía Docker.

---

## 🛠️ Tecnologías

- Java 23
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Swagger (SpringDoc)
- Docker

---

## 🚀 Cómo ejecutar

### Local

```bash
./mvnw spring-boot:run
```

### Docker
```bash
docker build -t akihabara-product-service .
docker run -p 8080:8080 akihabara-product-service
```

### Endpoints principales

Método	Endpoint Descripción

GET     /productos	      (Listar todos los productos)

GET	    /productos/{id}	  (Obtener producto por ID)

POST	  /productos	      (Crear nuevo producto)

PUT	    /productos/{id}	  (Actualizar producto)

DELETE	/productos/{id}	  (Eliminar producto)


### Documentación Swagger
Una vez en ejecución:
```bash
http://localhost:8080/swagger-ui.html
```


🧙‍♂️ Autor
Desarrollado por Livan 🧠
Proyecto educativo y de práctica para microservicios Java con Docker.