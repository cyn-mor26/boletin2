package Boletin2;

import java.util.Scanner;


public class Ej07 {
    
	private static Scanner sc;
	public static void main(String[] args) {
		//Pedir números hasta que se introduzca uno negativo, y calcular la media.
		
			 int num;
			 int suma=0;
			 int cont=0;
			 float media;
			 sc = new Scanner(System.in);

	        do {
	        	
	        	 System.out.println("Ingresa un numero");
	              num=sc.nextInt();
	              
	              if (num>0) {
					
				
	            	  suma=suma+num;
	 	        	 cont++;
	 	        	 
	              }else {
					System.out.println("ADIOS");
				}
	        	  
	        	

	        }while(num>0);
	        
	        media=suma/cont;
	        System.out.println("la suma es : "+suma);
	        System.out.println("la media es : "+media);
	          }
			

	}

