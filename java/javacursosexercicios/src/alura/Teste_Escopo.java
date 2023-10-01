package alura;

public class Teste_Escopo {
	
	public static void main(String[] args) {
		
		int Quantidade_Pessoas=3 ,idade =17;
		boolean acompanhado; //antes de utulizar o boolean temq ue ser inicializado pra printar
		/*
		 * cuidado inicializar primeiro o boolean primeiro
		 * 
		 * 
		 * */
		if (Quantidade_Pessoas>=2 && idade >=18) {
			acompanhado= true;
		}else {
			acompanhado= false;
		}
		System.out.println("resultado se ta acompanhado =="+acompanhado);
	}
 // para ter resultado na condição if tem que ter 3 e 18
}
