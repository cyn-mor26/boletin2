package Boletin2;

import java.util.Scanner;

public class Ej01 {

	
	private static Scanner sc;

	public static void main(String[] args) {
		//Leer un n�mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n�mero negativo.
	
		sc = new Scanner(System.in);
		int num=0;
		
		System.out.println("Ingrese un numero : ");
		num= sc.nextInt();
		System.out.println("cuadrado es :"+(int)Math.pow(num,2) );
		
		while(num>0) {
			System.out.println("Ingrese un numero : ");
			
			num= sc.nextInt();
			System.out.println("cuadrado es :"+(int)Math.pow(num,2) );
		}
			if(num<0){
			System.out.println("Numero negativo ");

		
    
	
	
	}

}
}

