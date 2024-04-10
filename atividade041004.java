package Atividades1303;

import java.util.Scanner;

public class atividade041004 {
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	double nota1,nota2,nota3,nota4,media;

	System.out.println("informe primeira nota");
	nota1 = ler.nextDouble();

	System.out.println("informe segunda nota");
	nota2 = ler.nextDouble();

	System.out.println("informe terceira nota");
	nota3 = ler.nextDouble();

	System.out.println("informe quarta nota");
	nota4 = ler.nextDouble();

	media = (nota1+nota2+nota3+nota4)/4;
	
	System.out.println(media>= 6 ? "aprovado" + media : "reprovado" + media);
	ler.close();

}
}
