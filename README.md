# Simple Spring Boot API

For use with Simple [React Frontend](https://github.com/jassanchez/CRUD-React).

## Installation

This Spring Boot Rest API was developed with JDK 21 Correto.

If you don't have installed Java, the link below redirect you to official page of Amazon Corretto JDK
[Amazon JDK Corretto](https://aws.amazon.com/es/corretto).

Create this database for use the project with MySQL.

```SQL
CREATE DATABASE db_backend_products;
USE db_backend_products;

CREATE TABLE products(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    description VARCHAR(50),
    price BIGINT
);
```

## Use

To enable the propertie configuration, check CORS policy, by default React Vite Project is port 5173, change if you need it in ProductController.java

# The Api Rest have the following endpoints:
  
### GET
- /api
 
### POST
- /api

### PUT
- /api/{id}

### DELETE
- /api/{id}

*To know about the JSON required for the operations check the entities package.*

Be yourself 😄.
