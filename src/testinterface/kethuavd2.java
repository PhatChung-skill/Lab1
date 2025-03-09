package testinterface;

public class kethuavd2 implements vd2{
    @Override
    public String tienthuong(int cccd, double thuongthem) {
        return "Thuong them: "+thuongthem;
    }

    @Override
    public String thongtin(String ten, String ngaysinh, int cccd) {
        return "Ho ten: "+ten+"\nNgay sinh: "+ngaysinh+"\nCan cuoc cong dan: "+cccd;
    }

    @Override
    public double tinhluong(double ngaylam, int ngaycong) {
        return ngaylam*ngaycong;
    }
}
