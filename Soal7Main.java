package PrakPBO;

interface Pembayaran {
    void prosesPembayaran();
    void cetakStruk();
}

class Main {
    protected String nama;
    protected String jenis;
    protected String informasi;
    
    public Main(String nama, String jenis, String informasi) {
        this.nama = nama;
        this.jenis = jenis;
        this.informasi = informasi;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Informasi: " + informasi);
    }
}

class Model extends Main implements Pembayaran {
    private String model;
    private double harga;
    
    public Model(String nama, String jenis, String informasi, String model, double harga) {
        super(nama, jenis, informasi);
        this.model = model;
        this.harga = harga;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran untuk " + model);
        System.out.println("Total: Rp " + harga);
    }
    
    @Override
    public void cetakStruk() {
        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        tampilkanInfo();
        System.out.println("Model: " + model);
        System.out.println("Harga: Rp " + harga);
        System.out.println("=====================================");
    }
}

class Peralatan extends Model {
    private String merek;
    private int garansi;
    
    public Peralatan(String nama, String jenis, String informasi, 
                     String model, double harga, String merek, int garansi) {
        super(nama, jenis, informasi, model, harga);
        this.merek = merek;
        this.garansi = garansi;
    }
    
    public void tampilkanDetailPeralatan() {
        System.out.println("\n=== Detail Peralatan ===");
        tampilkanInfo();
        System.out.println("Merek: " + merek);
        System.out.println("Garansi: " + garansi + " bulan");
    }
}

class KapanSini extends Model {
    private String waktuKedatangan;
    private String status;
    
    public KapanSini(String nama, String jenis, String informasi, 
                     String model, double harga, String waktuKedatangan, String status) {
        super(nama, jenis, informasi, model, harga);
        this.waktuKedatangan = waktuKedatangan;
        this.status = status;
    }
    
    public void tampilkanDetailKedatangan() {
        System.out.println("\n=== Detail Jadwal ===");
        tampilkanInfo();
        System.out.println("Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Status: " + status);
    }
}

public class Soal7Main {
    public static void main(String[] args) {       
        Peralatan peralatan = new Peralatan(
            "Laptop Gaming",
            "Elektronik",
            "Laptop untuk gaming dan multimedia",
            "ROG Strix G15",
            15000000,
            "ASUS",
            24
        );
        
        KapanSini jadwal = new KapanSini(
            "Pengiriman Barang",
            "Logistik",
            "Pengiriman dari gudang ke toko",
            "Express",
            50000,
            "10:00 WIB",
            "Dalam Perjalanan"
        );
        
        peralatan.tampilkanDetailPeralatan();
        peralatan.prosesPembayaran();
        peralatan.cetakStruk();
        
        jadwal.tampilkanDetailKedatangan();
        jadwal.prosesPembayaran();
        jadwal.cetakStruk();
        
        System.out.println("\n--- Penjelasan Struktur ---");
        System.out.println("Main <- Model <- Peralatan");
        System.out.println("Main <- Model <- KapanSini");
        System.out.println("Model implements Pembayaran");
    }
}
