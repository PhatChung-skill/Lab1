import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("Giai PT bac nhat ax+b=0");
        int a,b;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap he so bac1 a: ");
        a= dc.nextInt();
        System.out.print("Nhap he so bac0 b:");
        b= dc.nextInt();
        double x=(double)-b/a;
        if(a==0&&b!=0){
            System.out.println("Pt vo nghiem");
        }
        else if(a==0&&b==0) {
            System.out.println("Pt vo so nghiem");
        }
        else{
            System.out.println("Pt co nghiem x la: "+x);
        }
    }
}
