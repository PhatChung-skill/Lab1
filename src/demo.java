import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //vẽ hình
        //hình vuông có ruột
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if(i==4||i==1||j==1||j==4){
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i==4||j==1||i==j){
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                if (i==4||j==1||i==j){
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=1;i<=4;i++){
            for (int j=4;j>=1;j--){
                if(i>=j){
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=1;i<=4;i++){
            for (int j=4;j>=1;j--){
                if(j==1||i==4||i==j){
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=4;i>=1;i--){
            for (int j=1;j<=7;j++){
                if (i==1||i==j||i<j){
                    System.out.print(+i+""+j+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a= dc.nextDouble();
        System.out.print("Nhap b: ");
        double b= dc.nextDouble();
        System.out.print("Nhap c: ");
        double c= dc.nextDouble();
        String kq=ptb2(a,b,c);
        System.out.println(kq);



        }

        public static String ptb2 (double a, double b, double c){
        if(a==0){
            if(b==0&&c==0)
                return "PT bac1 co vo so nghiem";
            else if(b==0&&c!=0)
                return "PT bac1 vo nghiem";
            else
                return "PT bac1 co nghiem: "+(-c/b);
        }
        else{
            double denta=(b*b)-4*a*c;
            if(denta<0)
                return "PT bac2 vo nghiem";
            else if (denta==0)
                return "PT bac2 co nghiem kep la: x= "+(-b/2*a);
            else{
                double x2=(-b-Math.sqrt(denta))/(2*a);
                double x1=(-b+Math.sqrt(denta))/(2*a);
                return "PT bac2 co 2 nghiem la: x1= "+x1+", x2= "+x2;
            }
        }
        }

    }

