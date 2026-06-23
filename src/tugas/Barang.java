package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method Getter
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    // Method untuk format penyimpanan ke berkas teks
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Method untuk menampilkan info ringkas barang
    public String info() {
        return nama + " (Rp" + harga + " x " + stok + " pcs)";
    }
}