package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        System.out.println("=== SOAL 1 ===");
        soal1();
        System.out.println("\n=== SOAL 2 ===");
        soal2();
        System.out.println("\n=== SOAL 3 ===");
        try {
            soal3();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Jawaban Soal 1
    public static void soal1() {
        File fileLaporan = new File("laporan.txt");
        System.out.println("Apakah berkas 'laporan.txt' ada? " + fileLaporan.exists());
        if (fileLaporan.exists()) {
            System.out.println("Ukuran : " + fileLaporan.length() + " byte");
        } else {
            System.out.println("Berkas tidak ditemukan, sehingga ukuran tidak dapat dicek.");
        }
    }

    // Jawaban Soal 2
    public static void soal2() {
        File folderArsip = new File("arsip");
        // Membuat folder menggunakan mkdir()
        boolean berhasil = folderArsip.mkdir();
        if (berhasil) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Gagal membuat folder 'arsip' (kemungkinan folder sudah ada).");
        }
    }

    // Jawaban Soal 3
    public static void soal3() throws IOException {
        File fileSementara = new File("sementara.txt");
        // 1. Status sebelum dibuat
        System.out.println("Status sebelum dibuat   : " + fileSementara.exists());
        // 2. Buat berkasnya
        if (fileSementara.createNewFile()) {
            System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
        }
        // 3. Status setelah dibuat
        System.out.println("Status setelah dibuat   : " + fileSementara.exists());
        // 4. Hapus berkas dengan delete()
        boolean terhapus = fileSementara.delete();
        if (terhapus) {
            System.out.println("Berkas berhasil dihapus.");
        }
        // 5. Status setelah dihapus
        System.out.println("Status setelah dihapus  : " + fileSementara.exists());
    }
}