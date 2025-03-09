package ongiuaky;

import java.util.Scanner;

public class ptbac2 {
    private double a;
    private double b;
    private double c;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap he so bac 2 a: ");
        a=sc.nextDouble();
        System.out.print("Nhap he so bac 1 b: ");
        b=sc.nextDouble();
        System.out.print("Nhap he so bac 0 c: ");
        c=sc.nextDouble();
    }

    public String tinh(){
        if(a==0){
            if(b==0&&c==0){
                return "PT bac 1 co vo so nghiem";
            }
            else if (b==0&&c!=0) {
                return "PT bac 1 vo nghiem";
            }
            else {
                double x=-c/b;
                return "Nghiem cua PT bac 1 x= "+x;
            }
        }

        else {
            double denta=b*b-4*a*c;
            if(denta>0){
                return "PT Bac 2 co 2 nghiem phan biet x1= "+(-b+Math.sqrt(denta))/(2*a)+" x2= "+(-b-Math.sqrt(denta)/(2*a));
            }
            else if (denta==0) {
                return "PT bac 2 co nghiem kep x= "+(-b/2*a);
            }
            else {
                return "PT bac 2 vo nghiem";
            }
        }
    }

    public void xuatra(){
        System.out.println(a+"x^2 + "+b+"x + "+c);
        System.out.println(tinh());
    }
}
