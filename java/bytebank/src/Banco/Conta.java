package Banco;
class Conta{
	double saldo;
	int agencia;
	int numero ;
	String titular;
	// this serve para referencia o atributo que tem na classe ta refenciando o atributo desta classe
	public void deposita (double valor) {
		this.saldo += valor; 
	}
	// método de retirar saldo da sua conta 
	public void sacar (double retirarda) {
		if (this.saldo>=2)
		this.saldo -= retirarda;
		else System.out.println("nao pode sacar");
			
	}
	
	public boolean sacando (double valor) {
		if (this.saldo>=1) {
			this.saldo -= valor;
			return true;
		}
		else return false;
			
	}
	
}