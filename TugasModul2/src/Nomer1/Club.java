package Nomer1;

public class Club {
    String nama;
    int tahunBerdiri;
    String stadion;
    int juaraChampion;
    String deskripsi;

    public Club() {
    }

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraChampion, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraChampion = juaraChampion;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        System.out.println("Nama Club\t\t: " + this.nama);
        System.out.println("Tahun Berdiri\t: " + this.tahunBerdiri);
        System.out.println("Nama Stadion\t: " + this.stadion);
        System.out.println("Juara Champion\t\t: " + this.juaraChampion);
        System.out.println("Deskripsi Club\t: " + this.deskripsi);
    }
}
