import java.util.Scanner;
public class Buoi_1 {

        //comment code : crt + / (win)
        //snippet code: gõ code nhanh
        // main + tab/enter: tạo hàm main nhanh
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập Họ Tên HS: ");
        String hoten = scan.nextLine();
        System.out.print("Nhập Tuổi: ");
        int tuoi = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập trường: ");
        String truong = scan.nextLine();
        System.out.print("Nhập Lớp: ");
        String lop = scan.nextLine();
        System.out.println("Họ Tên: "+hoten);
        System.out.println( "Tuổi: "+tuoi);
        System.out.println("Trường: "+truong);
        System.out.println("Lớp: "+lop);
    }
}
