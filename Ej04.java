package Boletin2;
import java.util.Scanner;
//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
public class Ej04 {
	private static Scanner nume;
	
public static void main(String[]args){
	int num=0,cont=0;
	nume =new Scanner(System.in);
	
	do{
		System.out.println("Ingresar numero :");
		num= nume.nextInt();
	    cont++;
		}while(num>0);
        System.out.println("El numero es negativo cant numeros ingresados :"+(cont));
}
}