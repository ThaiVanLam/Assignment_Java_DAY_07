package exercise2.question10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exercise2.question7.ScannerUtils;

public class Group {
	private byte id;
	private String name;
	private Account creator;
	private Date createDate;
	private List<Account> accounts;

	public Group() {
		super();
		accounts = new ArrayList<Account>();
		System.out.println("Nhập id group: ");
		this.id = ScannerUtils.inputByte();
		System.out.println("Nhập tên group: ");
		this.name = ScannerUtils.inputString();
		this.creator = creator;
		System.out.println("nhập ngày tạo group: ");
		this.createDate = ScannerUtils.inputDate();
		System.out.println("Bạn có muốn thêm account không?");
		System.out.println("1.Có");
		System.out.println("2.Không");
		int choice = ScannerUtils.inputInt();
		switch (choice) {
		case 1:
			System.out.println("Bạn muốn thêm bao nhiêu account: ");
			int numberAccount = ScannerUtils.inputInt();
			if (numberAccount == 0) {
				break;
			} else {
				for (int i = 0; i < numberAccount; i++) {
					Account account = new Account();
					accounts.add(account);
				}
			}
			break;
		case 2:
			break;

		}
	}

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
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

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", createDate=" + createDate
				+ ", accounts=" + accounts + "]";
	}

}
