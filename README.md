# 🧺 Laundry Manager

Sistema de gestão para lavanderias, desenvolvido com foco em simplicidade e eficiência. Permite o controle completo de clientes, peças, pedidos, pagamentos e geração de relatórios operacionais e financeiros.

## ✨ Funcionalidades

- Cadastro de clientes (nome, telefone, endereço)
- Cadastro de peças com múltiplas tabelas de preço
- Registro de pedidos com cálculo automático do valor total
- Registro de pagamentos (roll) com comprovante
- Geração de relatórios:
  - Entregas por período
  - Fechamento de caixa diário
  - Peças lavadas por período
  - Estoque (opcional)
  - Movimento analítico e sintético

## 🧑‍💻 Tecnologias Utilizadas

- Java (versão 17+ recomendada)
- [JPA/Hibernate ou JDBC] *(dependendo da implementação)*
- Banco de Dados: [PostgreSQL ou MySQL]
- Interface: [Swing, JavaFX ou Web MVC] *(dependendo do front-end escolhido)*

## 📁 Estrutura do Projeto

src/
├── model/ # Entidades do sistema
├── controller/ # Lógica de negócios
├── view/ # Interface com o usuário
└── utils/ # Utilitários e helpers


## 🚀 Como executar

1. Clone este repositório  
   `git clone https://github.com/seu-usuario/laundry-manager.git`

2. Importe o projeto na sua IDE (IntelliJ, Eclipse, etc.)

3. Configure o banco de dados com as credenciais corretas

4. Execute a aplicação

## 📌 Status do Projeto

🚧 Em desenvolvimento — projeto pessoal com fins de aprendizado prático em Java, modelagem de sistemas e boas práticas de arquitetura (MVC).

## 📄 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
