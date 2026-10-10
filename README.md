# 📦 Gerenciador de Produtos em Java

Projeto desenvolvido em **Java** com o objetivo de cadastrar, listar, **remover** e exportar informações de produtos para um arquivo no formato **CSV** (compatível com Excel e Google Planilhas).

Este projeto faz parte do meu portfólio de estudos e demonstra a aplicação prática dos conceitos fundamentais de Programação Orientada a Objetos (POO) e manipulação de arquivos (`java.io`).

---

## 🚀 Funcionalidades

- **Cadastrar Produto:** Permite inserir nome, preço, marca e disponibilidade em estoque (Sim/Não).
- **Listar Produtos:** Exibe todos os produtos cadastrados na memória com seus respectivos índices.
- **Remover Produto:** Permite excluir um produto da lista informando o seu número correspondente.
- **Exportar para CSV:** Gera automaticamente o arquivo `produtos.csv` formatado para abertura em planilhas (usando `;` como separador).

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java (JDK 17+)
- **Orientação a Objetos:** Encapsulamento, Abstração e Sobrescrita de Métodos (`toString`).
- **Coleções:** `ArrayList` para manipulação dinâmica de dados em memória.
- **Manipulação de Arquivos:** `FileWriter` e `BufferedWriter` para persistência dos dados em disco.
- **Entrada de Dados:** `Scanner` para interação via terminal.

---

## 📁 Estrutura do Projeto

```text
gerenciador-produtos/
├── src/
│   ├── model/
│   │   └── Produto.java             # Classe modelo do produto
│   ├── service/
│   │   └── GerenciadorProdutos.java # Regras de negócio (adicionar, listar, remover e exportar)
│   └── Main.java                    # Menu interativo via terminal
└── produtos.csv                     # Arquivo gerado automaticamente após a exportação
```

---

## 🖥️ Como Executar o Projeto

### Pré-requisitos
- Java Development Kit (JDK) 17 ou superior instalado.
- IDE de sua preferência (Eclipse, VS Code, IntelliJ) ou Terminal.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/gerenciador-produtos.git
   ```

2. **Navegue até o diretório do projeto:**
   ```bash
   cd gerenciador-produtos
   ```

3. **Execute a aplicação:**
   - Se estiver usando uma IDE (como **Eclipse** ou **VS Code**), abra a pasta do projeto e execute o arquivo `Main.java`.
   - Se preferir o **Terminal**:
     ```bash
     javac -d bin src/model/*.java src/service/*.java src/Main.java
     java -cp bin Main
     ```

---

## 📊 Exemplo de Arquivo CSV Gerado (`produtos.csv`)

Ao selecionar a opção de exportação no menu, o programa salva o arquivo no seguinte formato:

```csv
Nome;Preco;Marca;Estoque Disponivel
TV, Oled 54';3000,00;Samsung;Sim
Monitor Gamer 27';1450,50;LG;Não
```

---

## ✒️ Autor

Desenvolvido por Luiz Felipe Andrade como parte da evolução dos estudos de programação Java.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/lfandrade/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/luizfelipeandrade)
