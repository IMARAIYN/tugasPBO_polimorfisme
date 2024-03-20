public class BukuFiksi extends Buku{
    BukuFiksi(int jumlahBuku, int hargaBuku) {
        super(jumlahBuku,hargaBuku);
    }
   
    int getTotalHarga() {
        int jumlahBuku = super.getJumlahBuku();
        int hargaBuku = super.getHargaBuku();
        return jumlahBuku*hargaBuku;
    }
    
    public String toString() {
    return "Total Harga yang dibayar: " + getTotalHarga();
    
    }

    public void info() {
    System.out.println("Jumlah Buku Fiksi yang dibeli: " + super.getJumlahBuku());
    System.out.println("Harga Buku Fiksi yang dibeli: " + super.getHargaBuku());
    }
}