# Generating API Server using swagger-codegen-maven-plugin

## This repository contains an example of using swagger-codegen-maven-plugin

### API Source
This is an example of generating an API server of an OpenAPI contract.
In this case, the [Swagger Petstore](http://petstore.swagger.io/v2/swagger.json) json contract is being used.

### Tool to generate the API
The Maven plugin called [swagger-codegen-maven-plugin](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin) is being used.


### How to run
After cloning the project, the models and controllers can be generated using this command:
```sh
mvn clean install
```

### Configuration parameters that are being used
See more parameters that can be used in [swagger-codegen-maven-plugin configuration](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin#general-configuration-parameters)

- `inputSpec: http://petstore.swagger.io/v2/swagger.json` - OpenAPI Spec file path
- `language: spring` - target generation language
- `output: ${project.basedir}` - target output path (default is `${project.build.directory}/generated-sources/swagger`)
- `modelPackage: ${default.package}.dto` - the package to use for generated model objects/classes
- `apiPackage: ${default.package}.controller` - the package to use for generated api objects/classes
- `modelNameSuffix: DTO` - Sets the suffix for model classes and enums

- `generateApis: true` - generate the apis (`true` by default)
- `generateApiTests: false` - generate the api tests (`true` by default. Only available if `generateApis` is `true`)
- `generateApiDocumentation: false` - generate the api documentation (`true` by default. Only available if `generateApis` is `true`)
- `generateModels: true` - generate the models (`true` by default)
- `generateModelTests: false` - generate the model tests (`true` by default. Only available if `generateModels` is `true`)
- `generateModelDocumentation: false` - generate the model documentation (`true` by default. Only available if `generateModels` is `true`)
- `generateSupportingFiles: false` - generate the supporting files (`true` by default)

