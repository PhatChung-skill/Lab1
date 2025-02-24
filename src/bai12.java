import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap N= ");
        n= dc.nextInt();
        float s=0;
        float l=1;
        for(float i=1; i<=n;i++){
            s+= 1/(l*=i);//tính S=1+1/2!+1/3!+...+1/N!
        }
        System.out.println("S= "+s);
    }
}
