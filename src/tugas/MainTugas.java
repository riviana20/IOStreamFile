package tugas;

//Nama : Riviana Serly Septianty
//NPM  : 2410010248

public class MainTugas {
    public static void main(String[] args) {
        // 1. Array String kategori berukuran tetap dan menampilkannya
        String[] kategori = {"Elektronik", "Pakaian", "Makanan"};
        System.out.println("--- Kategori Toko ---");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();

        // 2. Membuat objek Gudang dan menambahkan 5 objek Barang
        Gudang gudangUtama = new Gudang("barang.txt");
        
        gudangUtama.tambahBarang(new Barang("Laptop", 7500000.0, 10));
        gudangUtama.tambahBarang(new Barang("Mouse", 150000.0, 50));
        gudangUtama.tambahBarang(new Barang("Kemeja", 200000.0, 25));
        gudangUtama.tambahBarang(new Barang("Celana", 250000.0, 30));
        gudangUtama.tambahBarang(new Barang("Biskuit", 15000.0, 100));

        System.out.println("--- Menampilkan Data Awal ---");
        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();

        // 3. Membuat objek Gudang baru, memuat kembali dari berkas dan menampilkan total
        System.out.println("--- Memuat Ulang Data dari Berkas (Gudang Cabang) ---");
        Gudang gudangCabang = new Gudang("barang.txt");
        
        gudangCabang.muatDariBerkas();
        gudangCabang.tampilkanSemua();
        
        System.out.println("Total Nilai Persediaan Barang: Rp" + gudangCabang.totalNilai());
    }
}