package Banco;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		contaDoPedro.saldo= .1;
		contaDoPedro.deposita(.1);
		System.out.println(contaDoPedro.saldo);
		
		// chamando o metodo de retirar saldo
		contaDoPedro.sacar(10);
		System.out.println(contaDoPedro.saldo);
		boolean verificar = contaDoPedro.sacando(1);
		System.out.println(contaDoPedro.saldo);
		System.out.println(verificar);
	}
	
	

}
