package Lab1;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap so: ");
        n= dc.nextInt();

        System.out.println("So dau tien: " + sodau(n));
        System.out.println("So tan cung: " + socuoi(n));

    }
    public static int sodau (int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n/= 10;
        }
        return n;
    }

    public static int socuoi(int n) {
        return Math.abs(n) % 10;
    }

}
