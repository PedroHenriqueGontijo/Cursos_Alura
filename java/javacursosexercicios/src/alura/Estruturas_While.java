package alura;

public class Estruturas_While {
		
	public static void main(String[] args) {
		
		int a=0,b=2;
		
		while (a<10) {
			a++;
			b*=a;
			System.out.println("2+"+a+"="+b);			
		}
		int contador =0;
		int total =0;
		while (contador<=10) { // aqui nao e um  laco de repeticao pode utilizar a variavel ainda
			//fora do escopo
			total+= contador;
			System.out.println(total);
			contador++;
		}
			  
	}

}