package Lista02_Ex02;

public class Lampada {
	private String tipo,cor,marca;
	private int voltagem,potencia;
	private boolean status;
	
	public Lampada() {
	}

	public Lampada(String tipo, String cor, String marca, int voltagem, int potencia, boolean status) {
		
		this.tipo = tipo;
		this.cor = cor;
		this.marca = marca;
		this.voltagem = voltagem;
		this.potencia = potencia;
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Lampada [tipo=" + tipo + ", cor=" + cor + ", marca=" + marca + ", voltagem=" + voltagem + ", potencia="
				+ potencia + ", status=" + status + "]";
	}
	
	
	

}
