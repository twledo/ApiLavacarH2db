🚗 API Lavacar - Guia de Instalação
✅ Pré-requisitos
Ter o Git instalado na máquina.

Ter o Java (JDK 17 ou superior) instalado.

Ter o Maven instalado.

Utilizar uma IDE como Visual Studio Code, IntelliJ ou equivalente.

🔧 Extensões necessárias na IDE:
"Extension Pack for Java"

"Extension Pack for Java Auto Config"

"Lombok Annotations Support"

"Maven for Java"

"Spring Boot Extension Pack"

🚀 Passos para rodar a aplicação
Clone o repositório utilizando o comando "git clone <url-do-repositorio>".

Abra o projeto na sua IDE.

Acesse o arquivo "application.properties", localizado em "src/main/resources".

Caso queira, altere o usuário e senha do banco H2, localizando as linhas "spring.datasource.username=seuUsuario" e "spring.datasource.password=suaSenha".

Inicie o backend executando o comando "mvn clean spring-boot:run" no terminal da sua IDE ou utilize o botão de execução do Spring Boot na interface.

Acesse o console do banco H2 digitando no navegador "http://localhost:8080/h2-console".

No console do H2, preencha os campos:

"JDBC URL" com o caminho padrão (normalmente "jdbc:h2:mem:testdb", se não alterado).

"User Name" com o nome de usuário configurado no arquivo "application.properties".

"Password" com a senha configurada no mesmo arquivo.

🔑 Cadastro de usuário no banco
No projeto, acesse a classe chamada "GeneratePassword", localizada na pasta "src/main/java/dev/ApiLavacar/Nego".

Execute essa classe. Ela solicitará que você digite uma senha no console.

Ao digitar sua senha, será gerada uma senha criptografada utilizando BCrypt.

Copie a senha gerada.

Acesse o console do H2 e execute o seguinte comando no campo de comandos SQL:

"INSERT INTO OWNERS (username, password) VALUES ('seuUsername', 'senhaGeradaComBCrypt');"

Substitua 'seuUsername' pelo nome de usuário desejado e 'senhaGeradaComBCrypt' pela senha que foi gerada na etapa anterior.

Exemplo:
"INSERT INTO OWNERS (username, password) VALUES ('admin', '$2a$10$AbCdEfGhIjKlMnOpQrStUvWxYz1234567890abcdEfGhIjKlMnOp');"

🌐 Acessando o frontend
Na pasta do projeto, vá até "src/main/resources/static".

Localize o arquivo "login.html".

Clique duas vezes sobre o arquivo ou abra no navegador.

No formulário de login, informe seu "username" e sua "senha normal" (aquela senha que você digitou na classe "GeneratePassword", sem criptografia). A API faz a verificação automática com BCrypt.

💡 Observações Finais
O backend funciona com Spring Boot e banco de dados em memória H2, que é acessado via navegador.

O frontend é uma página HTML simples que realiza requisições para a API.

O cadastro de usuários é feito manualmente no console do banco H2, utilizando o comando SQL:
"INSERT INTO OWNERS (username, password) VALUES ('usuario', 'senhaCriptografada');"

As credenciais do banco podem ser alteradas a qualquer momento no arquivo "application.properties".
