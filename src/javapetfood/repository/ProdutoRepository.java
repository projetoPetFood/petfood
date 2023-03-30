package javapetfood.repository;

import javapetfood.model.Produto;

public interface ProdutoRepository {
	
	public abstract void cadastrar (Produto produto);
	public abstract void listarTodos (); 
	public abstract void buscarPorCodigo (int codigo);
	public abstract void alterar (Produto produto);
	public abstract void deletar (int codigo);
	public abstract void entrarEstoque (int codigo, int quantidade);
	public abstract void sairEstoque (int codigo, int quantidade);	
}