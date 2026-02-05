import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
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
                System.out.print("Nhập ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // Chống trôi lệnh
                System.out.print("Nhập tên: ");
                String ten = sc.nextLine();
                System.out.print("Nhập giá trị: ");
                double giaTri = sc.nextDouble();

                ds.add(new Item(id, ten, giaTri));
                System.out.println("Đã thêm thành công!");
            } else if (chon == 2) {
                // Chức năng 2: Tính tổng giá trị trong danh sách
                double tong = 0;
                for (Item item : ds) {
                    tong += item.getValue();
                }
                System.out.println("TỔNG GIÁ TRỊ TRONG DANH SÁCH LÀ: " + tong);
            } else if (chon == 3) {
                if (ds.isEmpty()) {
                    System.out.println("DANH SÁCH TRỐNG!");
                } else {
                    Item max = ds.get(0);
                    for (Item i : ds) {
                        if (i.getValue() > max.getValue()) max = i;
                    }
                    System.out.println(
                        "PHẦN TỬ LỚN NHẤT: " + max.getName() + " (" + max.getValue() + ")"
                    );
                }
            } else if (chon == 4) {
                System.out.println("--- DANH SÁCH CHI TIẾT ---");
                for (Item i : ds) System.out.println(i);
            } else if (chon == 5) {
                try (FileWriter writer = new FileWriter("data.json")) {
                    // Sử dụng GSON để biến danh sách thành chuỗi JSON đẹp mắt
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    gson.toJson(ds, writer);
                    System.out.println("--- ĐÃ LƯU DỮ LIỆU VÀO FILE DATA.JSON THÀNH CÔNG! ---");
                } catch (IOException e) {
                    System.out.println("LỖI LƯU FILE: " + e.getMessage());
                }
            } else if (chon == 0) break;
        }
    }
}
