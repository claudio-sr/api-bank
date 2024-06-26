# Api Bank

RESTful API constuida em Java 21 com Spring Boot 3.

## Tecnologias
- **java 21**: A versão LTS mais recente do Java.
- **Spring boot 3**: A mais nova versão do Spring Boot.
- **Spring Data JPA**
- **OpenAPI (Swagger)**

## Diagrama de classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }
    
    class Account {
        -String number
        -String agency
        -Number balance
        -Number limit
    }
    
    class Feature {
        -String icon
        -String description
    }
    
    class Card {
        -String number
        -Number limit
    }
    
    class News {
        -String icon
        -String description
    }
    
    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
