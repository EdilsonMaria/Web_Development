# 🎓 Web Development - Sistema Universitário

Este projeto é uma aplicação web que segue os padrões de API REST. Trata-se de um sistema de **Aluno Online**, uma plataforma universitária com funcionalidades voltadas para **coordenação**, **alunos** e **professores**.

## 🧩 Funcionalidades

### 👩‍💼 Coordenação
- Login no sistema
- Gerenciamento de professores
- Gerenciamento de disciplinas
- Gerenciamento de alunos

### 👨‍🎓 Aluno
- Login no sistema
- Matrícula em disciplinas
- Visualização de notas e histórico
- Solicitação de trancamento

### 👨‍🏫 Professor
- Login no sistema
- Visualização de disciplinas
- Gerenciamento de suas disciplinas

A aplicação implementa operações completas de **CRUD** (`POST`, `GET`, `PUT`, `DELETE`) para as funcionalidades acima.

---

## 📚 Índice

- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Requisitos](#requisitos)
- [Instalação](#instalação)
- [Configuração](#configuração)
- [Uso com Docker](#uso-com-docker)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

---

## 🔍 Visão Geral

Este projeto visa demonstrar como o front-end interage com APIs REST através de chamadas JavaScript aos endpoints fornecidos pelo back-end. Ele também ajuda a compreender melhor o funcionamento de um sistema completo web com banco de dados relacional.

---

## 🚀 Tecnologias Utilizadas

### Backend:
- [Java Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)

### Frontend:
- HTML
- CSS
- JavaScript

---

## ✅ Requisitos

- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Visual Studio Code](https://code.visualstudio.com/download)
- [Docker (opcional)](https://www.docker.com/)

---

## 🛠️ Instalação

### Clonando o Repositório
```bash
git clone https://github.com/EdilsonMaria/Banco_dados_Avancados.git
cd Banco_dados_Avancados
```

---

## ⚙️ Configuração

1. Configure o PostgreSQL e crie um banco de dados.
2. Atualize o arquivo `application.properties` em `src/main/resources` com suas credenciais:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu-database
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
```

3. Compile e inicie o back-end:
```bash
./mvnw spring-boot:run
```

---

## 🐳 Uso com Docker

1. Acesse o diretório raiz do projeto:
```bash
cd <diretório-do-projeto>
```

2. Execute o comando:
```bash
docker compose up --build -d
```

---

## 🗂️ Estrutura do Projeto

```
WebDevelopment/
├── api/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml
├── web/
│   ├── view/
│   ├── css/
│   ├── html/
│   └── javaScript/
└── README.md
```

---

## 🤝 Contribuição

Quer contribuir? Siga os passos abaixo:

1. Faça um fork do projeto
2. Crie uma branch:  
   ```bash
   git checkout -b feature/NomeDaFeature
   ```
3. Commit suas alterações:  
   ```bash
   git commit -m "Adiciona nova feature"
   ```
4. Envie sua branch:  
   ```bash
   git push origin feature/NomeDaFeature
   ```
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

---

## 📬 Contato

- **Nome:** Edilson Maria da Silva Junior  
- **Email:** edilson.eng1@gmail.com  
- **GitHub:** [EdilsonMaria](https://github.com/EdilsonMaria)  
- **LinkedIn:** [linkedin.com/in/edilson-maria-a73477179](https://www.linkedin.com/in/edilson-maria-a73477179/)
