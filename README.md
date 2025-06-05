🚗 API Lavacar - Guia de Instalação
✅ Pré-requisitos
Ter o Git instalado para clonar o repositório.

Ter o Java (JDK 17 ou superior) instalado.

Ter o Maven instalado.

Usar uma IDE como Visual Studio Code ou similar.

🔧 Extensões necessárias na IDE:
"Extension Pack for Java"

"Extension Pack for Java Auto Config"

"Lombok Annotations Support"

"Maven for Java"

"Spring Boot Extension Pack"

🚀 Passos para rodar a aplicação
Clone o repositório em sua máquina.

Abra o projeto na sua IDE.

Acesse o arquivo application.properties, localizado na pasta src/main/resources.

Se desejar, altere o usuário e a senha do banco H2 diretamente nesse arquivo.

Execute o projeto com a opção de rodar projetos Spring Boot da sua IDE ou utilizando Maven.

Acesse o console do H2 através do navegador no endereço "http://localhost:8080/h2-console".

Preencha os campos de conexão utilizando o usuário e senha configurados no arquivo application.properties.

🔑 Gerando usuário e senha no banco
No projeto, abra a classe chamada "GeneratePassword", que está localizada em "src/main/java/dev/ApiLavacar/Nego".

Execute essa classe, insira sua senha no terminal, e copie a senha gerada, que estará criptografada com BCrypt.

Acesse o console do H2 e insira o seguinte comando no campo de execução:
"INSERT INTO OWNERS (username, password) VALUES ('seuUsername', 'suaSenhaCriptografada')".

Substitua 'seuUsername' pelo nome de usuário que deseja usar e 'suaSenhaCriptografada' pela senha gerada no passo anterior.

🌐 Acessando o frontend
No projeto, acesse a pasta "src/main/resources/static".

Abra o arquivo "login.html" diretamente no seu navegador.

No formulário de login, preencha com seu "username" e a "senha normal" (sem criptografia — a verificação é feita pela API).

💡 Observações importantes
O backend foi desenvolvido com Spring Boot, utilizando o banco em memória H2.

O frontend é uma página HTML simples que se conecta diretamente com a API.

O cadastro de novos usuários deve ser feito manualmente no banco, utilizando o console do H2 e o comando SQL em formato "INSERT INTO OWNERS (username, password) VALUES ('usuario', 'senhaCriptografada')".

As configurações do banco podem ser alteradas facilmente no arquivo application.properties.
