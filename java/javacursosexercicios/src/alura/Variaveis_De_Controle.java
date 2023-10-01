package alura;

public class Variaveis_De_Controle {
	public static void main(String[] args) {
		System.out.println("bom dia ");
		float idade =23;
		int idade2 =33;
		idade2 *=44;
		System.out.println("=="+idade2);
		idade += 6;
		System.out.println(idade);
		idade *=6;
		System.out.println("a idade * 6 =="+idade);
	// variaveis 
		double b1=222.4;
		//int s1 = b1;
//	System.out.println(s1); variaveis com int nao aceita double
		// maneira correta 
		int s1 = (int)b1;
		System.out.println(s1); // mas o sesultado fica inteiro
		b1= (double)s1;
		System.out.println(b1);
//		long valorPequeno = 123456789;
	}
}
