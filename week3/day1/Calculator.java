package week3.day1;



public class Calculator {

	public void addOperation(int a, int b) {
		System.out.println(a + b);

	}

	public void addOperation(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void subOperation(double a, double b) {
		System.out.println(a - b);

	}

	public void subOperation(int a, int b) {

		System.out.println(a - b);

	}

	public void mulOperation(int a, double b) {
		System.out.println(a * b);

	}

	public void mulOperation(double a, double b) {
		System.out.println(a * b);

	}

	public static void main(String[] args) {

		Calculator operations = new Calculator();
		operations.addOperation(10, 20);
		operations.addOperation(10, 20, 30);
		operations.subOperation(2, 2);
		operations.subOperation(10, 20);
		operations.mulOperation(2, 2);
		operations.mulOperation(5, 5);
	}

}
