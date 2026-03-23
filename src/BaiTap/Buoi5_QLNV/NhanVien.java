package BaiTap.Buoi5_QLNV;

import java.util.Scanner;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private String address;
    private double salaryPerHour;
    private double totalWorkingHours;

    // Constructor rỗng
    public NhanVien() {
    }

    // Constructor đầy đủ
    public NhanVien(String id, String name, int age, String address,
                    double salaryPerHour, double totalWorkingHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryPerHour = salaryPerHour;
        this.totalWorkingHours = totalWorkingHours;
    }

    // Nhập
    public void input(Scanner scan) {
        System.out.print("Nhập id: ");
        this.id = scan.nextLine();

        System.out.print("Nhập name: ");
        this.name = scan.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scan.nextInt();
        scan.nextLine();

        System.out.print("Nhập địa chỉ: ");
        this.address = scan.nextLine();

        System.out.print("Nhập lương theo giờ: ");
        this.salaryPerHour = scan.nextDouble();
        scan.nextLine();

        System.out.print("Nhập tổng giờ làm: ");
        this.totalWorkingHours = scan.nextDouble();
        scan.nextLine();
    }

    // Hiển thị
    public void display() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Salary/Hour: " + salaryPerHour +
                " | Total Hours: " + totalWorkingHours);
    }

    // Getter cần dùng
    public String getId() {
        return id;
    }

    public double getSalary() {
        return salaryPerHour * totalWorkingHours;
    }

    public double getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public String getName() {
        return name;
    }
}