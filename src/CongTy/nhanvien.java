package CongTy;

public abstract class nhanvien {
    protected String ten;
    protected int cccd;
    protected String que;
    protected double luongcoban=850;

    public nhanvien (String ten,int cccd, String que){
        this.ten=ten;
        this.cccd=cccd;
        this.que=que;
    }

    public abstract double tienluong();

    public void xuatra(){
        System.out.println("Ten nhan vien: "+ten);
        System.out.println("So can cuoc cong dan: "+cccd);
        System.out.println("Que quan: "+que);
    }

}
