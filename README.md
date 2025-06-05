Para iniciar a aplicação, primeiramente clone o repositorio
Instale as extensões necessárias (Extension Pack for Java, Extension Pack for Java Auto Config, Lombok Annotations, Maven for java, Spring Boot Extension Pack)
Opcional: Alterar username e password do H2, em application.propierties, em /main/resources
Inicie o programa com "mvn clean spring-boot:run"
Entre no console do H2 (localhost:8080/h2-console) com o username e password que configurou
Insira um username e password com "INSERT INTO OWNERS (username, password) VALUES (username, passwordWithBCrypt)" - BCrypt (Aplicação em /main/java/dev/ApiLavacar/Nego/GeneratePassword - Insira sua senha, e insira ela no H2 criptografada)
Rode o frontend (login.html) em /main/resources/static, insira seu username e password normal, sem criptografia
