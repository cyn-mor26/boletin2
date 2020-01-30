package Boletin2;

import java.util.Scanner;

public class Ej10 {

	

	public static void main(String[] args) {
		int num1=0,suma=0;
		//Pedir 15 números y escribir la suma total
		for (int num = 0; num<15 ; num++) {
		System.out.println("Ingresar numero "+(num+1));
		num1= new Scanner(System.in).nextInt();
			suma= suma+num1;
}
		
		System.out.println("Suma :"+suma);
}
}