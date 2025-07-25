package exercise1.question2.backend;

import java.util.Scanner;

import exercise1.question2.entity.QLCB;

public class Exercise5 {

	public void question1_2() {
		while (true) {

			Scanner scanner = new Scanner(System.in);
			QLCB qlcb = new QLCB();

			System.out.println("Mời bạn nhập vào chức năng muốn dùng\n" + "1.Thêm mới cán bộ\n"
					+ "2.Tìm kiếm theo họ tên\n" + "3.Hiện thị thông tin về danh sách các cán bộ.\n"
					+ "4.Nhập vào tên của cán bộ và delete cán bộ đó\n" + "5.Thoát khỏi chương trình.");
			System.out.print("Mời bạn chọn chức năng: ");

			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.findByName();
				break;
			case 3:
				qlcb.printListCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 5:
				return;
			default:
				System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 tới 5 thôi!");
				break;
			}

		}

	}
}
