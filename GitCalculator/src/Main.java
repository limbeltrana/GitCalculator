import java.util.Scanner;

public class Main {
	public static int option;
	public static int number1;
	public static int number2;
	public static void main(String[] args) {
		
		 messageToUser();
		 while (option > 4) {
			 System.out.println("por favor ingresa una opcion v�lida");
			 messageToUser();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Ahora por favor ingresa el primer n�mero de tu operaci�n");
	     number1 = sc.nextInt();
		System.out.println("Ahora por favor ingresa el primer n�mero de tu operaci�n");
		 number2 = sc.nextInt();
		 
		switch (option) {
		case 1:
			Addition addition = new Addition(number1, number2);
			addition.operation();
			break;
		case 2:
			Subtraction subtraction = new Subtraction(number1, number2);
			subtraction.operation();
			break;
		case 3:
			Multiplication multiplication = new Multiplication(number1, number2);
			multiplication.operation();
			break;
		case 4:
			Division division = new Division(number1, number2);
			division.operation(); 
			break;
		default:
			
			messageToUser();
			break;
		}

	}

	private static void messageToUser() {
		// TODO Auto-generated method stub
		System.out.println("Esto es una calculadora, por favor ingresa el n�mero de la operaci�n que deseas realizar:\n"
				+ "1. Suma\n" +"2, Resta\n" +"3. Multiplicaci�n\n" +"4. Divisi�n");	
		
		Scanner sc = new Scanner(System.in);
		 option = sc.nextInt();
	}

}
