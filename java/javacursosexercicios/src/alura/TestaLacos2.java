package alura;

public class TestaLacos2 {

	public static void main(String[] args) {
		
		// um triângulo com *
		/*l1 = linha
		 * c1= colunas
		 * para linha =0; kinha menor que 10; soma mais um na linha
		 * faça o seguinte
		 * para coluna igual a 0; coluna menor ou igual que linha; faça o seguinte;
		 * mostre * fecha o laço for dos dois c1
		 * e dá um espaço
		 * fecha laço l1
		 * */
		for(int cc=0;cc<2;cc++) {
			for(int l1=0;l1<10;l1++) {
				for(int c1=0;c1<=l1;c1++) {
					
				
				System.out.print("*");
				}
			
			System.out.println();
		}
			System.out.println();
		}
	}
}
