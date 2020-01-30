package Boletin2;

import java.util.Scanner;

public class Ej06 {

	private static Scanner sc;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	int num=0,cont= 0, suma=0;
	sc = new Scanner(System.in);

	do{
		System.out.println("Ingresar numero :");
		num = sc.nextInt();
		cont++;
		suma= suma+num;
		}while(num>0);
		System.out.println("la suma de los numeros es :"+suma);
		
	}

}
