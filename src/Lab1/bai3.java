package Lab1;

import java.util.Scanner;

public class bai3 {
    private double f;

    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap vao Do F: ");
        f=dc.nextDouble();
    }

    public double tinh(){
        return (f-32)/1.8;
    }

    public void xuatra(){
        System.out.println("Do F ban nhap la: "+f);
        System.out.println("Do C la: "+tinh());
    }
}
