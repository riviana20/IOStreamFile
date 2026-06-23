package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya (2. ditambah parameter email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        System.out.println();
        
        // mentes Soal 1: Uji Cari Kontak
        System.out.println("--- Uji Pencarian Kontak ---");
        bukuLain.cariKontak("Budi");   // Ditemukan
        bukuLain.cariKontak("Zayn");   // Tidak ditemukan

        System.out.println();

        // mentes Soal 3: Uji Hapus Kontak
        System.out.println("--- Uji Hapus Kontak ---");
        bukuLain.hapusKontak("Andi");  // Dihapus
        
        System.out.println();
        System.out.println("--- Keadaan Akhir Daftar Kontak ---");
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak akhir: " + bukuLain.jumlahKontak());
    }
}