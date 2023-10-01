package Banco;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta); // mostrando o código do ponteiro da primeira conta 
		
		/*  vou fazer outro ponteiro apontando para a primeira conta
		 * 
		 * 
		 * 
		 * 
		 * */
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta); // mostrando o código do ponteiro da primeira conta que a segunda conta está se igualando
		System.out.println(segundaConta.saldo);
		boolean confirma;
		
		if(primeiraConta == segundaConta)
			confirma= true;
		else confirma = false;
		System.out.println(confirma);
	}

}
