import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan);
                    manajemen.tambahMahasiswa(mhs);
                    break;
                case "2":
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = input.nextLine();
                    manajemen.hapusMahasiswa(nimHapus);
                    break;
                case "3":
                    manajemen.tampilkanSemua();
                    break;
                case "4":
                    System.out.println("Terima kasih.");
                    input.close(); // ✅ Tutup Scanner
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
