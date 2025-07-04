public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void tampilkan() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan);
    }
}
