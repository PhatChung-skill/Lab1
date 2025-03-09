package ongiuaky;

public class testptbac2 {
    public static void main(String[] args) {
        ptbac2 pt1=new ptbac2();
        ptbac2 pt2=new ptbac2();

        //nhap thong tin
        System.out.println("Nhap thong tin pt1");
        pt1.input();
        System.out.println("Nhap thong tin pt2");
        pt2.input();

        //xuat ra thong tin
        System.out.println("Ket qua pt1");
        pt1.xuatra();
        System.out.println("");
        System.out.println("Ket qua pt2");
        pt2.xuatra();

    }
}
