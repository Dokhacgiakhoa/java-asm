import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> ds = new ArrayList<>(); // Chức năng 1: Lưu trữ vào List

        while (true) {
            System.out.println("\n--- MENU QUẢN LÝ ---");
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Tính tổng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = sc.nextInt();

            if (chon == 1) {
                // Code Chức năng 1
                System.out.print("Nhập ID: "); int id = sc.nextInt();
                sc.nextLine(); // Chống trôi lệnh
                System.out.print("Nhập tên: "); String ten = sc.nextLine();
                System.out.print("Nhập giá trị: "); double giaTri = sc.nextDouble();

                ds.add(new Item(id, ten, giaTri));
                System.out.println("Đã thêm thành công!");
            } else if (chon == 0) break;
        }
    }
}