package PrakPBO;

class Bentuk {
    public void luaz() {
        System.out.println("Menghitung luas bentuk");
    }
}

class PersegiPanjang extends Bentuk {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public void luaz() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
}

class Segitiga extends Bentuk {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void luaz() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
    }
}

class Lingkaran extends Bentuk {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public void luaz() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
    }
}

public class Soal1Main {
    public static void main(String[] args) {
        System.out.println("=== Soal 1: Polimorfisme Bentuk ===\n");
        
        Bentuk[] bentukArray = new Bentuk[3];
        bentukArray[0] = new PersegiPanjang(10, 5);
        bentukArray[1] = new Segitiga(8, 6);
        bentukArray[2] = new Lingkaran(7);
        
        for (Bentuk bentuk : bentukArray) {
            bentuk.luaz();
        }
    }
}
