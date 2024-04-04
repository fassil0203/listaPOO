package Lista03_01;

import java.util.Scanner;

public class CanetaTesteVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caneta[] canetas = new Caneta[50];
		int opcoes, quantidadeCanetas = 0;
		do {
			System.out.println(
					"Digite uma das Opçoes :\n\t1-Cadastrar Caneta \n\t2-Exibir Todas as Canetas\n\t3-Exibir Quantidade de Canetas\n\"t4-Consultar Quantidade de Canetas conforme Cor\n\t0-Sair");
			opcoes = Integer.parseInt(sc.nextLine());
			switch (opcoes) {
			case 1:
				if (quantidadeCanetas >= 50) {
					System.out.println("JA Existem Muitas Canetas !!");
				} else {
					String marca, cor;
					int tamanho;
					System.out.println("Digite a Marca :");
					marca = sc.nextLine();
					System.out.println("Digite a Cor :");
					cor = sc.nextLine();
					System.out.println("Digite o Tamanho (Inteiros");
					tamanho = Integer.parseInt(sc.nextLine());
					canetas[quantidadeCanetas] = new Caneta(marca, cor, tamanho);
					quantidadeCanetas++;
				}
				break;
			case 2:
				for (int x = 0; x < quantidadeCanetas; x++) {
					System.out.println(canetas[x].toString());
				}
				break;
			case 3:
				System.out.println((quantidadeCanetas == 1) ? "Existe" + quantidadeCanetas + "Caneta Cadastrada "
						: "Existem " + quantidadeCanetas + " canetas cadastradas");
				break;

			case 4:
				String corProcurada;
				System.out.print("Digite a cor: ");
				corProcurada = sc.nextLine();
				for (int x = 0; x < quantidadeCanetas; x++) {
					if (corProcurada.equals(canetas[x].getCor())) {
						System.out.println(canetas[x].toString());
					}
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Você digitou a opção errada, tente novamente.");
			}
		} while (opcoes != 0);
	}

}

