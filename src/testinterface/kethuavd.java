package testinterface;

public class kethuavd implements vidu{

    @Override
    public String thongtin(String ten, String ngaysinh, int cccd) {
        return "Ho ten: "+ten+"\nNgay sinh: "+ngaysinh+"\nCan cuoc cong dan: "+cccd;
    }

    @Override
    public double tinhluong(double ngaylam, int ngaycong) {
        return ngaylam*ngaycong;
    }
}
