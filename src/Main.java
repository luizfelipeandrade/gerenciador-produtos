import java.util.Scanner;

import Service.GerenciadorProdutos;
import model.Produto;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GerenciadorProdutos gerenciador = new GerenciadorProdutos();
		boolean executando = true;

		while (executando) {
			System.out.println("\n=== GERENCIADOR DE PRODUTOS ===");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Exportar para CSV");
			System.out.println("4. Remover Produto");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer

			switch (opcao) {
			case 1:
				System.out.print("Nome do Produto (ex: TV, Oled 54'): ");
				String nome = scanner.nextLine();

				System.out.print("Preço (ex: 3000,00): ");
				double preco = scanner.nextDouble();
				scanner.nextLine();

				System.out.print("Marca (ex: Samsung): ");
				String marca = scanner.nextLine();

				System.out.print("Tem em estoque? (S/N): ");
				String estoqueInput = scanner.nextLine().trim();
				boolean emEstoque = estoqueInput.equalsIgnoreCase("S");

				Produto novoProduto = new Produto(nome, preco, marca, emEstoque);
				gerenciador.adicionarProduto(novoProduto);
				break;

			case 2:
				gerenciador.listarProdutos();
				break;

			case 3:
				gerenciador.exportarParaCsv("produtos.csv");
				break;

			case 4:

				gerenciador.listarProdutos();
				System.out.print("\nDigite o número do produto que deseja remover: ");
				int numeroRemover = scanner.nextInt();
				scanner.nextLine();

				gerenciador.removerProduto(numeroRemover);
				break;

			case 0:
				executando = false;
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		}

		scanner.close();
	}
}