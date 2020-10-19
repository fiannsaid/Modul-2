package Nomer2;

public class Kucing extends Binatang {
    public String nama;
    public String meong;

    public Kucing() {
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + this.nama);
    }

    public void meong() {
        System.out.println("Aktivitas\t\t: " + this.meong);
    }
}
