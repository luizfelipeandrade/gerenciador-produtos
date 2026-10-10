package Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class GerenciadorProdutos {
	private List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	public void listarProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}
		System.out.println("\n--- Lista de Produtos ---");
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println((i + 1) + ". " + produtos.get(i));
		}
	}

	public void exportarParaCsv(String nomeArquivo) {
		if (produtos.isEmpty()) {
			System.out.println("A lista de produtos está vazia. Nada para exportar.");
			return;
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {

			writer.write("Nome;Preco;Marca;Estoque Disponivel");
			writer.newLine();

			for (Produto produto : produtos) {
				writer.write(produto.toCsvRow());
				writer.newLine();
			}

			System.out.println("\n[SUCESSO] Dados exportados para " + nomeArquivo + " com sucesso!");

		} catch (IOException e) {
			System.err.println("Erro ao exportar arquivo: " + e.getMessage());
		}
	}

	public boolean removerProduto(int indice) {
		if (produtos.isEmpty()) {
			System.out.println("A lista de produtos está vazia.");
			return false;
		}

		int posicaoReal = indice - 1;

		if (posicaoReal >= 0 && posicaoReal < produtos.size()) {
			Produto removido = produtos.remove(posicaoReal);
			System.out.println("Produto '" + removido.getNome() + "' removido com sucesso!");
			return true;
		} else {
			System.out.println("Número de produto inválido!");
			return false;
		}
	}
}