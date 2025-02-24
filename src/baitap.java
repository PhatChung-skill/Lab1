import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        char x;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap loai phong: ");
        x=dc.next().charAt(0);
        while (x!='A'&&x!='B'&&x!='C'){
            System.out.print("chi co loai phong A,B,C thoi, moi nhap lai: ");
            x=dc.next().charAt(0);
        }
            if (x == 'A') {
                System.out.println("Tong tien thue 1 ngay la: 1 trieu vnd");
            }
            if (x == 'B') {
                System.out.println("Tong tien thue 1 ngay la: 1,5 trieu vnd");
            }
            if (x == 'C') {
                System.out.println("Tong tien thue 1 ngay la: 2 trieu vnd");
            }
    }
}
