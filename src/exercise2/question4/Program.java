package exercise2.question4;

import exercise2.question4.entity.Department;

public class Program {

	public static void main(String[] args) {

		Department department1 = new Department();
		Department department2 = new Department();
		Department department3 = new Department();

		Department[] departments = new Department[] { department1, department2, department3 };

		try {
			System.out.println(departments[10]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("quá giới hạn của mảng");
		}

	}

}
