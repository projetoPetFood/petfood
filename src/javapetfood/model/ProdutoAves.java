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
	

}
