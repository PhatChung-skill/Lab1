package PTbac1;

public class phuongtrinhbac1 {
    private double a;
    private double b;

    public phuongtrinhbac1(double a, double b){
        this.a=a;
        this.b=b;
    }

    public String giai(){
        if(a==0&&b==0){
            return "Phuong trinh vo so nghiem";
        }
        else if (a==0&&b!=0) {
            return "Phuong trinh vo nghiem";
        }
        else {
            double x=-b/a;
            return "Nghiem cua PT la x= "+x;
        }
    }

    public void xuat(){
        System.out.println(+a+"x+"+b+"=0");
    }
}
