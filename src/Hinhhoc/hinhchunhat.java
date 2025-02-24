package Hinhhoc;

public class hinhchunhat extends HinhHoc{
    private double dai;
    private double rong;

    public hinhchunhat(double dai,double rong){
        if(dai==rong&&dai>0&&rong>0){
            System.out.println("Day la hinh vuong ma");
        }
        this.dai=dai;
        this.rong=rong;
    }

    //tinh chu vi
    @Override
    public String tinhchuvi() {
        if (dai==rong&&dai>0&&rong>0){
            return "Chu vi hinh vuong C= "+4*dai;
        }
        else if(dai<=0||rong<=0){
            return "Khong co hinh chu nhat nao ca";
        }
        else {
            return"Chu vi hinh chu nhat C= "+ 2*(dai+rong);
        }
    }

    //tinh dien tich
    @Override
    public String tinhdientich() {
        if (dai==rong&&dai>0&&rong>0){
            return "Dien tich hinh vuong S= "+dai*rong;
        }
        else if (dai<=0||rong<=0){
            return "Canh khong phu hop de tinh Dien tich";
        }
        else {
            return "Dien tich hinh chu nhat S= "+dai*rong;
        }
    }
    //xuat ra mang hinh
    public void xuat(){
        System.out.println("Chieu dai: "+dai+" Chieu rong: "+rong);
        System.out.println(tinhdientich());
        System.out.println(tinhchuvi());
    }
}
