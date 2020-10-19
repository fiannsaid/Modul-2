package Nomer3;

public class Pacar extends Mahasiswa{
    public String namaPacar = "Tidak Ada -_-";
    public int lamaHubungan = 0;

    public Pacar() {
    }

    public void getStatus() {
        System.out.println("Nama Pacar\t\t: " + this.namaPacar);
        System.out.println("Lama Hubungan\t: " + this.lamaHubungan);
    }
}
