import java.util.ArrayList;
import java.util.Collections;

public class Buoi4 {
    public static void main(String[] args) {
        //cú pháp: ArrayList<Kiểu dữ liệu> tenArrayList = new ArayList<>();

        //ví dụ: mảng string điện thoại : ip ss xi

        ArrayList<String> mangdienthoai = new ArrayList<>();
        mangdienthoai.add("iphone");
        mangdienthoai.add("samsung");
        mangdienthoai.add("xiaomi");
        mangdienthoai.add("oppo");
        mangdienthoai.add("realme");

        // Thêm vào vị trí cụ thể mình mong muốn add(index , giá trị )
        mangdienthoai.add(1, "nokia");

        // cập nhật giá trị trong mảng : sử dụng pt set(index,giá tri)
        mangdienthoai.set(3,"alibaba");
        // xóa phần tử trong mảng: sử dụng remove(index);
        mangdienthoai.remove(2);
        System.out.println("Giá trị của mảng điện thoại: "+mangdienthoai);
        //duyệt mảng
        for (String Dt:mangdienthoai){
            System.out.println("tên điện thoại: "+ Dt);

        // đếm số lượng phần tử bên trong mảng: size();

            int soLuong = mangdienthoai.size();
            System.out.println("Số lượng phần tử trong mảng điện thoại: " + soLuong);

            ArrayList<Integer> mangSo = new ArrayList<>();
            mangSo.add(5);
            mangSo.add(2);
            mangSo.add(8);
            mangSo.add(1);
            //sắp xếp phần tử trong mảng: sử dụng phương thức sort()
            Collections.sort(mangSo); // sắp xếp theo thứ tự tăng dần
            System.out.println("Giá trị của mảng điện thoại sau khi sắp xếp: " + mangSo);
            //sau khi sắp xếp tăng dần rồi đảo ngược mảng: sử dụng phương thức reverse()
            Collections.reverse(mangSo);
            System.out.println("Giá trị của mảng điện thoại sau khi sắp xếp theo thứ tự giảm dần: " + mangSo);
            //tìm kiếm phần tử trong mảng: sử dụng phương thức contains()
            boolean ketQua = mangdienthoai.contains("iphone"); //true hoặc false
            boolean ketQua2 = mangSo.contains(2);
            System.out.println("Kết quả tìm kiếm phần tử 'iphone' trong mảng điện thoại: " + ketQua);
            System.out.println("Kết quả tìm kiếm phần tử '2' trong mảng số: " + ketQua2);
        }
    }
}
