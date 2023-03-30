package javapetfood.model;

import java.time.LocalDate;

public abstract class Produto {
	
	private int tipo;
	private String nome;
	private int codigo;
	private float preco;
	private LocalDate dataValidade;
	private int quantidadeEstoque;
	
public Produto(int tipo, String nome, int codigo, float preco, LocalDate dataValidade, int quantidadeEstoque) {
	this.tipo = tipo;
	this.nome = nome;
	this.codigo = codigo;
	this.preco = preco;
	this.dataValidade = dataValidade;
	this.quantidadeEstoque = quantidadeEstoque;
	
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public float getPreco() {
	return preco;
}

public void setPreco(float preco) {
	this.preco = preco;
}

public LocalDate getDataValidade() {
	return dataValidade;
}

public void setDataValidade(LocalDate dataValidade) {
	this.dataValidade = dataValidade;
}

public int getQuantidadeEstoque() {
	return quantidadeEstoque;
}

public void setQuantidadeEstoque(int quantidadeEstoque) {
	this.quantidadeEstoque = quantidadeEstoque;
}

public void visualizar() {
	String tipo = "";
	switch(this.tipo) {
		case 1 -> tipo = "Terrestre";
		case 2 -> tipo = "Aves";
	}
	System.out.println("**********************************************");
	System.out.println("              DADOS DO PRODUTO	              ");
	System.out.println("**********************************************");
	System.out.println("Código do Produto: " + this.codigo);
	System.out.println("Nome do produto: " + this.nome);
	System.out.println("Tipo do Produto " + tipo);
	System.out.println("Preço do Produto: " + this.preco);
	System.out.println("Validade do Produto " + this.dataValidade);
	System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
	
}

}
