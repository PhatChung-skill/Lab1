package ongiuaky;

public class testphanso {
    public static void main(String[] args) {
        phanso ps1 = new phanso(1, 2);
        phanso ps2 = new phanso(1, 4);

        System.out.println("Phân số 1: " + ps1);
        System.out.println("Phân số 2: " + ps2);

        System.out.println("Cộng: " + ps1.cong(ps2));
        System.out.println("Trừ: " + ps1.tru(ps2));
        System.out.println("Nhân: " + ps1.nhan(ps2));
        System.out.println("Chia: " + ps1.chia(ps2));
        System.out.println("Nghịch đảo của phân số 1: " + ps1.nghichDao());
    }
}
