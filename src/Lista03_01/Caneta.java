package Lista03_01;

public class Caneta {
	private String marca,cor;
	int tamanho;


	public Caneta() {
	}


	public Caneta(String marca, String cor, int tamanho) {
		
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	@Override
	public String toString() {
		return "Caneta [marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho + "]";
	}
	
	
}


