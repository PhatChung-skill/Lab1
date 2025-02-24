import java.util.Calendar;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int n,t,nn;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap ngay sinh cua ban: ");
        n=dc.nextInt();
        System.out.print("Nhap thang sinh cua ban: ");
        t=dc.nextInt();
        System.out.print("Nhap vao nam sinh cua ban: ");
        nn=dc.nextInt();

        Calendar ngaysinh=Calendar.getInstance();
        ngaysinh.set(nn,t-1,n);

        int ngay=ngaysinh.get(Calendar.DAY_OF_MONTH);
        int thang=ngaysinh.get(Calendar.MONTH);
        int nam=ngaysinh.get(Calendar.YEAR);

        System.out.println("Ngay thang nam sinh cua ban la: "+ngay+"/"+(thang+1)+"/"+nam);

        Calendar now=Calendar.getInstance();
        int namhientai=now.get(Calendar.YEAR);
        int tuoi= namhientai-nam;

        System.out.println("Tuoi cua ban la: "+tuoi);

    }
}
