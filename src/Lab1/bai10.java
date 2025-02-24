package Lab1;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap so: ");
        n=dc.nextInt();
        System.out.println("co "+demso(n)+" chu so!!!");
    }
    public static int demso(int n){
        if(n==0){
            return 1;
        }
        int demso=0;
        while (n>0){
            demso++;
            n/=10;
        }
        return demso;
    }
}
