# Aduro Management System Spring Boot, Inmem, JPA, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Note-Taking application using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql/Inmem H2 - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/krishnavt/sprint-rest-crud.git
```


**2. Change inmem username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**3. Build and run the app using maven**

Run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/create-employees
    
    POST /api/list-employees
    
    GET /api/get-employee/{id}
    
    PUT /api/update-employee/{id}
    
    DELETE /api/delete-employee/{id}

You can test them using postman or any other rest client.