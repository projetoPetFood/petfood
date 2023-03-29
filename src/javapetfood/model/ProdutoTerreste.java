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
	
	
	
}
