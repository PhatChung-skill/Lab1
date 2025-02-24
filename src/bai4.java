import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap nam: ");
        n=dc.nextInt();
        if(n%4==0&&n%100!=0||n%400==0){
            System.out.println("Nam nhuan");
        }
        else{
            System.out.println("Nam khong nhuan");
        }
    }
}
