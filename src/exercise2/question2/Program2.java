package exercise2.question2;

public class Program2 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 0);

			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Can not divide 0");
		} finally {
			System.out.println("divide completed");
		}

	}

	private static float divide(int a, int b) {
		return a / b;
	}
}
