public class Oto{
    private String maOto;
    private String tenXe;
    private String bienSo;
    private int namSX;
    private String tinhTrang;
    private String hangXe;
    private String loaiXe;
    private String mauSac;
    // ham khoi tao
    public Oto(){

    }
    //getter and setter
    public String getMaOto(){
        return maOto;
    }
    
    public void setMaOto(String maOto){
        this.maOto = maOto;
    }

    public String getTenXe(){
        return tenXe;
    }
    public void setTenXe(String tenXe){
        this.tenXe = tenXe;
    }
    public String getBienSo(){
        return bienSo;
    }
    public void setBienSo(String bienSo){
        this.bienSo = bienSo;
    }
    public int getNamSX(){
        return namSX;
    }
    public void setNamSX(int namSX){
        this.namSX = namSX;

    }
    public String getTinhTrang(){
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang){
        this.tinhTrang = tinhTrang;
    }
    public String getHangXe(){
        return hangXe;
    }
    public void setHangXe(String hangXe){
        this.hangXe = hangXe;
    }
    public String getLoaiXe(){
        return loaiXe;
    }
    public void setLoaiXe(String loaiXe){
        this.loaiXe = loaiXe;
    }
    public String getMauSac(){
        return mauSac;

    }
    public void setMauSac(String mauSac){
        this.mauSac = mauSac;
    }
    public void hienthi(){
        System.out.println("Ma Oto: " + maOto);
        System.out.println("Ten xe: " + tenXe);
        System.out.println("Bien so: "+ bienSo);
        System.out.println("Nam san xuat: " + namSX);
        System.out.println("Tinh Trang: "+tinhTrang);
        System.out.println("Hang xe: "+ hangXe);
        System.out.println("Loai xe: "+ loaiXe);
        System.out.println("Mau sac: "+mauSac);

    }
}