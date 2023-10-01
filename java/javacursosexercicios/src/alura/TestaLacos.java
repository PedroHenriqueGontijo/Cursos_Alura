package alura;

public class TestaLacos {
	
	public static void main(String[] args) {
		int c=0;
		for (int a=0; a<=10;a++ ){
			
			for(int b=0;b<=10;b++){
				c=a*b;
				System.out.println(a+"*"+b+"="+c);	
			}	
			System.out.println();
		}
	}
	
	
}
