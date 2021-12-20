# Mudi 
O Mudi tem como foco principal atender as demandas de compras no exterior, uma vez que seu principal proposíto é fazer o intermédio entre o usuário que está viajando e o usuário que gostaria de realizar uma compra no exterior. Ambos se alinham antes da compra e ao voltar de viagem é realizado realizado o envio da mercadoria. 


## O Projeto 
Repositório seguindo o curso 'Spring MVC: Crie um web app com Thymeleaf e Bootstrap' da Alura por Arthur Parahyba. 

Criado para entender mais sobre o funcionamento do framework Spring. 

Link do curso, para quem possa se interessar: https://cursos.alura.com.br/course/spring-mvc-thymeleaf-bootstrap.

## Instalação:
Para este projeto foi utilizado as seguintes tecnologias: 
    
    - Docker; 
    - Docker Compose;
    - Maven;
    - Java 11; 
    - Spring-boot;
    - Spring-security
    - git;
    - MariaDB;
    - Bootstrap;
    
Para iniciar a instalação, realizei um clone do repositório em algum repositório de sua máquina com o comando git clone.
```sh
git clone https://github.com/GussAlves/mudi-app
```

Após instalar em sua máquina, é necessário baixar as dependencias do projeto, para isso vamos utilizar o Maven, abra seu terminal e navegue até o reposítorio do projeto e rode o seguinte comando: 
```sh
mvn clean install
```
> Após rodar esse comando o maven deve baixar todas as dependências do projeito, em seguida você irá receber uma mensagem de _*BULD SUCCESS*_.

Para prosseguir temos que subir nosso banco de dados *MariaDB*, para isso vamos utilizar o docker-compose assim não vamos perder tempo configurando o banco de dados. Para começar vamos rodar o comando de start conforme apresentado abaixo: 
```sh
docker-compose up -d
```
> Ele irá subir o banco de dados MariaDb junto com um adiministrador, você pode consultar na url http://localhost:8081

> *Usuário: root | Senha: root*

Com o banco de dados operacional vamos iniciar nosso projeto em spring boot com o maven, podemos realizar essa ação com o comando: 
```sh
mvn spring-boot:run
```
> Após o maven subir nosso projeto vamos acessa-lo através da url http://localhost:8080/home . Se estiver tudo funcionando corretamente você vera a tela inicial do MUDI.

Parabéns!! :zap: Você finalizou a instalação!! :zap:

**Free Software, Hell Yeah!**
