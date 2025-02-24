import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        char x;
        Scanner dc= new Scanner(System.in);
        System.out.print("Nhap phep tinh can tinh: ");
        x=dc.next().charAt(0);
        int a,b;
        System.out.print("Nhap he so a: ");
        a=dc.nextInt();
        System.out.print("Nhap he so b: ");
        b=dc.nextInt();
        int j=a+b;
        int y=a-b;
        int z=a*b;
        float t=(float)a/b;
        switch (x){
            case '+':
                System.out.println("Tong a+b la: "+j);
                System.out.println("He so a la: "+a);
                System.out.println("He so b la: "+b);
                break;
            case '-':
                System.out.println("Hieu a-b la: "+y);
                System.out.println("He so a la: "+a);
                System.out.println("He so b la: "+b);
                break;
            case '*':
                System.out.println("Tich a*b la: "+z);
                System.out.println("He so a la: "+a);
                System.out.println("He so b la: "+b);
                break;
            case '/':
                if(b==0){
                    System.out.println("Khong chia duoc cho 0!!!");
                }
                else{
                    System.out.println("Thuong a/b la: "+t);
                    System.out.println("He so a la: "+a);
                    System.out.println("He so b la: "+b);
                }
                break;
            default:
                System.out.println("dau nhap khong nam trong phep tinh");
        }

    }
}
