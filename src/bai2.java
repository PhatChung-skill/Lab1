import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a,b;
        Scanner dc= new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        a=dc.nextInt();
        System.out.print("Nhap chieu rong: ");
        b=dc.nextInt();
        int cv=2*(a+b);
        int s=a*b;
        if(a==b&&a>0&&b>0){
            System.out.println("Day la hinh vuong ma");
        }
        else if(a<=0||b<=0){
            System.out.println("Day khong phai hinh chu nhat");
        }
        else{
            System.out.println("Chu vi hinh chu nhat: "+cv);
            System.out.println("Dien tich hinh chu nhat: "+s);
        }
    }
}
