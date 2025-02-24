public class clas {
    public static void main(String[] args) {
       nguoi sv1=new nguoi("Tran Tuan Minh",116,"Nam");
       sv1.xuatra();
        double dtvsv1= sv1.dtb(8.2,7.5);
        //tinh diem tb
        System.out.println("Diem TB: "+dtvsv1);
        System.out.println("");

        nguoi sv2=new nguoi("Chung Tan Phat",133,"Nam");
        sv2.xuatra();
        //tinh diem tb
        double dtbsv2=sv2.dtb(9,6.75);
        System.out.println("Diem TB: "+dtbsv2);
        System.out.println("");

        nguoi sv3=new nguoi("Tabitha",145,"Nu");
        sv3.xuatra();
        //tinh diem tb
        double dtbsv3=sv3.dtb(8,8.5,6);
        System.out.println("Diem TB: "+dtbsv3);
        //Set lai mssv
        sv3.setmssv(146);
        System.out.println("Ma so sinh vien khi dc cap nhat la: "+sv3.mssv);
        System.out.println("");
        //SV thuc hien phuong thuc khac
        nguoi sv4=new nguoi("Dang cap",123,"0 xac dinh");
        sv4.xuatra();
        //tinh tong diem
        double td=sv4.tongDiem(3,5,7.8,7,9.2);
        System.out.println("Tong Diem sv4: "+td);
        

    }
}
