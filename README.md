# PRÉREQUIS
- Java 8 ou supérieur
- Maven 3.3.x ou supérieur
- Une connextion internet

# Construire le projet
`Uniquement pour les utilisateurs de la ligne de commande`  
À la racine du projet lancer la commande suivante :
```bash
$ mvn clean package
```

# Lancer l'application
Toujours à la racine du projet
```bash
$ java -jar target/dependency/webapp-runner.jar target/jerseycdi.war --port 9090
``` 
Allez ensuite à cette URL http://localhost:9090/api/hello et vous verrez la magie opérer.

# Autres
## Dépendances maven
### Jersey et l'intégration de CDI
```xml
<dependency>    
    <groupId>org.glassfish.jersey.containers</groupId>
    <artifactId>jersey-container-servlet-core</artifactId>
    <version>2.29.1</version>
    <scope>compile</scope>
</dependency>
<dependency>
    <groupId>org.glassfish.jersey.core</groupId>
    <artifactId>jersey-server</artifactId>
    <version>2.29.1</version>
    <scope>compile</scope>
</dependency>
<!-- HK2 And CDI injection API dependency -->
<dependency>
    <groupId>org.glassfish.jersey.inject</groupId>
    <artifactId>jersey-cdi2-se</artifactId>
    <version>2.29.1</version>
    <scope>compile</scope>  
</dependency>
<dependency>
    <groupId>org.glassfish.jersey.inject</groupId>
    <artifactId>jersey-hk2</artifactId>
    <version>2.29.1</version>
</dependency>
```