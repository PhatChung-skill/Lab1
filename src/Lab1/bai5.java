package Lab1;

import java.util.Scanner;

public class bai5 {
    private double a;
    private double b;
    private double c;

    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a= dc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        b= dc.nextDouble();
        System.out.print("Nhap so thu ba: ");
        c= dc.nextDouble();
    }


    public void xuat(){
        System.out.println("Phan tu 1: "+a+" Phan tu 2: "+b+" phan tu 3: "+c);
        double min = Math.min(a, Math.min(b, c));
        System.out.println("Phan tu nho nhat la: "+min);
    }

}
