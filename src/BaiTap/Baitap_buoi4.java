package BaiTap;

public class Baitap_buoi4 {
    public static void main(String[] args) {
        //object và class:
        //class: là một khuôn mẫu để tạo ra các đối tượng, nó định nghĩa các thuộc tính và phương thức dùng chung của đối tượng
        //object là một thực thể cụ thể được tạo ra từ class, nó có các thuộc tính và phương thức riêng của nó
        //class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng từ bản thiết kế đó

        //ví dụ: sinh viên: tên, tuổi, điểm toán, điểm lý, điểm hóa, điểm trung bình, xếp loại
        // tạo đói tương sinh viên từ class sinhVien
        // cú pháp: tên class tên đối tương = new teenClass ( giá trị thuộc tính );
        sinhVien sv1 = new sinhVien("Bray",20,8.5,7.0,9.0);
        sinhVien sv2 = new sinhVien("Trần Thị B", 19, 6.0, 5.5, 7.0);

        //truy cập vào các thuộc tính và phương thức của đối tượng
        double dtb1 = sv1.tinhDiemTrungBinh();
        System.out.println("Điểm trung bình của " + sv1.ten + " là: " + dtb1);
        sv1.xepLoai();
        //System.out.println("Số tuổi của " + sv1.ten + " là: " + sv1.tuoi);
        // lỗi vì thuộc tính tuổi là private, không thể truy cập trực tiếp từ bên ngoài class
    }
}
class sinhVien {
    // thuộc tính:
    public String ten;
    private int tuoi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    //constructor: là một phương thức đặc biệt được sử dụng để khởi tạo đối tượng, nó có cùng tên với class
    public sinhVien(String ten, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // phương thức
    // tạo hàm hay là tạo phuowng thức 1. có giá trị trả về 2. không có giá trị trả về (void)
    // có giá trị trả về: public kiểu dữ liệu tenPhuongThuc(){ logic sử dụng các thuộc tính của đối tượng; return giá trị;}
    // không có giá trị trả về: public void tenPhuongThuc(){ logic sử dụng các thuộc tính của đối tượng;}
    // tính điểm trung bình: sử dụng phương thức có giá trị trả về
    public double tinhDiemTrungBinh() {
        double diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
        return diemTrungBinh;
    }

    // xếp loại: sử dụng phương thức không có giá trị trả về
    public void xepLoai() {
        // sử dụng phương thức tinhDiemTrungBinh để tính điểm trung bình của học sinh
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8) {
            System.out.println("Học sinh đạt loại giỏi");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Học sinh đạt loại khá");
        } else if (diemTrungBinh >= 5) {
            System.out.println("Học sinh đạt loại trung bình");
        } else {
            System.out.println("Học sinh đạt loại yếu");
        }

    }}