package Boletin2;

public class Ej05 {

	public static void main(String[] args) {
		
		    private static Random ale;
		// Realizar un juego para adivinar un n�mero.
		//Para ello pedir un n�mero N, y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N.
				//El proceso termina cuando el usuario acierta.
		public static void main(String[] args) {
				ale= new Random();
				int numero=0 , secreto= ale.nextInt(50);
				int intentos= 0;
			    int apuesta = input("Adivina numero secreto entre 0 y 49");
				while (secreto !=apuesta) {
					intentos++;
				if (secreto >apuesta) {
					apuesta = input("numero muy alto intentalo de nuevo");
				}else {
				   apuesta =input("numero muy bajo intentalo de nuevo");
				   }
		}
			return 0;
		}
		}

	}

}
