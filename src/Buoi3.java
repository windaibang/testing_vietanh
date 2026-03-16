import java.util.Arrays;

public class Buoi3 {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        // array: mảng, là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng kiểu dữ liệu
        // cùng 1 mục đích sử dụng;
        // khai báo biiến: kiểu dữ liệu tenBien = giá trị;
        // khai báo mảng: kiểu dữ liệu[] tenMang = new kiểu dữ liệu[kích thước]; -> số lượng phần tử của mảng
        int[] mangSo = new int[5];
        mangSo[0] = 10;
        mangSo[1] = 3;
        mangSo[2] = 6;
        mangSo[3] = 9;
        mangSo[4] = 8;
        System.out.println("gia tri phan tu có index 4 la: " + mangSo[4]);
        System.out.println("gia tri cua mang là: " + Arrays.toString(mangSo));
        //khai bảo mảng: kiểu dữ liệu[] tenMang = {giá trị 1, giá trị 2, giá trị 3,...};
        String[] mangTen = {"Trịnh An Thành", "Khôi", "Hùng"};
        mangTen[0] = "Nguyễn Bảo Giang";
        System.out.println("Giá trị của phần tử có index 0: " + mangTen[0]);
        System.out.println("Số lượng phần tử của mảng: " + mangTen.length);
        // .length: trả về số lượng phần tử của mảng

        //duyệt mảng: sử dụng vòng lặp for để duyệt qua tất cả phần tử của mảng
        for (int i = 0; i < mangTen.length; i++) {
            System.out.println("Phần tử có index " + i + " là: " + mangTen[i]);
        }
        //for...each
        //cú pháp: for (kiểu dữ liệu tenBien : tenMang){ logic sử dụng tenBien}
        for (String ten : mangTen) {
            System.out.println("Tên học sinh: " + ten);

            //đây là dòng code mới để test git
        }
    }
}
