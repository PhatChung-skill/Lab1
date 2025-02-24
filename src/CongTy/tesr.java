package CongTy;

public class tesr {
    public static void main(String[] args) {
        nhanviendangcap nv1=new nhanviendangcap("Chung Tan Phat",13321,"Tp.HCM","quan ly","ca 1");
        nv1.xuatra();
        System.out.println("Phong ban: "+nv1.phongban);
        System.out.println("Ca lam: "+nv1.ca);
        //tinh tien luong
        double luongnv1=nv1.tienluong();
        System.out.println("Tien luong la: "+luongnv1);
        System.out.println("");

        nhavienhanhchinh hc1=new nhavienhanhchinh("Tran Tuan Minh",11632,"Ben tre","nhan su","ca 2");
        hc1.xuatra();
        System.out.println("Phong ban: "+hc1.phongban);
        System.out.println("Ca lam: "+hc1.ca);
        //tinh tien luong
        double luonghc1=hc1.tienluong();
        System.out.println("Tien luong la: "+luonghc1);
    }
}
