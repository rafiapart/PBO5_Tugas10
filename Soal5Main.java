package PrakPBO;

class Produk {
    private String namaProduk;
    private double harga;
    private int stok;
    
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }
    
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }
}

class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, double harga, int stok, int garansi) {
        super(namaProduk, harga, stok);
        this.garansi = garansi;
    }
    
    public void tampilkanInfo() {
        System.out.println("=== Produk Elektronik ===");
        System.out.println("Nama: " + getNamaProduk());
        System.out.println("Harga: Rp " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Garansi: " + garansi + " bulan");
    }
    
    public void updateHarga(double hargaBaru) {
        System.out.println("\nMengupdate harga " + getNamaProduk() + "...");
        setHarga(hargaBaru);
        System.out.println("Harga baru: Rp " + getHarga());
    }
}

class Pakaian extends Produk {
    private String ukuran;
    
    public Pakaian(String namaProduk, double harga, int stok, String ukuran) {
        super(namaProduk, harga, stok);
        this.ukuran = ukuran;
    }
    
    public void tampilkanInfo() {
        System.out.println("=== Produk Pakaian ===");
        System.out.println("Nama: " + getNamaProduk());
        System.out.println("Harga: Rp " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Ukuran: " + ukuran);
    }
    
    public void updateStok(int stokBaru) {
        System.out.println("\nMengupdate stok " + getNamaProduk() + "...");
        setStok(stokBaru);
        System.out.println("Stok baru: " + getStok());
    }
}

public class Soal5Main {
    public static void main(String[] args) {
        System.out.println("=== Soal 5: Setter dan Getter Superclass ===\n");
        
        Elektronik laptop = new Elektronik("Laptop ASUS", 7500000, 15, 24);
        Pakaian kaos = new Pakaian("Kaos Polos", 75000, 50, "L");
        
        laptop.tampilkanInfo();
        System.out.println();
        kaos.tampilkanInfo();
        
        laptop.updateHarga(7000000);
        kaos.updateStok(45);
        
        System.out.println("\n--- Penjelasan ---");
        System.out.println("Subclass menggunakan setter dan getter dari superclass");
        System.out.println("untuk mengakses dan memodifikasi property private");
    }
}
