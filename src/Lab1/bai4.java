package Lab1;

import java.util.Scanner;

public class bai4 {
    private int nam;
    
    public void input(){
        Scanner dc=new Scanner(System.in);
        System.out.print("Moi nhap nam: ");
        nam= dc.nextInt();
    }
    
    public String tinh(){
        if(nam<0){
            return "Nam nhap khong hop le!!!";
        } else if (nam%4==0&&nam%100!=0||nam%400==0) {
            return "Nam "+nam+" la nam nhuan!";
        }
        else {
            return "Nam "+nam+" khong phai nam nhuan!";
        }
    }

    public void xuatra(){
        System.out.println("Nam ban vua nhap la: "+nam);
        System.out.println(tinh());
    }
}
