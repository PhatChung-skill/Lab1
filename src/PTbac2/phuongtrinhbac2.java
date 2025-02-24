package PTbac2;

public class phuongtrinhbac2 {
    private double a;
    private double b;
    private double c;

    public phuongtrinhbac2(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    //giai pt bac 2
    public String giai(){
        if(a==0){
            if (b==0&&c==0){
                return "Phuong trinh bac 1 co vo so nghiem!";
            }
            else if (b==0&&c!=0) {
                return "Phuong trinh bac 1 vo nghiem";
            }
            else {
                double x=-c/b;
                return "Phuong trinh bac 1 co nghiem la: "+x;
            }
        }
        else {
            double dt=b*b-4*a*c;
            if(dt>0){
                return "Phuong trinh bac 2 co 2 nghiem phan biet x1= "+(-b+Math.sqrt(dt))/(2*a)+" x2= "+(-b-Math.sqrt(dt))/(2*a);
            }
            else if(dt==0){
                return "Phuong trinh bac 2 co nghiem kep x= "+(-b/2*a);
            }
            else {
                return "Phuong trinh bac 2 vo nghiem";
            }
        }
    }
    //xuat ra mang hinh
    public void xuat(){
        System.out.println(a+"x^2 + "+b+"x +"+c);
    }
}
