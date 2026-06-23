package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";

        System.out.println("=== SOAL 1: Tulis 5 Hari & Baca Kembali ===");
        // Pakai cara Latihan 3 untuk menulis
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            System.out.println("-> Berhasil menulis 5 nama hari ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menulis file: " + e.getMessage());
        }

        // Pakai cara Latihan 4 untuk membaca
        System.out.println("Isi file saat ini:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }

        System.out.println("\n=== SOAL 2: Tambah (Append) 2 Hari & Tampilkan Semua ===");
        // Pakai cara Latihan 5 (append = true) untuk menambahkan data
        try (PrintWriter penulisAppend = new PrintWriter(new FileWriter(namaFile, true))) {
            penulisAppend.println("Sabtu");
            penulisAppend.println("Minggu");
            System.out.println("-> Berhasil menambahkan Sabtu dan Minggu ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        System.out.println("Isi keseluruhan setelah ditambah:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }

        System.out.println("\n=== SOAL 3: Hitung Jumlah Baris ===");
        int jumlahBaris = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah baris di dalam berkas '" + namaFile + "' adalah: " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Gagal menghitung baris: " + e.getMessage());
        }
    }
}