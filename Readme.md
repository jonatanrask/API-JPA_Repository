# Projeto Java web com Spring(JpaRepository)

<div style="display: inline_block"><br> 
  <img align="center" height="200" width="200" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
  <img align="center" height="200" width="200" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
</div>


## Descrição do projeto

Projeto de criação de uma API Rest usando JpaRepository possibilitando a consulta de itens e filtro e ordenação de conteudo.

## Dados do banco de dados
- Name
- Email
- Salary





## Exemplos de metodos GET
- sort
  - >"```sort=name``` "Organiza a lista em ordem alfabetica."
  - >"```sort=name,desc``` "Organiza a lista em ordem alfabetica contraria."
  - >"```sort=salary``` "Organiza a lista do menor salario ao maior."
  - >"```sort=salary,desc```` "Organiza a lista do maior salario ao menos."
  - >"```sort=name,salary``` "Organiza a lista em ordem alfabetica, caso haja nomes iguais, vai priorizar o com menor salario."

- search-salary
  - >"```search-salary?minSalary=``` "Busca um salario apartir de um valor minimo. 
  - >"```search-salary?maxSalary=``` "Faz uma busca até determinado valor."
  - >"```search-salary?minSalary=&maxSalary=``` "Faz uma busca entre dois valores."
- search-name
  - >"```search-name?name=``` "Busca um nome na especifico na lista" 


## Requisitos Recomendados
- JDK 11
- STS 4
