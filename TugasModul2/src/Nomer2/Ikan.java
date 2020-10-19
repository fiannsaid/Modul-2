package Nomer2;

public class Ikan extends Binatang {
    public String nama;
    public String berenang;

    public Ikan() {
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + this.nama);
    }

    public void berenang() {
        System.out.println("Aktivitas\t\t: " + this.berenang);
    }
}
