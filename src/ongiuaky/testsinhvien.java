package ongiuaky;

import java.util.Scanner;

public class testsinhvien {
    public static void main(String[] args) {
        //khai bao lop sinh vien
        Sinhvien sv1=new Sinhvien();
        Sinhvien sv2=new Sinhvien();

        //nhapthongtin
        System.out.println("Nhap thong tin sinh vien 1");
        sv1.input();
        System.out.println("Nhap thong tin sinh vien 2");
        sv2.input();

        //xuat ra thong tin + diem trung binh
        System.out.println("Thong tin sinh vien 1");
        sv1.xuatra();
        double dtbsv1=sv1.dtb();
        System.out.println("Diem trung binh: "+dtbsv1);
        System.out.println("");
        System.out.println("Thong tin sinh vien 2");
        sv2.xuatra();
        double dtbsv2=sv2.dtb();
        System.out.println("Diem trung binh: "+dtbsv2);

    }
}
