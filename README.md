# Sistema de Gestão Acadêmica 🎓

Um sistema de gerenciamento universitário desenvolvido em Java, focado na aplicação prática dos pilares da Orientação a Objetos. Este projeto foi construído para demonstrar a estruturação de entidades acadêmicas e suas relações.

## 🚀 Funcionalidades

O sistema permite a gestão básica de uma universidade através de operações no terminal, incluindo:
* Cadastro de Professores, Alunos e Cursos.
* Criação de Disciplinas e alocação de professores responsáveis.
* Matrícula de alunos em múltiplas disciplinas.
* Listagem de dados centralizada (Universidade) e específica (Disciplinas de um curso ou de um aluno).
* Sistema de autenticação por senha para alunos e professores.

## 🧠 Conceitos de POO Aplicados

Este projeto implementa estritamente os seguintes conceitos:
* **Classes e Objetos:** Estrutura base de todas as entidades do sistema.
* **Encapsulamento:** Proteção de dados com modificadores `private` e acesso via `getters/setters`.
* **Classe Abstrata e Herança:** A classe base `Pessoa` servindo de molde para `Aluno` e `Professor`.
* **Interfaces:** Contrato `Autenticavel` assinado por entidades que exigem validação de acesso.
* **Agregação:** Relação independente entre `Professor` e `Disciplina`.
* **Composição:** Relação de dependência onde o `Curso` gerencia suas próprias `Disciplinas`.
* **Polimorfismo:** Tratamento dinâmico de diferentes objetos (`Aluno` e `Professor`) através de uma mesma referência genérica (`Pessoa`).

## 🛠️ Tecnologias Utilizadas

* **Java** (JDK 17+)
* **IntelliJ IDEA**

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/sistema-gestao-academica.git](https://github.com/seu-usuario/sistema-gestao-academica.git)
2. Abra o projeto na sua IDE de preferência.

3. Navegue até o pacote principal e execute o arquivo Main.java.

4. O console exibirá a criação das entidades, matrículas, testes de autenticação e a demonstração do polimorfismo.