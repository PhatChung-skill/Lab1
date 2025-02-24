public class nguoi {
   protected String name;
   protected int mssv;
   protected String gioitinh;

   public nguoi(String name,int mssv,String gioitinh){
       this.name=name;
       this.mssv=mssv;
       this.gioitinh=gioitinh;
   }

   public void xuatra(){
       System.out.println("Ho ten: "+name);
       System.out.println("Ma so sinh vien: "+mssv);
       System.out.println("Gioi tinh: "+gioitinh);
   }

   public double dtb(double diemtoan,double diemanh){
       return (diemtoan+diemanh)/2;
   }

    public double dtb(double diemtoan,double diemanh, double diemvan){
        return (diemtoan+diemanh+diemvan)/3;
    }

   public void setmssv(int mssv){
       this.mssv=mssv;
   }

  public double tongDiem(double...arr){
       double tong=0.0;
       for(double x: arr){
           tong+=x;
       }
       return tong;
  }

}
