package BaiTap.Buoi5_QLNV;

import java.util.Scanner;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private String address;
    private double salaryPerHour;
    private double totalWorkingHours;

    public NhanVien(){}

    public NhanVien(String id, String name, int age, String address,
                    double salaryPerHour, double totalWorkingHours){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryPerHour = salaryPerHour;
        this.totalWorkingHours = totalWorkingHours;
    }

    public void input(Scanner scan){
        System.out.print("Nhập id: ");
        id = scan.nextLine();

        System.out.print("Nhập name: ");
        name = scan.nextLine();

        System.out.print("Nhập tuổi: ");
        age = scan.nextInt();
        scan.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = scan.nextLine();

        System.out.print("Nhập lương/giờ: ");
        salaryPerHour = scan.nextDouble();
        scan.nextLine();

        System.out.print("Nhập tổng giờ làm: ");
        totalWorkingHours = scan.nextDouble();
        scan.nextLine();
    }

    public void display(){
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Salary/Hour: " + salaryPerHour +
                " | Total Hours: " + totalWorkingHours);
    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public double getTotalWorkingHours(){ return totalWorkingHours; }
    public double getSalary(){ return salaryPerHour * totalWorkingHours; }

    public void setTotalWorkingHours(double hours){
        this.totalWorkingHours = hours;
    }

    public void update(Scanner scan){
        System.out.print("Nhập name mới: ");
        name = scan.nextLine();

        System.out.print("Nhập tuổi mới: ");
        age = scan.nextInt();
        scan.nextLine();

        System.out.print("Nhập địa chỉ mới: ");
        address = scan.nextLine();

        System.out.print("Nhập lương/giờ mới: ");
        salaryPerHour = scan.nextDouble();
        scan.nextLine();

        System.out.print("Nhập tổng giờ làm mới: ");
        totalWorkingHours = scan.nextDouble();
        scan.nextLine();
    }
}