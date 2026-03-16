
package BaiTap;


import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        //Bai1: Tinh DTB toan ly hoa in ra DTB cua hs do in ra thong tin hs
        //Bai2: tinh luong nv cho phep nhap hoten luong co ban so ngay lam viec
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ho ten HS: ");
        String hoten = scan.nextLine();
        System.out.print(" Nhap diem Toan: ");
        int Toan = Integer.parseInt(scan.nextLine());
        System.out.print(" Nhap Diem Ly ");
        int ly = Integer.parseInt(scan.nextLine());
        System.out.print(" Nhap Diem Hoa ");
        int Hoa = Integer.parseInt(scan.nextLine());
        double DTB = (Toan + ly + Hoa)/3;
        System.out.println("--------Ket Qua------- ");
        System.out.println(" HO TEN: "+ hoten);
        System.out.println("Diem Toan "+ Toan);
        System.out.println("Diem hoa "+ Hoa);
        System.out.println("Diem ly "+ ly);
        System.out.println("Diem TB: "+DTB);

    }

}
