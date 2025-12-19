package PrakPBO;

abstract class Hewan {
    protected String nama;
    protected int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public abstract void bersuara();
    public abstract void bergerak();
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

class Kucing extends Hewan {
    private String ras;
    
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meow meow!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melompat dan berlari cepat");
    }
    
    public void tampilkanInfoLengkap() {
        System.out.println("=== Data Kucing ===");
        tampilkanInfo();
        System.out.println("Ras: " + ras);
    }
}

class Burung extends Hewan {
    private String jenisParuh;
    
    public Burung(String nama, int umur, String jenisParuh) {
        super(nama, umur);
        this.jenisParuh = jenisParuh;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit cuit!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan terbang di udara");
    }
    
    public void tampilkanInfoLengkap() {
        System.out.println("=== Data Burung ===");
        tampilkanInfo();
        System.out.println("Jenis Paruh: " + jenisParuh);
    }
}

class Ikan extends Hewan {
    private String jenisAir;
    
    public Ikan(String nama, int umur, String jenisAir) {
        super(nama, umur);
        this.jenisAir = jenisAir;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " tidak bersuara (ikan)");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan berenang di " + jenisAir);
    }
    
    public void tampilkanInfoLengkap() {
        System.out.println("=== Data Ikan ===");
        tampilkanInfo();
        System.out.println("Jenis Air: " + jenisAir);
    }
}

public class Soal6Main {
    public static void main(String[] args) {
        System.out.println("=== Soal 6: Abstract Class ===\n");
        
        Kucing kucing = new Kucing("Mimi", 2, "Persia");
        Burung burung = new Burung("Tweety", 1, "Pendek");
        Ikan ikan = new Ikan("Nemo", 1, "Air Laut");
        
        kucing.tampilkanInfoLengkap();
        kucing.bersuara();
        kucing.bergerak();
        
        System.out.println();
        
        burung.tampilkanInfoLengkap();
        burung.bersuara();
        burung.bergerak();
        
        System.out.println();
        
        ikan.tampilkanInfoLengkap();
        ikan.bersuara();
        ikan.bergerak();
        
        System.out.println("\n--- Penjelasan ---");
        System.out.println("Abstract class tidak dapat diinstansiasi langsung");
        System.out.println("Subclass HARUS mengimplementasikan semua abstract method");
    }
}
