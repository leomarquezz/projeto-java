package ecommerce;

import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;


import dados.model.Dados;
import dados.model.Credito;
import dados.model.Pix;
import ecommerce.controller.EcommerceControler;

public class menu {
	
	EcommerceControler dados = new EcommerceControler();


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int  numero;
		String nome, email, produto = null, pagamento, tipo;
		float quantidade = 0, preco = 0;
		
		
		
		// teste PIX
		
		Pix px1 = new Pix (1, "A vista", 1, 0);
		px1.visualizar();
		
		
		
		
		
		int opcao1;
		
		while (true) {

			System.out.println("**************************************************** ");
			System.out.println("                Lojinha Guarulhense                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Produtos                             ");
			System.out.println("            3 - Formas de Pagamento                  ");
			System.out.println("            4 - Finalizar compra                     ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("	Entre com a opção desejada:                       ");
			System.out.println("                                                     "); 
			
			try {
				opcao1 = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao1 = 0;
			}

			if (opcao1 == 9) {
				System.out.println("\nObrigado por comprar conosco!");
				
				leia.close();
				System.exit(0);
			}

				
				
				
					System.out.println("Digite o produto:");
					produto = leia.next();
			
					System.out.println("\nDigite a quantidade: ");
					quantidade = leia.nextFloat();
					
					System.out.println("\nDigite a forma de pagamento: ");
					pagamento = leia.next();
			
				
				
				
		}
	}
}	
	

					
