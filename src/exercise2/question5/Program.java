package exercise2.question5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		inputAge();
	}

	public static int inputAge() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Nhập tuổi vào");
			try {

				int age = Integer.parseInt(scanner.nextLine());

				if (age < 0) {
					throw new Exception("Wrong inputing! The age must be greater than 0, please input again");
				}
				return age;
			} catch (NumberFormatException e) {
				System.out.println("Wrong inputing! Please input an age as int, input again");
				continue;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}

	}

}
