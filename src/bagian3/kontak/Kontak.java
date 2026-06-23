package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Atribut baru

    // Constructor: dipanggil saat objek dibuat
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter: cara membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }
    
    // Getter baru untuk email
    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + nomor + ";" + email; // Diubah menjadi 3 bagian
    }

    // Mengembalikan keterangan kontak dalam bentuk teks
    public String info() {
        return nama + " - " + nomor + " - " + email; // Ditambah informasi email
    }
}