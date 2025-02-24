package PTbac2;

public class test {
    public static void main(String[] args) {
        phuongtrinhbac2 pt1=new phuongtrinhbac2(0,3,4);
        pt1.xuat();
        String tinh=pt1.giai();
        System.out.println("Ket qua: "+tinh);
        System.out.println("");

        phuongtrinhbac2 pt2=new phuongtrinhbac2(2,2,0);
        pt2.xuat();
        String tt=pt2.giai();
        System.out.println("Ket qua: "+tt);
    }
}
