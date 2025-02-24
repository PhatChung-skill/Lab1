package Lab1;

import java.util.Scanner;

public class bai2 {
    private double dai;
    private double rong;


    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai= dc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong= dc.nextDouble();
    }


    public double getDai(){
        return dai;
    }

    public double getRong(){
        return rong;
    }

    public String dientich(){
        if(dai==rong&&dai>0&&rong>0){
            return "0 tinh hinh vuong";
        }
        else if (dai<=0||rong<=0) {
            return "Do dai 0 hop de tinh dien tich";
        }
        else if (dai<=rong&&dai>0&&rong>0) {
            return "Dai phai lon hon rong khong tinh dien tich";
        }
        else {
            return "Dien tich hinh chu nhat S= "+dai*rong;
        }
    }
    //chuvi
    public String chuvi(){
        if(dai==rong&&dai>0&&rong>0){
            return "0 tinh hinh vuong";
        }
        else if (dai<=0||rong<=0) {
            return "Do dai 0 hop de tinh chu vi";
        }
        else if (dai<=rong&&dai>0&&rong>0) {
            return "Dai phai lon hon rong khong tinh chu vi";
        }
        else {
            return "Chu vi hinh chu nhat C= "+2*(dai+rong);
        }
    }
    public void xuatra(){
        System.out.println("Chieu dai: "+dai+" Chieu rong: "+rong);
        System.out.println(dientich());
        System.out.println(chuvi());
    }

}
