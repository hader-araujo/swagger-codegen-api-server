# Generating API Server using swagger-codegen-maven-plugin

## This repository contains an example of using swagger-codegen-maven-plugin

### API Source
This example is generating an API server of an OpenApi contract. In this case, the [Swagger Petstore](http://petstore.swagger.io/v2/swagger.json) json contract is being used.

### Tool to generate the API
The Maven plugin called [swagger-codegen-maven-plugin](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin) is being used.


### How to run
After cloning the project, the models and controllers can be generated using this command:
```sh
mvn clean install
```
