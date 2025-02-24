package Lab1;

import java.util.Scanner;

public class bai14 {
    private String ho;
    private String tendem;
    private String ten;

    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Ho ten: ");
        ho=dc.nextLine();
        tendem=dc.nextLine();
        ten= dc.next();
    }

    public void xuat(){
        System.out.println("Ho :"+ho);
        System.out.println("Ten :"+ten);
        System.out.println("Ten dem: "+tendem);
    }

}
