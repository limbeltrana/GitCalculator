
public class Subtraction extends Calculator {

	public Subtraction(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void operation() {
		double result = number1 - number2;
		System.out.println("Este es el resultado de la sustracci�n:" + result);
	}

}
