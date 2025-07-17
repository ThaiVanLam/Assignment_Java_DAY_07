package exercise2.question4.entity;

import java.util.Scanner;

public class Position {
	Scanner scanner;
	public static int COUNT;
	private byte id;
	private PositionName name;

	public Position() {
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
		this.name = inputPositionName();
	}

	private byte inputId() throws Exception {
		try {
			System.out.println("Please input position id: ");
			byte id = scanner.nextByte();

			return id;
		} catch (Exception e) {
			throw new Exception("Please input a number as int");
		}
	}

	private PositionName inputPositionName() {
		System.out.println("Please input position name: ");
		System.out.println("Choose position name: ");
		String positionNameValue = scanner.nextLine();
		PositionName positionName = null;
		switch (positionNameValue) {
		case "Dev":
			positionName = PositionName.DEV;
			break;
		case "Test":
			positionName = PositionName.TEST;
			break;
		case "Scrum Master":
			positionName = PositionName.SCRUM_MASTER;
			break;
		case "PM":
			positionName = PositionName.PM;
			break;
		}
		return positionName;
	}

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

}
