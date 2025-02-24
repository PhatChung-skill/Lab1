package Hinhhoc;

public class hinhtron extends HinhHoc {
    private double r;

    public hinhtron(double r){
        this.r=r;
    }

    //tinh chu vi
    @Override
    public String tinhchuvi() {
        if(r<=0){
            return "Lam gi co ban kinh ma tinh chu vi";
        }
        else {
            return "Chu vi hinh tron C= "+2*3.141592*r;
        }
    }
    //tinh dien tich
    @Override
    public String tinhdientich() {
        if(r<=0){
            return "Lam gi co ban kinh ma tinh dien tich";
        }
        return "Dien tich hinh tron S="+3.141592*(r*r);
    }
    //xuat ra
    public void xuat(){
        System.out.println("Ban kinh ban nhap la R= "+r);
        System.out.println(tinhdientich());
        System.out.println(tinhchuvi());
    }

}
