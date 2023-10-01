package Banco;

public class CriarConta {
public static void main(String[] args) {
	Conta primeiraConta = new Conta(); // fazendo um ponteio para o objeto conta
	 primeiraConta.numero = 223;
	 primeiraConta.saldo = 1999;
	 System.out.println(primeiraConta.numero+"\n"
	 +primeiraConta.saldo);
	 
	 Conta segundaConta = new Conta();  // fazendo um ponteio para o objeto conta
	 segundaConta.saldo= 2000;    // pegando a segunda conta e colocando 2000 com atributo da classe conta

	 System.out.println("Segunda Conta \n "
	 +primeiraConta.saldo);
	 System.out.println(primeiraConta.agencia);
	 
	 
	 
	 boolean confirma;
		
		if(primeiraConta == segundaConta)
			confirma= true;
		else confirma = false;
		System.out.println(confirma);
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	 
	 
}
}
