package javapetfood.model;

import java.time.LocalDate;

public class ProdutoAves extends Produto {
	
	private int especies;

	public ProdutoAves(int tipo, String nome, int codigo, float preco, LocalDate dataValidade, int quantidadeEstoque,
			int especies) {
		super(tipo, nome, codigo, preco, dataValidade, quantidadeEstoque);
		this.especies = especies;
	}

	public int getEspecies() {
		return especies;
	}

	public void setEspecies(int especies) {
		this.especies = especies;
	}
	
	public void visualizar () {
		String especie = "";
		switch(this.especies) {
			case 1 -> especie = "Doméstica";
			case 2 -> especie = "Silvestre";
			case 3 -> especie = "Exótica";
		}
		
		super.visualizar();
		System.out.println("Espécies: " + especie);
	}

}
