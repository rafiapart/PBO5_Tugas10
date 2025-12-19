package PrakPBO;

class Karyawan {
    protected String nama;
    protected int id;
    protected double gajiPokok;
    
    public Karyawan(String nama, int id, double gajiPokok) {
        this.nama = nama;
        this.id = id;
        this.gajiPokok = gajiPokok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}

class Manager extends Karyawan {
    private double tunjangan;
    
    public Manager(String nama, int id, double gajiPokok, double tunjangan) {
        super(nama, id, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    public void tampilkanInfoLengkap() {
        System.out.println("=== Data Manager ===");
        System.out.println("Nama: " + super.nama);
        System.out.println("ID: " + super.id);
        System.out.println("Gaji Pokok: Rp " + super.gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + (super.gajiPokok + tunjangan));
    }
}

class Programmer extends Karyawan {
    private int proyekSelesai;
    private double bonusPerProyek;
    
    public Programmer(String nama, int id, double gajiPokok, int proyekSelesai, double bonusPerProyek) {
        super(nama, id, gajiPokok);
        this.proyekSelesai = proyekSelesai;
        this.bonusPerProyek = bonusPerProyek;
    }
    
    public void tampilkanInfoLengkap() {
        System.out.println("=== Data Programmer ===");
        System.out.println("Nama: " + super.nama);
        System.out.println("ID: " + super.id);
        System.out.println("Gaji Pokok: Rp " + super.gajiPokok);
        System.out.println("Proyek Selesai: " + proyekSelesai);
        System.out.println("Bonus per Proyek: Rp " + bonusPerProyek);
        System.out.println("Total Gaji: Rp " + (super.gajiPokok + (proyekSelesai * bonusPerProyek)));
    }
}

public class Soal4Main {
    public static void main(String[] args) {
        System.out.println("=== Soal 4: Akses Property Superclass ===\n");
        
        Manager manager = new Manager("Budi Santoso", 101, 8000000, 2000000);
        Programmer programmer = new Programmer("Siti Aminah", 201, 6000000, 5, 500000);
        
        manager.tampilkanInfoLengkap();
        System.out.println();
        programmer.tampilkanInfoLengkap();
        
        System.out.println("\n--- Penjelasan ---");
        System.out.println("Subclass dapat mengakses property superclass yang protected");
        System.out.println("menggunakan keyword 'super' atau langsung jika aksesnya diizinkan");
    }
}
