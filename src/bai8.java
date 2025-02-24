import java.sql.SQLOutput;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        char x;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap diem: ");
        x=dc.next().charAt(0);
        switch (x){
            case 'A':
                System.out.println("Sinh vien xuat xac");
                break;
            case 'B':
                System.out.println("Sinh vien loai gioi");
                break;
            case 'C':
                System.out.println("Sinh vien loai kha");
                break;
            case 'D':
                System.out.println("Sinh vien loai TB");
                break;
            case 'F':
                System.out.println("Sinh vien loai yeu");
                break;
            default:
                System.out.println("Diem khong nam trong du lieu");
        }
    }
}
