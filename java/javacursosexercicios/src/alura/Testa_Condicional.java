package alura;

public class Testa_Condicional {
	
	public static void main(String[] args) {
		// se for maior de 18 anos pode  beber, caso não é proibido
		float idade=	18;
		int Quantidade_Pessoas = 3;
		//se idade for maior que 18 faça este laço
		if(idade>=18) {
			System.out.println("pode beber maior de idade");
			// se o grupo que for beber for maior que 2 pode entrar
		}else if(Quantidade_Pessoas>=2) {
			System.out.println("pode entra pois tem "
		+Quantidade_Pessoas +
					" para acompanhar");
		}else {
			System.out.println("nao pode beber"
					+ "nao esta acompanhado olha sua idade ="+idade);
		}
	}

}
