import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap diem Ktra: ");
        a= dc.nextDouble();
        System.out.print("Nhap diem giua ky: ");
        b= dc.nextDouble();
        System.out.print("Nhap diem cuoi ky: ");
        c= dc.nextDouble();
        double tb=(a+b+c*2)/4;
        if(a>=0&&b>=0&&c>=0&&a<=10&&b<=10&&c<=10){
            System.out.println("Diem TB la: "+tb);
        }
        if(a<0||b<0||c<0||a>10||b>10||c>10){
            System.out.println("Diem nhap khong hop le");
        }
        else if(tb>=9){
            System.out.println("Hang A");
        }
        else if(tb>=7&&tb<9){
            System.out.println("Hang B");
        }
        else if(tb>=5&&tb<7){
            System.out.println("Hang C");
        }
        else{
            System.out.println("Hang F");
        }
    }
}
