package Atividades1303;

 import java.util.Scanner;

public class atividadeclasse1004 {
    public static void main (String[] args) {
    	
    try (Scanner ler = new Scanner(System.in)) {
		System.out.println("Escolha um número entre 1 a 3");
		int numero = ler.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("O numero escolhido foi: 1.");
			break;
		case 2:
			System.out.println("O nunmero escolhido foi: 2.");
			break;
		case 3:
			System.out.println("O numero escolhido foi: 3.");
			break;
				
			default:
			 System.out.println("O numero escolhido é invalido! Digite um numero entre 1 e 3.");
					
			
 
				
				
				
		}
	}
    }
}