package BaiTap.Buoi5;

import java.util.Scanner;

public class SinhVien {
    // thuộc tính.

    private String id;
    private String name;
    private int age;
    private String address;
    private double score;

    // Constructor mặc định ko tham số
    public  SinhVien(){}

    // Constructor
    public SinhVien(String id, String name, int age, String address, double score ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }
    //phương thức
    // phương thức input để nhập thông tin sinh Viên
    public void input(Scanner scan){
        System.out.println("Nhập id: ");
        this.id = scan.nextLine();

        System.out.println("Nhập name: ");
        this.name = scan.nextLine();

        System.out.println("Nhập tuổi: ");
        this.age = scan.nextInt();
        scan.nextLine(); // fix

        System.out.println("Nhập địa chỉ: ");
        this.address = scan.nextLine();

        System.out.println("Nhập điểm: ");
        this.score = scan.nextDouble();
        scan.nextLine(); // fix luôn cho chắc
    }

    public void display(){
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Score: " + score);}
    public String getId(){
        return id;
    }
}
