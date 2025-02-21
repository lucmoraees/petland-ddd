<h1>🐾 Petland API</h1>

<h2>📌 Sobre o Projeto</h2>
<p>Este é um projeto desenvolvido para estudos sobre <strong>Domain-Driven Design (DDD)</strong> aplicado a uma API REST com <strong>Spring Boot</strong> e <strong>PostgreSQL</strong>. O projeto simula um sistema para gestão de atendimento veterinário, permitindo o cadastro de clientes, animais, serviços e a realização de atendimentos.</p>

---

<h2>📐 Arquitetura do Projeto</h2>
<p>A aplicação segue os princípios do <strong>DDD (Domain-Driven Design)</strong>, separando a lógica de domínio das demais camadas da aplicação. A estrutura do projeto é organizada conforme os <strong>Bounded Contexts</strong>, garantindo a modularização e a separação de responsabilidades.</p>

<p align="center">
    <img src="https://github.com/user-attachments/assets/6eb7f603-ffdb-48c7-b33c-d636ae9f89b4" alt="Diagrama da Arquitetura" width="700">
</p>

---

<h2>📂 Estrutura do Projeto</h2>
<pre>
petland-api
│── src
│   ├── main
│   │   ├── java/com/petland
│   │   │   ├── atendimento
│   │   │   │   ├── controller
│   │   │   │   ├── model (dto, entity, valueObject)
│   │   │   │   ├── repository
│   │   │   │   ├── service
│   │   │   ├── cadastros
│   │   │   │   ├── controller
│   │   │   │   ├── model (dto, entity, valueObject)
│   │   │   │   ├── repository
│   │   │   │   ├── service
│   │   │   ├── start (classe principal)
│   │   ├── resources
│   ├── test
│── pom.xml
│── README.md
</pre>

---

<h2>🚀 Tecnologias Utilizadas</h2>
<ul>
    <li><strong>Java 17</strong></li>
    <li><strong>Spring Boot</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>PostgreSQL</strong></li>
    <li><strong>Lombok</strong></li>
    <li><strong>H2 Database (para testes)</strong></li>
    <li><strong>Springdoc OpenAPI (Swagger)</strong></li>
</ul>

---

<h2>🔧 Configuração e Execução</h2>
<ol>
    <li><strong>Clone o repositório:</strong>
        <pre>git clone https://github.com/seu-usuario/petland-api.git</pre>
    </li>
    <li><strong>Acesse o diretório do projeto:</strong>
        <pre>cd petland-api</pre>
    </li>
    <li><strong>Configure o banco de dados no <code>application.properties</code>:</strong>
        <pre>
spring.datasource.url=jdbc:postgresql://localhost:5432/petland_db
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
        </pre>
    </li>
    <li><strong>Execute o projeto:</strong>
        <pre>mvn spring-boot:run</pre>
    </li>
</ol>

---

<h2>📖 Domínio do Problema</h2>
<p>A aplicação gerencia um sistema veterinário, permitindo:</p>
<ul>
    <li>Cadastro de <strong>clientes</strong> e <strong>animais</strong> 🐶🐱🐍</li>
    <li>Gerenciamento de <strong>atendimentos</strong> e <strong>serviços</strong></li>
    <li>Controle de <strong>estoque de produtos</strong></li>
    <li>Diferenciação de <strong>status</strong> e <strong>tipos de atendimento</strong></li>
</ul>

---

<h2>🛠️ Próximos Passos</h2>
<ul>
    <li>Implementação de testes automatizados 📌</li>
    <li>Melhorias na documentação com Swagger 📜</li>
    <li>Implementação de autenticação com Spring Security 🔐</li>
</ul>

---

<h2>📝 Licença</h2>
<p>Este projeto foi desenvolvido para fins educacionais e está disponível sob a licença <strong>MIT</strong>.</p>
