package javapetfood;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import javapetfood.controller.ProdutoController;
import javapetfood.model.Produto;
import javapetfood.model.ProdutoAves;
import javapetfood.model.ProdutoTerrestre;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int especie, codigo,  idade, porte, estoque, tipo, opcao = 0, quantidade;
		float preco;
		LocalDate vencimento;
		String nome, data;
		
		ProdutoController produtos = new ProdutoController();
		
		LocalDate data1 = LocalDate.parse("2023-03-10");
		ProdutoTerrestre produto1 = new ProdutoTerrestre(1, "Sachê", produtos.gerarCodigo(), 10.0f, data1, 10, 1, 1);
		produtos.cadastrar(produto1);
		LocalDate data2 = LocalDate.parse("2023-04-10");
		ProdutoTerrestre produto2 = new ProdutoTerrestre(1, "Ração Cachorro", produtos.gerarCodigo(), 10.0f, data2, 10, 2, 2);
		produtos.cadastrar(produto2);
		LocalDate data3 = LocalDate.parse("2023-03-20");
		ProdutoAves produto3 = new ProdutoAves(2, "Girassol", produtos.gerarCodigo(), 10.0f, data3, 0, 1);
		produtos.cadastrar(produto3);
		LocalDate data4 = LocalDate.parse("2023-03-30");
		ProdutoAves produto4 = new ProdutoAves(2, "Sementes Variadas", produtos.gerarCodigo(), 10.0f, data4, 10, 1);
		produtos.cadastrar(produto4);
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("*                       ,_,                         *") ;
			System.out.println("*                      (O,O)                        *") ;
			System.out.println("*                      (   )                        *") ;
			System.out.println("*    ,-.___,-.         -\"-\"-                        *");
			System.out.println("*    \\_/_ _\\_/                       /\\_/\\          *");
			System.out.println("*      )O_O(        Pet  Food       ( o.o )         *");
			System.out.println("*     { (_) }                        > ^ <          *");
			System.out.println("*      `-^-'                                        *");
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*           1 - Cadastrar Produtos                  *");
			System.out.println("*           2 - Listar Todos os Produtos            *");
			System.out.println("*           3 - Buscar Produto por Código           *");
			System.out.println("*           4 - Alterar Descrição de Produtos       *");
			System.out.println("*           5 - Deletar Produtos                    *");
			System.out.println("*           6 - Entrada de Estoque                  *");
			System.out.println("*           7 - Saída de Estoque                    *");
			System.out.println("*           8 - Sair                                *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ") ;

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			
			if(opcao == 8) {
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println("Cadastrar Produtos\n\n");
					
					System.out.println("Digite o Nome do Produto: ");
					leia.nextLine();
					nome = leia.nextLine();
					System.out.println("Digite o Tipo do Produto: (1- Terrestres/2- Aves) ");
					tipo = leia.nextInt();
					System.out.println("Digite o Preço Unitário dos Produtos: ");
					preco = leia.nextFloat();
					System.out.println("Digite a Data de Vencimento: (yyyy-MM-dd)");
					leia.nextLine();
					data = leia.nextLine();
					vencimento = LocalDate.parse(data);
					System.out.println("Digite a Quantidade em Estoque: ");
					estoque = leia.nextInt();
					
					switch (tipo) {
						case 1:
							System.out.println("Digite a Idade do Animal: (1- Filhote/2- Adulto/3- Idoso)");		
							idade = leia.nextInt();
							System.out.println("Digite o Porte do Animal: (1- Pequeno/2- Médio/3- Grande)");
							porte = leia.nextInt();
							
							produtos.cadastrar(new ProdutoTerrestre(tipo, nome, produtos.gerarCodigo(), preco, vencimento, estoque, idade, porte));
							
							break;
						case 2:
							System.out.println("Digite a Espécie do Animal: (1- Doméstica/2- Silvestre/3- Exótica)");
							especie = leia.nextInt();
							
							produtos.cadastrar(new ProdutoAves(tipo, nome, produtos.gerarCodigo(), preco, vencimento, estoque, especie));
							
							break;
					}
					
					keyPress();
					break;
				case 2:
					System.out.println("Listar Todos os Produtos\n\n");
					produtos.listarTodos();
					
					keyPress();
					break;
				case 3:
					System.out.println("Buscar Produto por Código\n\n");
					System.out.println("Digite o Código do Produto: ");
					codigo = leia.nextInt();
					
					produtos.buscarPorCodigo(codigo);
					
					keyPress();
					break;
				case 4:
					System.out.println("Alterar Descrição de Produtos\n\n");
					System.out.println("Digite o Código do Produto: ");
					codigo = leia.nextInt();
					
					Produto produto = produtos.buscarNaLista(codigo); 
					
					System.out.println("Digite o Nome do Produto: ");
					leia.nextLine();
					nome = leia.nextLine();
					System.out.println("Digite o Preço do Produto: ");
					preco = leia.nextFloat();
					System.out.println("Digite a Data de Vencimento: (yyyy-MM-dd)");
					leia.nextLine();
					data = leia.nextLine();
					vencimento = LocalDate.parse(data);
					System.out.println("Digite a Quantidade em Estoque: ");
					estoque = leia.nextInt();
					
					switch (produto.getTipo()) {
						case 1:
							System.out.println("Digite a Idade do Animal: (1- Filhote/2- Adulto/3- Idoso)");		
							idade = leia.nextInt();
							System.out.println("Digite o Porte do Animal: (1- Pequeno/2- Médio/3- Grande)");
							porte = leia.nextInt();
							
							produtos.alterar(new ProdutoTerrestre(produto.getTipo(), nome, codigo, preco, vencimento, estoque, idade, porte));
							
							break;
						case 2:
							System.out.println("Digite a Espécie do Animal: (1- Doméstica/2- Silvestre/3- Exótica)");
							especie = leia.nextInt();
							
							produtos.alterar(new ProdutoAves(produto.getTipo(), nome, codigo, preco, vencimento, estoque, especie));
							
							break;
					}
					
					keyPress();
					break;
				case 5:
					System.out.println("Deletar Produto\n\n");
					
					System.out.println("Digite o Código do Produto: ");
					codigo = leia.nextInt();
					
					produtos.deletar(codigo);
					
					keyPress();
					break;
				case 6:
					System.out.println("Entrada no Estoque\n\n");
					System.out.println("Digite o Código do Produto: ");
					codigo = leia.nextInt();
					System.out.println("Digite a Quantidade de Entrada de Estoque: ");
					quantidade = leia.nextInt();
					
					
					produtos.entrarEstoque(codigo, quantidade);
					
					keyPress();
					break;
				case 7:
					System.out.println("Saída de Estoque\n\n");
					System.out.println("Digite o Código do Produto: ");
					codigo = leia.nextInt();
					System.out.println("Digite a Quantidade de Saída de Estoque: ");
					quantidade = leia.nextInt();
					
					produtos.sairEstoque(codigo, quantidade);
					
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}


	private static void keyPress() {
		try {
			System.out.println("Pressione a tecla Enter para continuar...");
			System.in.read();
		}catch (IOException e) {
			System.out.println("Opção Inválida!");
		}

	}

	public static void sobre(){
		System.out.println("\n  Pet FOOD - O Sistema para Simplificar seus Negócios  ");
		System.out.println("    Beatriz Seraphim - Gabriel Machado - Heimy Dias    ");
		System.out.println("     Laís Sales - Marcos Vinícius - Mariana Rocato     ");
		System.out.println("          https://github.com/projetoPetFood            ");
		System.out.println("*********************************************************");
	}
}
