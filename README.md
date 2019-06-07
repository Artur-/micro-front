A micro frontend example with parts built using server side Java

This projects uses a custom Flow version 
```
git clone https://github.com/vaadin/flow.git
git checkout microfront
mvn clean install -DskipTests
```

To run the project:
```
mvn install
cp */target/*.war ~/your/tomcat/webapps
```

Open http://localhost:8080/index.html
