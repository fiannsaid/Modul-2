package Nomer2;

public class Burung extends Binatang {
    public String nama;
    public String terbang;

    public Burung() {
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + this.nama);
    }

    public void terbang() {
        System.out.println("Aktivitas\t\t: " + this.terbang);
    }
}

