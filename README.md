🛒 Gerenciador de Produtos em Java (com Exportação CSV)Aplicação console desenvolvida em Java para cadastro, gerenciamento e exportação de produtos. O projeto foi construído para demonstrar conceitos fundamentais de Orientação a Objetos (POO), manipulação de coleções em memória e gravação de arquivos CSV para integração com planilhas como Excel e Google Sheets.📌 FuncionalidadesCadastrar Produtos: Permite registrar produtos com nome, preço, marca e disponibilidade em estoque.Listar Produtos: Exibe todos os itens cadastrados formatados no console.Exportar para CSV: Gera um arquivo .csv utilizando ; como separador, garantindo compatibilidade com o Excel em formato numérico brasileiro.Menu Interativo: Interface simples no terminal baseada na classe Scanner.🛠️ Tecnologias UtilizadasLinguagem: Java (JDK 17 ou superior)Paradigma: Programação Orientada a Objetos (POO)Manipulação de Arquivos: java.io.BufferedWriter / java.io.FileWriterEstrutura de Dados: java.util.List / java.util.ArrayList📁 Estrutura do Projetogerenciador-produtos/
├── src/
│   ├── model/
│   │   └── Produto.java             # Entidade que representa o produto
│   ├── service/
│   │   └── GerenciadorProdutos.java # Regra de negócio e exportação I/O
│   └── Main.java                    # Ponto de entrada e menu console
├── produtos.csv                     # Arquivo gerado após exportação
└── README.md                        # Documentação do repositório
🚀 Como Executar o ProjetoPré-requisitosJava JDK 17 ou superior instalado.Terminal/Prompt de Comando ou uma IDE de sua preferência (VS Code, Eclipse, IntelliJ).Passo a Passo (Terminal)Clone o repositório:git clone https://github.com/seu-usuario/gerenciador-produtos-java.git
cd gerenciador-produtos-java
Compile as classes:javac -d bin src/model/*.java src/service/*.java src/Main.java
Execute a aplicação:java -cp bin Main
📊 Exemplo do Arquivo Gerado (produtos.csv)Após selecionar a opção de exportar no menu, o arquivo produtos.csv será criado com a seguinte estrutura:Nome;Preco;Marca;Estoque Disponivel
TV, Oled 54';3000,00;Samsung;Sim
Mouse Sem Fio;150,50;Logitech;Não
📑 Conceitos de Programação AplicadosEncapsulamento: Atributos privados na classe Produto acessados via getters.Tratamento de Exceções: Uso de blocos try-with-resources para fechamento automático de streams I/O (BufferedWriter).Formatação de Dados: Utilização de String.format() para padronizar valores monetários e saídas CSV.📝 LicençaEste projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.Desenvolvido por [Seu Nome] 👋🏼 Meu LinkedIn
