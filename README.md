# Employee Management System
This is a simple Spring Boot project implementing an Employee Management System. The project provides RESTful endpoints for CRUD (Create, Read, Update, Delete) operations on employees.

### Technologies Used
- Spring Boot 2.5.4
- Spring Data JPA
- H2 Database
- Gradle 7.2
- Java 17

### Getting Started
To run the project, you'll need to have Java and Gradle installed on your machine.

### 1. Clone the repository:
```
git clone https://github.com/<username>/<repository>.git

```
### 2. Navigate to the project directory:
```
cd <repository>
```
### 3. Run the application:
```
./gradlew bootRun
```

### 4. The application will start running at http://localhost:5000.

### API Endpoints
The following endpoints are available for the Employee model:

| Endpoint | HTTP Method | Description           |
| ------------- |-------------|-----------------------|
| /employees  | GET         | Get all employees     |
| /employees/{id}  | GET         | Get employee by ID    |
| /employees  | POST        | Create a new employee |
| /employees/{id}  | PUT         | Update an existing employee   |
| /employees/{id}  | DELETE         | Delete an existing employee   |

### Get all employees
To get a list of all employees, send a GET request to the /employees endpoint:

```
GET http://localhost:5000/employees
```

The response will be a JSON array of all employees:
```
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "johndoe@example.com",
        "phoneNumber": "1234567890",
        "department": {
            "id": 1,
            "name": "Sales"
        }
    },
    {
        "id": 2,
        "firstName": "Jane",
        "lastName": "Doe",
        "email": "janedoe@example.com",
        "phoneNumber": "1234567890",
        "department": {
            "id": 2,
            "name": "Marketing"
        }
    }
]

```

### Create a new employee
To create a new employee, send a POST request to the /employees endpoint with a JSON payload of the new employee:
```
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "johndoe@example.com",
    "phoneNumber": "1234567890",
    "department": {
        "id": 1,
        "name": "Sales"
    }
}

```