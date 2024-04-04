package Lista02_Ex03;

import java.util.Scanner;



public class ApoliceTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o Nome :");
		String nome = sc.nextLine();
		System.out.println("Digite a Idade :");
		int idade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o Valor do Premio da Apolice :");
		double  valorApolice = Double.parseDouble(sc.nextLine());
		
		Apolice bacon = new Apolice(nome,idade,valorApolice);
	    bacon.imprimir();
		bacon.calcularValorApolice();
		
		System.out.println("Digite a Cidade: ");
		String cidade = sc.nextLine();
		bacon.ofertaDesconto(cidade);
		bacon.imprimir();
		sc.close();
		
		
	}

}
