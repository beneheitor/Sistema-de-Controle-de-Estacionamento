# 🚗 Sistema de Controle de Estacionamento

Sistema desenvolvido em **Java** para gerenciamento de estacionamento, permitindo o controle completo de veículos por meio de operações CRUD (Create, Read, Update e Delete), aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)** e manipulação de coleções utilizando **ArrayList**.

---

## 📋 Sobre o Projeto

O Sistema de Controle de Estacionamento foi criado com o objetivo de simular o gerenciamento de um estacionamento, permitindo o cadastro, consulta, atualização e remoção de veículos armazenados em memória.

Durante o desenvolvimento foram aplicados conceitos essenciais da linguagem Java, com foco em boas práticas de programação, organização do código e utilização dos pilares da orientação a objetos.

---

## 🎯 Objetivos

* Praticar os conceitos de Programação Orientada a Objetos.
* Implementar um CRUD completo em Java.
* Trabalhar com manipulação de coleções utilizando ArrayList.
* Simular um sistema real de gerenciamento de estacionamento.
* Desenvolver lógica de programação e organização de código.

---

## ⚙️ Funcionalidades

### 🚘 Cadastro de Veículos

Permite registrar veículos no sistema contendo informações como:

* Placa
* Modelo
* Marca

### 🔍 Consulta de Veículos

Permite buscar veículos cadastrados e visualizar seus dados.

### ✏️ Atualização de Dados

Possibilita alterar informações de veículos já cadastrados.

### ❌ Remoção de Veículos

Permite excluir registros do sistema.

### 📄 Listagem Completa

Exibe todos os veículos armazenados no estacionamento.

---

## 🧠 Conceitos Aplicados

### Programação Orientada a Objetos

O projeto utiliza os 4 pilares da POO:

#### 1. Encapsulamento

Proteção dos atributos das classes através de modificadores de acesso e métodos getters/setters.

#### 2. Herança

Reaproveitamento de código por meio da criação de classes derivadas.

#### 3. Polimorfismo

Permite diferentes comportamentos para métodos com o mesmo propósito.

#### 4. Abstração

Modelagem de entidades do mundo real através de classes e objetos.

---

## 📚 Estrutura de Dados

O armazenamento dos dados foi realizado utilizando:

```java
ArrayList
```

Principais operações realizadas:

* Adicionar elementos
* Buscar registros
* Atualizar informações
* Remover elementos
* Percorrer listas

---

## 🛠️ Tecnologias Utilizadas

* Java
---

## 📂 Estrutura do Projeto

```text
src/
│
├── model/
│   ├── Veiculo.java
│
├── service/
│   ├── EstacionamentoService.java
│
├── controller/
│   ├── SistemaController.java
│
└── Main.java
```

> A estrutura pode variar conforme a organização do projeto.

---

## ▶️ Como Executar

### Pré-requisitos

* Java JDK 8 ou superior
* IDE Java ou terminal

### Clonar o repositório

```bash
git clone https://github.com/beneheitor/Sistema-de-Controle-de-Estacionamento.git
```

### Acessar a pasta

```bash
cd Sistema-de-Controle-de-Estacionamento
```

### Compilar

```bash
javac Main.java
```

### Executar

```bash
java Main
```

---

## 💻 Exemplo de Uso

```text
===== SISTEMA DE ESTACIONAMENTO =====

1 - Cadastrar veículo
2 - Listar veículos
3 - Buscar veículo
4 - Atualizar veículo
5 - Remover veículo
6 - Sair

Escolha uma opção:
```

---

## 📈 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

* Estruturas de repetição
* Estruturas condicionais
* Manipulação de objetos
* Collections em Java
* Organização de código
* Boas práticas de POO
* Desenvolvimento de CRUD completo

---

## 🚀 Possíveis Melhorias Futuras

* Persistência de dados em banco de dados.
* Integração com MySQL ou PostgreSQL.
* Interface gráfica.
* Controle de vagas disponíveis.
* Cálculo automático de tempo de permanência.
* Geração de relatórios.
* Sistema de autenticação de usuários.

---

## 👨‍💻 Autor

**Heitor**
