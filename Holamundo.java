import java.util.Scanner;
public class Holamundo {
 
	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;

		Scanner mensaje = new Scanner(System.in);
		
		//mostrar mensaje al usuario

		System.out.println("Introduce el primer numero:");

			num1 = mensaje.nextInt();

			//definir la variable num1 con lo introducido por teclado

		System.out.println("Introduce el segundo numero:");

			num2 = mensaje.nextInt();

			//definir la variable num2 con lo introducido por teclado

		num3 = num1 + num2;

		System.out.println();

		//espacio en blanco

		System.out.println("El resultado es: " + num3);
		
	}
 
}