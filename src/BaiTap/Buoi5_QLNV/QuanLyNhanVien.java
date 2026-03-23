package BaiTap.Buoi5_QLNV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSach = new ArrayList<>();

    public void themNhanVien(Scanner scan){
        NhanVien nv = new NhanVien();
        nv.input(scan);
        danhSach.add(nv);
    }

    public void hienThi(){
        if(danhSach.isEmpty()){
            System.out.println("Danh sách rỗng!");
            return;
        }
        for(NhanVien nv : danhSach){
            nv.display();
        }
    }

    public void xoa(Scanner scan){
        System.out.print("Nhập ID cần xóa: ");
        String id = scan.nextLine();

        for(int i=0;i<danhSach.size();i++){
            if(danhSach.get(i).getId().equals(id)){
                danhSach.remove(i);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public void tim(Scanner scan){
        System.out.print("Nhập ID cần tìm: ");
        String id = scan.nextLine();

        for(NhanVien nv : danhSach){
            if(nv.getId().equals(id)){
                nv.display();
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public void luongMax(){
        NhanVien max = danhSach.get(0);
        for(NhanVien nv : danhSach){
            if(nv.getSalary() > max.getSalary()){
                max = nv;
            }
        }
        System.out.println("Nhân viên lương cao nhất:");
        max.display();
    }

    public void gioMin(){
        NhanVien min = danhSach.get(0);
        for(NhanVien nv : danhSach){
            if(nv.getTotalWorkingHours() < min.getTotalWorkingHours()){
                min = nv;
            }
        }
        System.out.println("Nhân viên giờ thấp nhất:");
        min.display();
    }

    public void sortTen(){
        Collections.sort(danhSach, Comparator.comparing(NhanVien::getName));
    }

    public void sortGio(){
        Collections.sort(danhSach, Comparator.comparingDouble(NhanVien::getTotalWorkingHours));
    }

    public void update(Scanner scan){
        System.out.print("Nhập ID cần update: ");
        String id = scan.nextLine();

        for(NhanVien nv : danhSach){
            if(nv.getId().equals(id)){
                nv.update(scan);
                System.out.println("Update thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public void updateGio(Scanner scan){
        System.out.print("Nhập ID: ");
        String id = scan.nextLine();

        for(NhanVien nv : danhSach){
            if(nv.getId().equals(id)){
                System.out.print("Nhập giờ mới: ");
                double h = scan.nextDouble();
                scan.nextLine();
                nv.setTotalWorkingHours(h);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public void lonHon120(){
        for(NhanVien nv : danhSach){
            if(nv.getTotalWorkingHours() > 120){
                nv.display();
            }
        }
    }

    public void nhoHon80(){
        for(NhanVien nv : danhSach){
            if(nv.getTotalWorkingHours() < 80){
                nv.display();
            }
        }
    }
}
