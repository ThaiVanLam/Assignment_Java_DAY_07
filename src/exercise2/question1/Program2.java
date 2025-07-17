package exercise2.question1;

public class Program2 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 0);

			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Can not divide 0");
		}

	}

	private static float divide(int a, int b) {
		return a / b;
	}
}
