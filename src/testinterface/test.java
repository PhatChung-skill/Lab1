package testinterface;

public class test {
    public static void main(String[] args) {
        kethuavd nd1=new kethuavd();
        String tt1=nd1.thongtin("Minh Dang cap","NULL",116);
        System.out.println(tt1);
        double luong1=nd1.tinhluong(5,21);
        System.out.println("tien luong: "+luong1);
        System.out.println("");

        kethuavd2 nd2=new kethuavd2();
        String tt2= nd2.thongtin("Chung Tan Phat","23/01/2005",133);
        System.out.println(tt2);
        double luong2= nd2.tinhluong(7,20);
        System.out.println("Tien luong: "+luong2);
        String thuong1=nd2.tienthuong(133,5);
        System.out.println(thuong1);
    }
}
