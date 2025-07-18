package exercise2.question11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

import exercise2.question10.Group;
import exercise2.question4.entity.Department;
import exercise2.question4.entity.Position;
import exercise2.question7.ScannerUtils;

public class Account {
	public static int COUNT = 0;
	private int id;
	private String email;
	private int age;
	private String userName;
	private String fullName;
	private float salary;
	private Department department;
	private Position position;
	private Date createDate;
	private Group[] groups;

	public Account() {
		super();
		System.out.println("Nhập id account: ");
		this.id = ScannerUtils.inputInt();
		System.out.println("Nhập email account: ");
		this.email = ScannerUtils.inputString();
		System.out.println("Nhập vào username account: ");
		this.userName = ScannerUtils.inputString();
		System.out.println("Nhập tuổi account: ");
		while (true) {
			this.age = ScannerUtils.inputInt();
			try {
				if (age <= 0) {
					throw new InvalidAgeInputingException("sai vì nhập tuổi nhỏ hơn 0");
				} else {
					break;
				}
			} catch (InvalidAgeInputingException e) {
				System.out.println(e.getMessage() + ".Yêu cầu nhập lại");

			}
		}

		this.fullName = fullName;
		System.out.println("Nhập vào salary account: ");
		this.salary = ScannerUtils.inputFloat();
		System.out.println("Nhập vào create date account: ");
		this.createDate = ScannerUtils.inputDate();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Date setCreateDateWithString(String dateInput) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", salary=" + salary + ", department=" + department + ", position=" + position + ", createDate="
				+ createDate + ", groups=" + Arrays.toString(groups) + "]";
	}

}
