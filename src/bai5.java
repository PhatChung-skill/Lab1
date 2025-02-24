import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        double r;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap ban kinh R: ");
        r= dc.nextDouble();
        double cv=2*3.14159*r;
        double s=3.14159*r*r;
        if(r<=0){
            System.out.println("Khong co hinh tron");
        }
        else{
            System.out.println("Chu vi hinh tron: "+cv);
            System.out.println("Dien tich hinh tron: "+s);
        }

    }
}
