package PrakPBO;

class Kendaraan {
    protected String merk;
    protected int tahunProduksi;
    
    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void tampilkanInfo() {
        System.out.println("Kendaraan: " + merk + ", Tahun: " + tahunProduksi);
    }
    
    public void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan");
    }
}

class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil: " + merk + ", Tahun: " + tahunProduksi + 
                         ", Pintu: " + jumlahPintu);
    }
    
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan dengan kunci kontak");
    }
}

class Motor extends Kendaraan {
    private String tipeMotor;
    
    public Motor(String merk, int tahunProduksi, String tipeMotor) {
        super(merk, tahunProduksi);
        this.tipeMotor = tipeMotor;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Motor: " + merk + ", Tahun: " + tahunProduksi + 
                         ", Tipe: " + tipeMotor);
    }
    
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin motor dinyalakan dengan kick starter atau elektrik");
    }
}

public class Soal3Main {
    public static void main(String[] args) {
        System.out.println("=== Soal 3: Method Override ===\n");
        
        Kendaraan kendaraan1 = new Mobil("Toyota Avanza", 2023, 4);
        Kendaraan kendaraan2 = new Motor("Honda Beat", 2022, "Matic");
        
        System.out.println("--- Mobil ---");
        kendaraan1.tampilkanInfo();
        kendaraan1.nyalakanMesin();
        
        System.out.println("\n--- Motor ---");
        kendaraan2.tampilkanInfo();
        kendaraan2.nyalakanMesin();
        
        System.out.println("\n--- Demonstrasi Property Override ---");
        System.out.println("Method override berhasil!");
        System.out.println("Setiap subclass memiliki implementasi berbeda untuk method yang sama");
    }
}
