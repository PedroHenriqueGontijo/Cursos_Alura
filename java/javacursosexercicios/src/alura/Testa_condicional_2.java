package alura;

public class Testa_condicional_2 {

	public static void main(String[] args) {
		float idade=19;
		boolean qtdpessoas = true;
		boolean result = idade>=18; //podefazercomparacoes dentro do boolean
		int quantidadePessoas = 1;
			if(idade>=18 || quantidadePessoas>=3) {
				System.out.println("pode beber maior de idade");
			
				System.out.println("pode entra pois tem "
			+quantidadePessoas +
						" para acompanhar");
			}else {
				System.out.println("nao pode beber"
						+ "nao esta acompanhado olha sua idade ="+idade);
			}
			
			System.out.println(idade);
			System.out.println(qtdpessoas);
			if(idade>=18 && qtdpessoas==true) {
				System.out.println("pode entrar");
			}else {
				System.out.println("nao pode entrar");
			}
			System.out.println(result);
	}
}
