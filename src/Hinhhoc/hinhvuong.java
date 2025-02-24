package Hinhhoc;

public class hinhvuong extends HinhHoc{
    private double canh;

    public hinhvuong(double canh){
        this.canh=canh;
    }

    //tinh chu vi
    @Override
    public String tinhchuvi() {
        if(canh<=0){
            return "Khong co canh de tinh chu vi";
        }
        else {
            return "Chu vi hinh vuong C= "+4*canh;
        }
    }

    //tinh dien tich
    @Override
    public String tinhdientich() {
        if(canh<=0){
            return "Khong co canh de tinh dien tich";
        }
        else {
            return "Dien tich hinh vuong S="+canh*canh;
        }
    }
    //xuatra
    public void xuat(){
        System.out.println("Canh ban vua nhap la: "+canh);
        System.out.println(tinhdientich());
        System.out.println(tinhchuvi());
    }
}
