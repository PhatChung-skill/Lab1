package Lab1;

import java.util.Scanner;

public class bai7 {
    private double ly;
    private double hoa;
    private double sinh;
    private double toan;
    private double maytinh;

    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap diem ly: ");
        ly=dc.nextDouble();
        while (ly<0||ly>10){
            System.out.print("Diem khong hop le,nhap lai diem ly: ");
            ly=dc.nextDouble();
        }
        System.out.print("Nhap diem hoa: ");
        hoa=dc.nextDouble();
        while (hoa<0||hoa>10){
            System.out.print("Diem khong hop le,nhap lai diem hoa: ");
            hoa=dc.nextDouble();
        }
        System.out.print("Nhap diem sinh: ");
        sinh=dc.nextDouble();
        while (sinh<0||sinh>10){
            System.out.print("Diem khong hop le,nhap lai diem sinh: ");
            sinh=dc.nextDouble();
        }
        System.out.print("Nhap diem toan: ");
        toan=dc.nextDouble();
        while (toan<0||toan>10){
            System.out.print("Diem khong hop le,nhap lai diem toan: ");
            toan=dc.nextDouble();
        }
        System.out.print("Nhap diem may tinh: ");
        maytinh=dc.nextDouble();
        while (maytinh<0||maytinh>10){
            System.out.print("Diem khong hop le,nhap lai diem may tinh: ");
            maytinh=dc.nextDouble();
        }
    }

    public double dtb(){
        return (toan+ly+sinh+hoa+maytinh)/5;
    }

    public double tilephantram(){
        return dtb()*100/10;
    }

    public String tinh() {
        if (tilephantram() > 90) {
            return "Hang A";
        }
        else if (tilephantram() > 80 && dtb() <= 90) {
            return "Hang B";
        }
        else if (tilephantram() > 70 && dtb() <= 80) {
            return "Hang C";
        }
        else if (tilephantram() > 60 && dtb() <= 70) {
            return "Hang D";
        }
        else if (dtb() > 40 && dtb() <= 60) {
            return "Hang E";
        }
        else {
            return "Diem thap qua!!!";
        }
    }


    public void xuat(){
        System.out.print("Diem ly: "+ly);
        System.out.print(", diem hoa: "+hoa);
        System.out.print(", diem sinh: "+sinh);
        System.out.print(", diem toan: "+toan);
        System.out.println(", diem may tinh: "+maytinh);
        System.out.println("Diem trung binh cua ban la: "+dtb());
        System.out.println("Tinh theo ty le %: "+tilephantram()+"%");
        System.out.println(tinh());
    }



}
