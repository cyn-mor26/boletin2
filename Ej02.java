package Boletin2;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		
	Scanner sc;
	
    //Leer un número e indicar si es positivo o negativo. 
    //El proceso se repetirá hasta que se introduzca un 0.
	
	int num=0 ;
	
    sc = new Scanner(System.in);
    
    
	
	 do {
		 System.out.println("ingrese un num");
		 num= sc.nextInt();
		 
		 if (num> 0) {
			 System.out.println("numero es positivo");
		}
		 else if (num<0) {
			 System.out.println("numero es negativo"); 
		 }
		 else 
			 System.out.println("STOP");
	} 
	 while (num!=0);
	 }

	}

	    

