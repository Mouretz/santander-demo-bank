Tela Inicial Santander utilizando Java, RESTFull API e Spring Boot.

## Diagrama de Classe
```mermaid
classDiagram
    class User {
        - string name
        - Account account
        - Features features
        - Card card
        - News news
    }

    class Account {
        - string accountNumber
        - string accountAgency
        - float accountBalance
        - float accountLimit
    }

    class Features {
        - string pixIcon
        - string pixDescription
    }

    class Card {
        - string cardNumber
        - float cardList
    }

    class News {
        - string newsIcon
        - string newsDescription
    }

    User "1" *--> "1" Account
    User "1" *--> "N" Features
    User "1" *--> "1" Card
    User "1" *--> "N" News

```

## Tecnologias

# 1. Criação e Versionamento de API
- Spring Boot 3, Java 17, Gradle, PostgreSQL, H2 Database<br/>
    
    **Spring Web** Para construir a API REST.<br/>
    **Spring Data JPA** Para persistência de dados.<br/>
    **H2 Database** Para desenvolvimento local.<br/>
    **PostgreSQL** Para produção..<br/>

# 2. Abstração e Modelagem do Domínio
- Figma, JSON Editor, Mermaid<br/>


# 3. Implementação do Back-End
- Spring Boot, Java 17, JPA<br/><br/>
Criação de classes de domínio, como User, Account, Card, Feature, e News, utilizando anotações JPA para mapear as tabelas no banco de dados.<br/>
Conexão com o banco de dados H2 para testes locais.<br/>
Configuração do banco de dados no arquivo application.yml.<br/>

# 4. Implementação de Camada de Negócio (Service e Implements)
- Spring Service <br/><br/>
Criação de interfaces de serviços e implementação das mesmas com lógica de CRUD.<br/>
A injeção de dependências foi realizada por meio do Spring Framework.

# 5. Endpoints REST (Controller)
- Spring MVC <br/><br/>
Implementação de controladores REST, incluindo os métodos GET e POST para manipulação de dados de usuários.

# 6. Criação de Testes com Swagger
- Swagger, SpringDoc<br/><br/>
Integração do Swagger para testar a API diretamente pela interface web, facilitando a visualização e consumo dos endpoints.

# 7. Tratamento de Exceções
- Spring Exception Handling<br/><br/>
Descrição: Criação de uma classe global de tratamento de exceções, centralizando os erros como IllegalArgumentException, NoSuchElementException, e erros inesperados.


