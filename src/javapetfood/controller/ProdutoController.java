package javapetfood.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import javapetfood.model.Produto;
import javapetfood.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	LocalDate dataAtual = LocalDate.now();
	int codigo = 0;

	@Override
	public void cadastrar(Produto produto) {
		if (listaProdutos.add(produto)) {
			System.out.println("\nO produto de código " + produto.getCodigo() +  " foi cadastrado com sucesso!");
		}
		else {
			System.out.println("\nO cadastramento do produto de código " + produto.getCodigo() + " falhou!");
		}
	}

	@Override
	public void listarTodos() {
		listaProdutos.forEach(produto -> {
			produto.visualizar();
			if (produto.getQuantidadeEstoque() == 0) {
				System.out.println("PRODUTO FORA DE ESTOQUE!");
			}
			if (produto.getDataValidade().compareTo(dataAtual) < 0) {
				System.out.println("PRODUTO FORA DA VALIDADE!");
			}
		});
	}

	@Override
	public void buscarPorCodigo(int codigo) {
		Produto produto = buscarNaLista(codigo);
		
		if (produto != null) {
			produto.visualizar();
			if (produto.getQuantidadeEstoque() == 0) {
				System.out.println("PRODUTO FORA DE ESTOQUE!");
			}
			if (produto.getDataValidade().compareTo(dataAtual) < 0) {
				System.out.println("PRODUTO FORA DA VALIDADE!");
			}
		}
		else {
			System.out.println("\nO produto de código " + codigo + " não foi encontrado!");
		}
	}

	@Override
	public void alterar(Produto produto) {
		Produto produtoParaAlterar = buscarNaLista(produto.getCodigo());
		
		if (produtoParaAlterar != null) {
			listaProdutos.set(listaProdutos.indexOf(produtoParaAlterar), produto);
			System.out.println("\nOs dados do produto de código " + produto.getCodigo() + " foram alterados com sucesso!");
		}
		else {
			System.out.println("\nO produto de código " + produto.getCodigo() + " não foi encontrado para ser alterado!");
		}
	}

	@Override
	public void deletar(int codigo) {
		Produto produto = buscarNaLista(codigo);
		
		if (produto != null) {
			if (listaProdutos.remove(produto)) {
				System.out.println("\nO produto de código " + codigo + " foi excluído com sucesso!");
			}
			else {
				System.out.println("\nA exclusão do produto de código " + codigo + " falhou");
			}
		}
		else {
			System.out.println("\nO produto de código " + codigo + " não foi encontrado!");
		}
	}

	@Override
	public void entrarEstoque(int codigo, int quantidade) {
		Produto produto = buscarNaLista(codigo);
		
		if (produto != null) {
			produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidade);
			System.out.println("\nA quantidade " + quantidade + " solicitada foi adicionada ao estoque do produto de código " + codigo + "!");
		}
		else {
			System.out.println("\nO produto de código " + codigo + " não foi encontrado!");
		}
	}

	@Override
	public void sairEstoque(int codigo, int quantidade) {
		Produto produto = buscarNaLista(codigo);
		
		if (produto != null) {
			if (produto.getQuantidadeEstoque() >= quantidade) {
				produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
				System.out.println("\nA quantidade " + quantidade + " solicitada foi removida do estoque do produto de código " + codigo + "!");
			}
			else {
				System.out.println("\nA quantidade em estoque do produto de código " + codigo + " é insuficiente!");
			}
		}
		else {
			System.out.println("\nO produto de código " + codigo + " não foi encontrado!");
		}
	}
	
	// Métodos de auxílio
	public Produto buscarNaLista(int codigo) {
		for (var produto: listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}
	
	public int gerarCodigo() {
		return ++codigo;
	}
}
