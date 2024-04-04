package Lista02_Ex02;

import java.util.Locale;

public class LampadaTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Lampada lampada = new Lampada();
		Lampada lampadaAzul = new Lampada("Led","Azul","Osram",220,65,true);
		
		lampada.setCor("Azul");
		
		
		
		System.out.println(lampadaAzul);
		System.out.println(lampada.getCor());
		

	}

}
