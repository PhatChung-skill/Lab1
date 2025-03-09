package ongiuaky;

public class phanso {
    private int tuSo;
    private int mauSo;

    // Constructor
    public phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        this.toiGian(); // Tối giản phân số ngay khi tạo
    }

    // Phương thức cộng hai phân số
    public phanso cong(phanso phanSoKhac) {
        int tuSoMoi = this.tuSo * phanSoKhac.mauSo + phanSoKhac.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * phanSoKhac.mauSo;
        return new phanso(tuSoMoi, mauSoMoi);
    }

    // Phương thức trừ hai phân số
    public phanso tru(phanso phanSoKhac) {
        int tuSoMoi = this.tuSo * phanSoKhac.mauSo - phanSoKhac.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * phanSoKhac.mauSo;
        return new phanso(tuSoMoi, mauSoMoi);
    }

    // Phương thức nhân hai phân số
    public phanso nhan(phanso phanSoKhac) {
        int tuSoMoi = this.tuSo * phanSoKhac.tuSo;
        int mauSoMoi = this.mauSo * phanSoKhac.mauSo;
        return new phanso(tuSoMoi, mauSoMoi);
    }

    // Phương thức chia hai phân số
    public phanso chia(phanso phanSoKhac) {
        int tuSoMoi = this.tuSo * phanSoKhac.mauSo;
        int mauSoMoi = this.mauSo * phanSoKhac.tuSo;
        return new phanso(tuSoMoi, mauSoMoi);
    }

    // Phương thức tối giản phân số
    public void toiGian() {
        int ucln = timUCLN(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    // Phương thức tìm ước chung lớn nhất (UCLN)
    private int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return timUCLN(b, a % b);
    }

    // Phương thức nghịch đảo phân số
    public phanso nghichDao() {
        return new phanso(this.mauSo, this.tuSo);
    }

    // Phương thức toString để in phân số
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }


}
