import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a,b;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        a= dc.nextInt();
        System.out.print("Nhap b: ");
        b= dc.nextInt();
        int x=a+b;
        int y=a-b;
        int z=a*b;
        float t=(float)a/b;
        System.out.println("Tong a+b= "+x);
        System.out.println("hieu a-b= "+y);
        System.out.println("Tich a*b= "+z);
        if(b==0){
            System.out.println("Khong chia duoc cho 0!!!");
        }
        else{
            System.out.println("Thuong a/b= "+t);
        }

    }
}
