import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ngay = "thu 2: 9/3/2026";
        int soA = 10;
        soA += 5;
        System.out.println("soA"+soA);
        soA -=3;
        System.out.println("soA"+soA);

        System.out.print("Nhập tổng số đơn hàng: ");
        int tongsodonhang = scan.nextInt();
        System.out.print("co phai sv ko: ");
        boolean lasv = scan.nextBoolean();
        boolean thoadk = tongsodonhang >= 500 || lasv;
        System.out.println("ket qua co duoc giam hay ko: "+thoadk);
    }
}
