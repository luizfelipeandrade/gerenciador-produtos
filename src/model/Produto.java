package model;

public class Produto {
	private String nome;
	private double preco;
	private String marca;
	private boolean estoqueDisponivel;

	public Produto(String nome, double preco, String marca, boolean estoqueDisponivel) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getMarca() {
		return marca;
	}

	public boolean isEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public String toCsvRow() {
		String statusEstoque = estoqueDisponivel ? "Sim" : "Não";

		return String.format("%s;%.2f;%s;%s", nome, preco, marca, statusEstoque);
	}

	@Override
	public String toString() {
		return String.format("Produto: %s | Preço: R$ %.2f | Marca: %s | Em Estoque: %s", nome, preco, marca,
				estoqueDisponivel ? "Sim" : "Não");
	}
}