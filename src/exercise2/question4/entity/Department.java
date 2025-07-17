package exercise2.question4.entity;

import java.util.Scanner;

public class Department {
	public static int COUNT;
	private Scanner scanner;

	private int id;
	private String name;

	public Department() {
		super();
		scanner = new Scanner(System.in);
		COUNT++;
		while (true) {
			try {
				this.id = inputId();
				scanner.nextLine();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				scanner.nextLine();
			}
		}

		this.name = inputName();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	private int inputId() throws Exception {
		try {
			System.out.println("Please input department id: ");
			int id = scanner.nextInt();

			return id;
		} catch (Exception e) {
			throw new Exception("Please input a number as int");
		}
	}

	private String inputName() {
		System.out.println("Please input department name: ");
		String name = scanner.nextLine();

		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
