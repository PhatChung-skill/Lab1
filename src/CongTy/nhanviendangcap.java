package CongTy;

public class nhanviendangcap extends nhanvien{
    protected String phongban;
    protected String ca;

    public nhanviendangcap(String ten, int cccd, String que,String phongban,String ca) {
        super(ten, cccd, que);
        this.phongban=phongban;
        this.ca=ca;
    }

    @Override
    public double tienluong() {
        return luongcoban*1.05;
    }
}
