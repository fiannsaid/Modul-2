package Nomer3;

public class Mahasiswa {
    public String nama = "M Alfian M.A";
    public String status = "Single";
    public int semester = 3;

    public Mahasiswa() {
    }

    public void getStatus() {
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Status\t\t\t: " + this.status);
        System.out.println("Semester\t\t: " + this.semester);
    }
}
