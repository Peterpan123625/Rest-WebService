# Employee REST Web Service

This project is a Java Spring Boot RESTful web service that manages employee data.  
It supports HTTP GET and POST requests and includes unit tests to verify correct behavior.

## Features
- Retrieve a list of employees using a REST endpoint
- Add new employees using HTTP POST
- In-memory data storage (no database required)
- Unit tests for GET and POST endpoints

## Technologies Used
- Java 17
- Spring Boot
- Gradle
- JUnit 5
- MockMvc

## API Endpoints

### GET /employees
Returns a JSON list of all employees.

Example response:
```json
{
  "Employees": [
    {
      "employee_id": "1",
      "first_name": "Jane",
      "last_name": "Street",
      "email": "jane.street@email.com",
      "title": "Teacher"
    }
  ]
}
