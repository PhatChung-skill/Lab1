package ongiuaky;

import java.util.Scanner;

public class Sinhvien {
   private String name;
   private String mssv;
   private String lop;
   private int somon;
   private double diem1;
   private double diem2;
   private double diem3;

   //input
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        name=sc.nextLine();
        System.out.print("Nhap ma so sinh vien: ");
        mssv=sc.nextLine();
        System.out.print("Nhap lop: ");
        lop=sc.nextLine();
        System.out.print("Nhap so mon de tinh diem: ");
        somon=sc.nextInt();
        while (somon<=1||somon>3){
            System.out.print("Nhap 2 or 3, moi nhap lai: ");
            somon=sc.nextInt();
        }
        System.out.print("Nhap diem mon thu nhat: ");
        diem1=sc.nextDouble();
        while (diem1<0||diem1>10){
            System.out.print("Diem nhap khong phu hop, moi nhap lai: ");
            diem1=sc.nextDouble();
        }
        System.out.print("Nhap diem mon thu hai: ");
        diem2=sc.nextDouble();
        while (diem2<0||diem2>10){
            System.out.print("Diem nhap khong phu hop, moi nhap lai: ");
            diem2=sc.nextDouble();
        }
        if(somon==3){
            System.out.print("Nhap diem mon thu ba: ");
            diem3=sc.nextDouble();
            while (diem3<0||diem3>10){
                System.out.print("Diem nhap khong phu hop, moi nhap lai: ");
                diem3=sc.nextDouble();
            }
        }
    }
    //tinh diem
    public double dtb(){
        if(somon==3){
            return (diem1+diem2+diem3)/3;
        }
        else {
            return (diem1+diem2)/2;
        }
    }
    //xuat ra mang hinh
    public void xuatra(){
        System.out.println("Ho ten: "+name);
        System.out.println("Ma so sinh vien: "+mssv);
        System.out.println("Lop: "+lop);
    }
}
