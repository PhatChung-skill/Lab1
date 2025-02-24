package Lab1;

import java.util.Scanner;

public class bai6 {
    private double a;
    private double b;
    private double c;

    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap canh 1: ");
        a= dc.nextDouble();
        System.out.print("Nhap canh 2: ");
        b= dc.nextDouble();
        System.out.print("Nhap canh 3: ");
        c= dc.nextDouble();
    }
    public String tamgiachople(){
        if(a+b>c&&a+c>b&&b+c>a&&a>0&&b>0&&c>0){
            return "Tam Giac hop le";
        }
        else {
            return "Tam giac khong hop le!";
        }
    }

    public void xuat(){
        System.out.println("Canh 1: "+a+" canh 2: "+b+" Canh 3: "+c);
        System.out.println(tamgiachople());
    }
}
