package Lab1;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap so:");
        n=dc.nextInt();
        System.out.println("Tong cac chu so la: "+tong(n));
        System.out.println("Tich cac chu so la: "+tich(n));

    }
    public static int tong(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static int tich(int n) {
        n = Math.abs(n);
        int p = 1;

        if(n == 0) {
            return 0;
        }
        while (n > 0) {
            p *= n % 10;
            n /= 10;
        }
        return p;
    }
}
