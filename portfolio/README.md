# MyFirstSpringApp
## Description

Welcome to my first Spring Boot Application!

Code is written using Java 17, Spring Boot version 2.7.5 as a framework, and Gradle as a build tool.
It does not use any database, it stores data localy in app.

### Configuration
* Clone this project: git@github.com:ElinaLastovska/MyFirstSpringApp.git
* Run the project in console: ./gradlew run

### Requirements:
* Have JRE/JDK 17 installed.
* If you would like to test API calls, use some tool like Postman.
## Endpoint description
#### http://localhost:8080/getTime
* will show you local time in pattern - "HH:mm"
#### http://localhost:8080//savePerson
*   as a request body object of following structure is required:
```
  {
    "firstName": "string",
    "lastName": "string"
  }
   ```
#### http://localhost:8080/getPersons
* It will return list of saved persons
#### http://localhost:8080/saveText
* It will save your text
#### http://localhost:8080/getSavedTexts
* It will return list of saved text
