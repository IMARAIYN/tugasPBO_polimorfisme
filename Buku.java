public class Buku {
    private int jumlahBuku;
    private int hargaBuku;
    private int beratBuku;

    public Buku(int jumlahBuku, int hargaBuku) {
        this.jumlahBuku = jumlahBuku;
        this.hargaBuku = hargaBuku;
    }

    public Buku(int beratBuku) {
        this.beratBuku = beratBuku;
    }

    public void setBuku(int jumlahBuku, int hargaBuku) {
        this.jumlahBuku = jumlahBuku;
        this.hargaBuku = hargaBuku;
    }

    public void setBuku(int beratBuku) {
        this.beratBuku = beratBuku;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public int getHargaBuku() {
        return hargaBuku;
    }

    public int getBeratBuku() {
        return beratBuku;
    }

    public void info() {
        System.out.println("Jumlah Buku: " + getJumlahBuku());
        System.out.println("Total Harga Buku: " + getHargaBuku());
        System.out.println("Berat Buku: " + getBeratBuku());
    }
}
