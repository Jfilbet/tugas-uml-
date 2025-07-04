import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void hapusMahasiswa(String nim) {
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                daftarMahasiswa.remove(mhs);
                System.out.println("Mahasiswa berhasil dihapus.");
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    public void tampilkanSemua() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang terdaftar.");
        } else {
            System.out.println("\nDaftar Mahasiswa:");
            for (Mahasiswa mhs : daftarMahasiswa) {
                mhs.tampilkan();
            }
        }
    }
}
