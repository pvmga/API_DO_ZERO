### DESAFIO
1. Primeiro projeto criado com react + bootstrap + Spring Boot + MySQL
2. https://www.youtube.com/watch?v=3WdRR0sfgzM&list=PLWXw8Gu52TRKouXUo3Abu33_ODPXZTz64&index=34

### INFORMAÇÕES IMPORTANTES

Ferramentas que necessitam estar instalas<br>
JDK<br>
NODE JS<br>
MYSQL <br>
VS Code -> XTENSION PACK FOR JAVA | SPRING BOOT EXTENSION PACK | MYSQL (Para gerenciar banco de dados) | Thunder Client (Para realizar requests em nossa API) | LOMBOKANNOTATIONS SUPPORT FOR VS CODE <br>
<br>
--------- Criar Projeto --------<br>
Para criar um projeto: View-> Command Pallet (Spring Initializr: Create a Maven project) <br>
Versão 2.7.0 ou superior.<br>
Linguagem: Java<br>
Nome: br.com.api<br>
Demonstrativo: produtos<br>
Packaging type: Jar<br>
Versão Java: 17<br>
<br>
--------- Choose dependencies<br>
-> Spring Boot DevTools (O módulo DevTools inclui ferramentas utilitárias no projeto, dentre elas a Automatic Restart, que reinicia o servidor automaticamente ao detectar alterações no código fonte da aplicação.)<br>
-> Spring Web<br>
MYSQL Driver SQL (Conectar com o banco de dados MySQL)<br>
-> Spring Data JPA (Módulo incluiso no Spring Boot para trabalhar com banco de dados, deixando as coisas mais fáceis. Por podrão o Spring Boot utiliza o Hibernate como implementação do JPA, mas se quiser consegue configurar outro.)<br>
-> Lombok developer (Não necessitar criar os setter e getter na mão)<br>
<br>

### PASSOS PARA INICIAR PROJETO
1. (main) Criar pastas e arquivos que irá gerenciar a aplicação (controle, modelo, repositorio e servico)
2. (main -> resources -> application.propertiess) Configurar conexão banco de dados.
3. (repositorio -> ProdutoRepositorio.java) Configurar o REPOSITÓRIO que é responsável por executar ações de banco de dados.
4. (controle -> ProdutoControle.java Rotas) Configurar controler para ter acesso a requisições (PUT, GET, DELETE E POST) e rotas
5. (modelo -> RespostaModelo.java) Implementar por classe modelo, responsável por caso haja sucesso ao cadastrar, selecionar, alterar.. ou erro
6. (servico -> ProdutoServico.java) Implementar a listagem de produtos na camada de serviços
7. A. (controle -> ProdutoControle.java) Implementar rota para LISTAR produtos
   B. (controle -> ProdutoControle.java) Implementar rota para CADASTRAR produtos
   C. (controle -> ProdutoControle.java) Implementar rota para ALTERAR produtos
   C. (controle -> ProdutoControle.java) Implementar rota para DELETE produtos
8. (servico -> ProdutoServico.java) Metodo para ALTERAR produtos.
9. (servico -> ProdutoServico.java) Metodo para REMOVER produtos.
10. (servico -> ProdutoServico.java) Configurar CORS.

### AULA 3
1. Criando tabela com o MySQL e conectando ao banco de dados (main -> resources -> application.propertiess).
2. Estrutura de desenvolvimento (main -> java)
3. Criar 4 pastas controle, modelo, repositorio e serviço
4. Dentro da pasta modelo, criar arquivo chamado ProdutoModelo.java onde será criado a tabela automaticamente com o Spring

### AULA 4
1. Criar arquivos em cada uma das suas pastas
2. controle -> ProdutoControle.java
3. servico -> ProdutoServico.java
4. repositorio -> ProdutoRepositorio.java (Repositório não é uma class e sim uma INTERFACE)
5. modelo -> RespostaModelo.java (Class responsável por problemas de requisições, cadastramento, alterações, exclusões e seleções)

### AULA 5 (Configurar o REPOSITÓRIO que é responsável por executar ações de banco de dados)
1. Irá criar o CrudRespository, para funcionar precisa de uma classe de modelo, para saber quais atributos ele estará mexendo.
2. Com essa interface configurada teremos acesso aos recursos de banco de dados.

### AULA 6 (Configurar controler para ter acesso a requisições (PUT, GET, DELETE E POST) e rotas)
1. pasta controle -> ProdutoControle.java Rotas.
2. Importanta acrescentar a Anotation @RestController para que o spring entenda que esse arquivo ficará responsável por criar rotas

### AULA 7 (Implementar por classe modelo, responsável por caso haja sucesso ao cadastrar, selecionar, alterar.. ou erro)
1. modelo -> RespostaModelo.java
2. Anotation @Component Injeção de depenencia para que o Spring fique responsável pela criação do objeto daquela class
3. Lombock @Getter @Setter

### AULA 8 (Implementar a listagem de produtos na camada de serviços)
1. servico -> ProdutoServico.java utilizar Anotation @Service
2. Iterable é como se fosse uma lista. Ele é o metodo que retorna o findAll() que é um método nativo do CrudRepository.

### AULA 9 (Implementar rota para listar todos os produtos que estão no banco de dados)
1. controle -> ProdutoControle.java
2. @GetMapping("/listar")

### AULA 10 (Implementar serviço para cadastrar produtos)
1. servico -> ProdutoServico.java

### AULA 11 (Rota para cadastrar produtos)
1. controle -> ProdutoControle.java

### AULA 12 (Metodo para alterar produtos)
1. servico -> ProdutoServico.java
2. @PostMapping("/cadastrar")

### AULA 13 (Rota para alterar produto)
1. controle -> ProdutoControle.java
2. @PutMapping("/alterar")

### AULA 14 e 15 (Serviço para remover produtos)
1. servico -> ProdutoServico.java
2. controle -> ProdutoControle.java
3. @DeleteMapping("/remover/{codigo})

### AULA 16 (Configurando CORS)
1. controle -> ProdutoControle.java
2. @CrossOrigin(origins = "*") Especificando as portas que terão acesso a nossa API