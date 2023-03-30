package javapetfood.model;

import java.time.LocalDate;

public class ProdutoTerreste extends Produto {

	private int idade;
	private int porte;

	public ProdutoTerreste(int tipo, String nome, int codigo, float preco, LocalDate dataValidade,
			int quantidadeEstoque, int idade, int porte) {
		super(tipo, nome, codigo, preco, dataValidade, quantidadeEstoque);
		this.idade = idade;
		this.porte = porte;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public void visualizar() {
		String petIdade = "";
		switch (this.idade) {
		case 1 -> petIdade = "Filhote";
		case 2 -> petIdade = "Adulto";
		case 3 -> petIdade = "Idoso";
		}

		String petPorte = "";
		switch (this.porte) {
		case 1 -> petPorte = "Pequeno";
		case 2 -> petPorte = "Médio";
		case 3 -> petPorte = "Grande";

		}
		super.visualizar();
		System.out.println("Idade do seu PET" + petIdade);
		System.out.println("Porte do seu PET" + petPorte);

	}
}
