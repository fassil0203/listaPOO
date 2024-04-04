package Lista02_Ex03;

public class Apolice {
	private String nome;
	private int idade;
	private double valorApolice;
	
	public Apolice() {
	
	}

	public Apolice(String nome, int idade, double valorApolice) {
		
		this.nome = nome;
		this.idade = idade;
		this.valorApolice = valorApolice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getValorApolice() {
		return valorApolice;
	}

	public void setValorapolice(double valorApolice) {
		this.valorApolice = valorApolice;
	}

	@Override
	public String toString() {
		return "Apolice [nome=" + nome + ", idade=" + idade + ", valorApolice=" + valorApolice + "]";
	}

	public void imprimir() {
		//System.out.println("O valor da Apolice sera de  R$: " + valorApolice);
		System.out.println("Apólice:\n\tNome do Segurado: "+this.nome+"\n\tIdade do Segurado: "+this.idade+"\n\tValor do Premio da Apólice: "+valorApolice);
	}

	public void calcularValorApolice() {
		if(idade>=18&idade<=25)valorApolice+=(valorApolice*20)/100;
		else if(idade>25&idade<=36)valorApolice+=(valorApolice*15)/100;
		else if(idade>36) valorApolice+=(valorApolice*10)/100;

	}

	public void ofertaDesconto(String cidade) {
		switch (cidade) {
		case "Rio de Janeiro":
			valorApolice -= valorApolice * 0.15;
			break;
		case "Sao Paulo":
			valorApolice -= valorApolice * 0.1;
			break;
		case "Belo Horizonte":
			valorApolice-=valorApolice*0.05;
			break;
		default:

		}
	
	}
}

