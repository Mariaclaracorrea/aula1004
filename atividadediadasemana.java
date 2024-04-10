package Atividades1303;

import java.util.Scanner;

public class atividadediadasemana {
	
	public static void main (System[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
			int dia;
			System.out.println("Informe o dia da semana: ");
			dia=ler.nextInt();
			
			switch (dia) {
			case 1:
			 System.out.println("O dia escolhido foi domingo");
			 break;
			case 2:
			 System.out.println("O dia escolhido foi segunda");
			 break;
			case 3:
			 System.out.println("O dia escolhido foi terça");
			 break;
			case 4:
			 System.out.println("O dia escolhido foi quarta");
			 break;
			case 5:
			 System.out.println("O dia escolhido foi quinta");
			 break;
			case 6:
			 System.out.println(" O dia escolhido foi exta");
			 break;
			default:
				System.out.println ("valor do dia é invalido");
			
			
			
			}
		}
		
		
		
		
		
	}
	
	

}
