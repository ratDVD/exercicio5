package entity;

public class ContaBancaria {

	private int numero;
	private String nome;
	private double deposito;
	
	public ContaBancaria(int numero, String nome, double deposito) {
		this.numero = numero;
		this.nome = nome;
		depositar(deposito);
	}
	
	public ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}

	public void depositar(double deposito) {
		this.deposito += deposito;
	}
	
	public void levantar(double deposito) {
		this.deposito -= deposito + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ numero
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", deposito);
	}
	
}
