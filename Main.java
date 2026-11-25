
public class Main {
    public static void main(String[] args) {

    
        OtoDuLich xe1 = new OtoDuLich();

        xe1.setMaOto("36B99999");
        xe1.setTenXe("Limousine");
        xe1.setBienSo("36B99999");
        xe1.setNamSX(2000);
        xe1.setTinhTrang("Con moi toanh");
        xe1.setHangXe("Yamaha");
        xe1.setLoaiXe("Xe 16 cho");
        xe1.setMauSac("Mau hong");
        xe1.setSoChoNgoi(16);

  
        OtoVanTai xe2 = new OtoVanTai();

        xe2.setMaOto("XE12");
        xe2.setTenXe("Container");
        xe2.setBienSo("30A12345");
        xe2.setNamSX(2012);
        xe2.setTinhTrang("Da hong");
        xe2.setHangXe("BMW");
        xe2.setLoaiXe("Container11");
        xe2.setMauSac("Mau den");
        xe2.setTaiTrong(1000);


        System.out.println("______OTO DU LICH");
        xe1.hienthi();
        System.out.println("So cho ngoi: " + xe1.getSoChoNgoi());

      
        System.out.println("\n_____ OTO VAN TAI");
        xe2.hienthi();
        System.out.println("Tai trong: " + xe2.getTaiTrong());

    }
}
