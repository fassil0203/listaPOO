package Lista02_Ex01;

import java.util.Locale;

public class CanetaTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Caneta bic = new Caneta();
		
		bic.setCor("Verde");
		bic.setMarca("Pencil");	
		bic.setTamanho("Grande");
		
		System.out.println("A cor da Caneta é :" + bic.getCor());
		System.out.println("A Marca da Caneta é :" + bic.getMarca());
		System.out.println("O tamanho da Caneta é " + bic.getTamanho());

	}

}
