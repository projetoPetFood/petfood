package javapetfood;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String nome;
		
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     Pet  Food                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produtos                   ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por Código            ");
			System.out.println("            4 - Alterar Produto                      ");
			System.out.println("            5 - Deletar Produto                      ");
			System.out.println("            6 - Entrar no Estoque                    ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ") ;

			opcao = leia.nextInt();
			
			if(opcao == 8) {
				System.out.println("\nPet FOOD - O Sistema para Simplificar seus Negócios");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
				System.out.println("Cadastrar Produtos\n\n");
				
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				
				break;
			case 3:
				System.out.println("Buscar Produto por Código\n\n");
				
				break;
			case 4:
				System.out.println("Alterar Produto\n\n");
				
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");
				
				break;
			case 6:
				System.out.println("Entrar no Estoque\n\n");
				
				break;
			case 7:
				System.out.println("Entrar no Estoque\n\n");
				
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
	}
}
}
