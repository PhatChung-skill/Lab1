package Lab1;

public class bai1 {
    private String hoten;
    private String ngaysinh;
    private int mssv;

    public bai1(String hoten,String ngaysinh,int mssv){
        this.hoten=hoten;
        this.ngaysinh=ngaysinh;
        this.mssv=mssv;
    }

    public void xuat(){
        System.out.println("Ho ten: "+hoten);
        System.out.println("Ngay sinh: "+ngaysinh);
        System.out.println("Ma so sinh vien: "+mssv);
    }
}
