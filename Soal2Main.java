package PrakPBO;

interface TampilkanData {
    void tampilkanData();
}

class DataUniversitas implements TampilkanData {
    private String namaUniversitas;
    private String alamat;
    private String telepon;
    private String provinsi;
    private String negara;
    
    public DataUniversitas(String namaUniversitas, String alamat, String telepon, 
                          String provinsi, String negara) {
        this.namaUniversitas = namaUniversitas;
        this.alamat = alamat;
        this.telepon = telepon;
        this.provinsi = provinsi;
        this.negara = negara;
    }
    
    @Override
    public void tampilkanData() {
        System.out.println("========================================");
        System.out.println("        Data Universitas Cianjur        ");
        System.out.println("========================================");
        System.out.println("Nama Universitas  : " + namaUniversitas);
        System.out.println("Alamat            : " + alamat);
        System.out.println("Telepon           : " + telepon);
        System.out.println("Provinsi          : " + provinsi);
        System.out.println("Negara            : " + negara);
        System.out.println("========================================");
    }
}

public class Soal2Main {
    public static void main(String[] args) {
        System.out.println("=== Soal 2: Interface Data Universitas ===\n");
        
        DataUniversitas univ = new DataUniversitas(
            "Universitas Suryakancana",
            "Pasir Gede",
            "08123-3210-3123",
            "Jawa Barat",
            "Indonesia"
        );
        
        univ.tampilkanData();
    }
}
