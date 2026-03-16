package BaiTap;

import java.util.Scanner;

public class Baitap_buoi3 {
    public static void main(String[] args) {
        //bài tập 1: quản lý chi tiết cá nhân trong 7 ngày. cho phép người dùng nhập vào
        //chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
        //chi tiêu cao nhất và thấp nhất trong 7 ngày

        //bài tập 2: quản lý điểm số của học sinh trong 5 môn học. cho phép người dùng nhập vào
        //điểm số của học sinh trong 5 môn học, sau đó in ra điểm trung bình, điểm cao nhất và thấp nhất,
        // và số môn học có điểm số >= 5.0

        //bài tập 3: quản lý thông tin của nhân viên. cho phép người dùng nhập thông tin nhân viên
        //số giờ làm mỗi ngày trong 1 tuần, sau đó in ra tổng số giờ làm trong tuần, trung bình số giờ làm mỗi ngày,
        // và số ngày làm việc có số giờ làm >= 8 giờ

        //Bài 1 giải
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập chi tiêu cho 7 ngày: ");
        double[] chiTieu = new double[7];

        for(int i = 0; i < chiTieu.length; i++){
            System.out.println("nhập vào chi tiêu ngày " + (i + 1) + ": ");
            chiTieu[i] = scan.nextDouble();
        }

        double tongChiTieu = 0;
        double chiTieuTrungBinh = 0;
        double chiTieuCaoNhat = chiTieu[0];
        double chiTieuThapNhat = chiTieu[0];
        for (double chi : chiTieu){
            tongChiTieu += chi; //tongChiTieu = tongChiTieu + chi;
            if (chi > chiTieuCaoNhat){
                chiTieuCaoNhat = chi;
            }

            if (chi < chiTieuThapNhat){
                chiTieuThapNhat = chi;
            }
        }
        //        for (int i = 0; i < chiTieu.length; i++){
//            if(chiTieu[i] > chiTieuCaoNhat){
//                chiTieuCaoNhat = chiTieu[i];
//            }
//            if (chiTieu[i] < chiTieuThapNhat){
//                    chiTieuThapNhat = chiTieu[i];
//            }
//
        chiTieuTrungBinh = tongChiTieu / chiTieu.length;
        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChiTieu);
        System.out.println("Trung bình chi tiêu mỗi ngày: " + chiTieuTrungBinh);
        System.out.println("Chi tiêu cao nhất trong 7 ngày: " + chiTieuCaoNhat);
        System.out.println("Chi tiêu thấp nhất trong 7 ngày: " + chiTieuThapNhat);
        //Bài 2 giải :
        System.out.print("Nhập điểm 5 môn của học sinh: ");
        double[] diem5mon = new double[5];
        for(int i = 0; i < diem5mon.length; i++){
            System.out.println("nhập vào điểm môn thứ " + (i + 1) + ": ");
            diem5mon[i] = scan.nextDouble();
        }
        double diemTB = 0;
        double tongdiem = 0;
        double diemcaonhat = diem5mon[0];
        double diemthapnhat = diem5mon[0];
        double somonlonhon5 = 0 ;

        for (double diem: diem5mon ){
            tongdiem += diem;
            if (diem > diemcaonhat){
                diemcaonhat= diem;
            }
            if (diem < diemthapnhat ){
                diemthapnhat = diem;
            }
            if(diem>=5){
                somonlonhon5++;
            }
        }
        diemTB = tongdiem / diem5mon.length;

        System.out.println("điểm TB: "+diemTB);
        System.out.println("điểm cao nhất: "+diemcaonhat);
        System.out.println("điểm thấp nhất: "+diemthapnhat);
        System.out.println("lớn hơn 5: "+somonlonhon5);
        //bài 3 giải:
        System.out.println("Nhập số giờ làm mỗi ngày của nv");
        double[] giolam = new double[7];
        for(int i = 0; i < diem5mon.length; i++){
            System.out.println("nhập giờ vào ngày làm thứ " + (i + 1) + ": ");
            giolam[i] = scan.nextDouble();
        }
        double giolamTB = 0;
        double tonggiolam = 0;
        double sogiolonhon8 = 0 ;
        for (double gio: giolam ){
            tonggiolam += gio;
            if(gio>=8){
                sogiolonhon8++;
            }
        }
        giolamTB = tonggiolam / 7;
        System.out.println("Tổng số giờ làm trong tuần: " + tonggiolam);
        System.out.println("Trung bình số giờ làm mỗi ngày: " + giolamTB);
        System.out.println("Số ngày làm việc có số giờ làm >= 8 giờ: " + sogiolonhon8);
    }
}
