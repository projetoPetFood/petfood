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

}
