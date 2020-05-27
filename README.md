# Generating API Server using swagger-codegen-maven-plugin

## This repository contains an example of use of swagger-codegen-maven-plugin

### Source of the API
Example of generating an API server of an OpenApi contract. In this case, the [Swagger Petstore](http://petstore.swagger.io/v2/swagger.json) json contract is being used.

### Tool to generate the API
The Maven plugin called [swagger-codegen-maven-plugin](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin) is being used.


### How to run
After cloning the project, you can generate the models and controllers with this command:
```sh
mvn clean install
```
