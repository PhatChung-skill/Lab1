import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n;
        Scanner dc= new Scanner(System.in);
        System.out.print("Nhap N: ");
        n=dc.nextInt();
        if(n%2==0){
            System.out.println("So chan");
        }
        else{
            System.out.println("So le");
        }
    }
}
