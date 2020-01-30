package Boletin2;

import java.util.Scanner;

public class Ej03 {

	private static Scanner sc;

	public static void main(String[] args) {
		
//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		int num = 0;
		
        
        sc = new Scanner(System.in);
        
		for (int i = num; i<= 0 ; i++) {
			num= sc.nextInt();
		if (num % 2<= 0) {
		    System.out.println(" es par");
		    num= sc.nextInt();
			}
			 else if (num % 2<=1) {
				 System.out.println("no es par"); 
			 }
			 }
		}
	}
