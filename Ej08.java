package Boletin2;

import java.util.Scanner;

public class Ej08 {

	//Pedir un número N, y mostrar todos los números del 1 al N.
	private static Scanner sc;
	
	public static void main(String[] args) {
		int num=0, cont=0;
		cont=cont+1;
		sc= new Scanner(System.in);
		
		do{ 
			System.out.println("Ingrese numero "+(cont));	
			num= sc.nextInt();
			cont++;
		}while(num>0);
			System.out.println("FIN");	    	
		}


}

