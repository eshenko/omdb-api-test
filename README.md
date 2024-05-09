# [Omdb API](https://www.omdbapi.com) testing framework.

### Tech Stack
* Java
* Rest-assured
* TestNG
* Jackson
* Lombok
* Maven
* Log4j

### Description

All logical methods are documented with JavaDoc.

All test data/parameters are stored in [TestDataProvider.java](src/test/java/com/test/api/omdbapi/init/TestDataProvider.java) class.

### Running

The API key was excluded from the code for security reasons and should be provided as an external parameter.<br>
That is why for running tests from IDE `<omdbApiKey/>` property should be filled with your API key in [pom.xml](pom.xml).

Tests also can be run using the next command (Java and Maven should be installed):
```
mvn test -DomdbApiKey=<omdb_api_key>
```
where `<omdb_api_key>` placeholder should be replaced with your API key.
