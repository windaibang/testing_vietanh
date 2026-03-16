
package BaiTap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//VD: Xep loai hoc luc dua tren DTB
// <5: hs yeu
// 5-7: TB
// 7-8.5: kha
// 8.5-10: gioi
// nhap toan van anh ho ten
public class BaiTap1_buoi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ho ten HS: ");
        String hoten = scan.nextLine();
        System.out.print(" Nhap diem Toan: ");
        double Toan = scan.nextDouble();
        System.out.print(" Nhap Diem Ly ");
        double ly = scan.nextDouble();
        System.out.print(" Nhap Diem Hoa ");
        double Hoa = scan.nextDouble();
        double DTB = (Toan + ly + Hoa) / 3;
        System.out.println("--------Ket Qua------- ");
        System.out.println(" HO TEN: " + hoten);
        System.out.println("Diem Toan " + Toan);
        System.out.println("Diem hoa " + Hoa);
        System.out.println("Diem ly " + ly);
        System.out.println("Diem TB: " + DTB);
        if (DTB < 5.0) {
            System.out.println("Yeu");
        } else if (DTB >= 5 && DTB < 7) {
            System.out.println("TB");
        } else if (DTB >= 7 && DTB < 8.5) {
            System.out.println("kha");
        } else if (DTB >= 8.5 && DTB < 10) {
            System.out.println("gioi");
        }
        System.out.println(" ------------Bai 2--------- ");
        System.out.println("Nhap dien tieu thu: ");
        int dientt = scan.nextInt();
        if (dientt <= 50) {
            System.out.println("gia dien: 1000");
        } else if (dientt <= 100) {
            System.out.println("gia dien: 1200");
        } else if (dientt > 100) {
            System.out.println("gia dien: 1500");
        }
        System.out.println(" ------------Bai 3--------- ");
        System.out.println("Nhap so km da di: ");
        int soKM = scan.nextInt();
        int tienkmdau = 20000;
        int tienkmsau = 20000 + (soKM - 1) * 15000;
        int tienkm5den10 = 20000 + (soKM - 1) * 15000 + (soKM - 5) * 12000;
        int tienkmtren10 = 20000 + 4 * 15000 + 5 * 12000 + (soKM - 10) * 10000;
        System.out.print("so tien phai tra la : ");
        if (soKM <= 1) {
            int tongtien = tienkmdau;
            System.out.println(tienkmdau);
        } else if (soKM > 1 && soKM < 5) {
            System.out.println(tienkmsau);
        } else if (soKM > 5 && soKM <= 10) {
            System.out.println(tienkm5den10);
        }else if (soKM >10) {
            System.out.println(tienkmtren10);
        }
    }
}
