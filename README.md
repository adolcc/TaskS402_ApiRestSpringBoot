# TaskS402_ApiRestSpringBoot

Spring Boot REST API with CRUD operations using H2, MySQL, and MongoDB databases.

## 📋 Description

This project implements CRUD operations with three different databases:
- **Level 1**: H2 (in-memory)
- **Level 2**: MySQL
- **Level 3**: MongoDB


## 🔌 Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/fruta/add` | Create fruit |
| PUT | `/fruta/update` | Update fruit |
| DELETE | `/fruta/delete/{id}` | Delete fruit |
| GET | `/fruta/getOne/{id}` | Get one fruit |
| GET | `/fruta/getAll` | Get all fruits |

## 🚀 Technologies

- Spring Boot
- Spring Data JPA / MongoDB
- H2 / MySQL / MongoDB
- Maven

## ⚙️ Setup

1. Clone the repository:
```bash
git clone https://github.com/adolcc/TaskS402_ApiRestSpringBoot.git
```

2. Run the application:
```bash
mvn spring-boot:run
```

3. Access: `http://localhost:8080`

## 🧪 Testing

Example POST request:
```bash
curl -X POST http://localhost:8080/fruta/add \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Apple","cantidadQuilos":10}'
```

## 📚 Resources

- [Spring Boot + MySQL CRUD Guide](https://dev.to/abhi9720/a-beginners-guide-to-crud-operations-of-rest-api-in-spring-boot-mysql-5hcl)
- [Spring Boot with H2 Database](https://www.baeldung.com/spring-boot-h2-database)
- [Spring Boot + MongoDB CRUD](https://www.geeksforgeeks.org/spring-boot-crud-operations-using-mongodb/)
- [Spring ResponseEntity Guide](https://www.baeldung.com/spring-response-entity)

## 👤 Author

[@adolcc](https://github.com/adolcc)
