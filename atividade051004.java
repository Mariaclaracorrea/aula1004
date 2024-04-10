package Atividades1303;
import java.util.Scanner;
public class atividade051004 {
	

	public static void main(String[] args) {

		double a;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe um valor");
		a = ler.nextDouble();
		System.out.println(a % 5== 0 ? "o numero " + a + "é multiplo de 5" : "o numero" + a + " nao é multiplo de 5");
		ler.close();

	}


}