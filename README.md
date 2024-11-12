# Sistema de Gerenciamento de Tickets

Este é um projeto simples em Java para um sistema de gerenciamento de tickets. Ele permite que o usuário crie tickets descrevendo problemas e visualize informações sobre um ticket específico usando um ID exclusivo.

## Funcionalidades

- Adicionar um novo ticket com a descrição do problema.
- Visualizar os detalhes de um ticket por ID.
- Interface de texto simples para interação do usuário.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- `Main`: Classe principal que contém o menu interativo e permite ao usuário interagir com o sistema.
- `User`: Representa o usuário que cria tickets.
- `Ticket`: Representa um ticket de problema, contendo um ID exclusivo, descrição e o usuário que o criou.
- `TicketSystem`: Sistema que gerencia a criação e recuperação de tickets.

## Uso

1. Ao iniciar, você será solicitado a inserir seu nome.
2. Em seguida, você verá um menu com as seguintes opções:
    - **1. Adicionar ticket**: Permite adicionar um novo ticket, onde você pode descrever o problema.
    - **2. Ver ticket**: Permite visualizar um ticket específico, informando o ID.
    - **3. Sair**: Encerra o sistema.

## Exemplo de Uso

```
Digite seu nome: Maria
1. Adicionar ticket
2. Ver ticket
3. Sair
Escolha uma opção: 1
Digite a descrição do problema: Sistema travando ao iniciar.
Maria, ticket adicionado com ID: 1

Escolha uma opção: 2
Digite o ID do ticket: 1
Ticket ID: 1
Problema: Sistema travando ao iniciar.
Aberto por: Maria

Escolha uma opção: 3
Saindo...
```

## Tecnologias

- Linguagem: Java
- Biblioteca de entrada de dados: `Scanner`

## Melhorias Futuras

Algumas melhorias que podem ser implementadas neste projeto:

- Adicionar funcionalidades de atualização e exclusão de tickets.
- Salvar os tickets em um banco de dados ou arquivo para persistência de dados.
- Implementar autenticação de usuário para maior segurança.
