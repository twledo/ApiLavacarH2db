✅ Pré-requisitos
Git instalado para clonar o repositório

Java (JDK 17 ou superior)

Maven instalado

VS Code (ou outro IDE) com as seguintes extensões:

🔧 Extensões recomendadas:
Extension Pack for Java

Extension Pack for Java Auto Config

Lombok Annotations Support

Maven for Java

Spring Boot Extension Pack

🚀 Como rodar a aplicação
1️⃣ Clone o repositório:
bash
Copiar
Editar
git clone <url-do-repositorio>
2️⃣ (Opcional) Configure o banco H2:
Acesse o arquivo:
/src/main/resources/application.properties

Altere, se desejar, o username e password do H2.

3️⃣ Inicie o backend:
Execute no terminal:

bash
Copiar
Editar
mvn clean spring-boot:run
4️⃣ Acesse o console do banco H2:
Acesse no navegador:
http://localhost:8080/h2-console

Utilize o username e password configurados no application.properties.

🔑 Gerar senha com BCrypt
Para cadastrar um usuário no sistema:

Rode a classe:
/src/main/java/dev/ApiLavacar/Nego/GeneratePassword.java

Insira a senha desejada para gerar o hash BCrypt.

No console do H2, execute:

sql
Copiar
Editar
INSERT INTO OWNERS (username, password) VALUES ('seuUsername', 'senhaGeradaComBCrypt');
🌐 Frontend
Abra o arquivo:
/src/main/resources/static/login.html

Faça login utilizando seu username e senha normal (não criptografada — a API valida internamente via BCrypt).

💡 Observações
O backend roda em Spring Boot com banco em memória H2.

O frontend é uma página simples em HTML localizada dentro da própria aplicação, na pasta static.

