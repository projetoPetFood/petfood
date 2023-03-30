package javapetfood.repository;

import javapetfood.model.Produto;

public interface ProdutoRepository {
	
	public abstract boolean cadastrar (Produto produto);
	public abstract void listarTodos (); 
	public abstract void buscarPorCodigo (int codigo);
	public abstract boolean alterar (Produto produto);
	public abstract boolean deletar (Produto produto);
	public abstract void entrarEstoque (int codigo, int quantidade);
	public abstract void sairEstoque (int codigo, int quantidade);	
}