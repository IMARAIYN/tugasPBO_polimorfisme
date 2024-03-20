public class BukuNonFiksi extends Buku {

    BukuNonFiksi(int beratBuku) {
        super(beratBuku);
    }
    int getTotalBerat() {
        int beratBuku = super.getBeratBuku();
        return beratBuku;


    }
    ///@overide
    public String toString() {
        return "Berat Buku :" + getBeratBuku() + "gram";

    }

    @Override
    public void info() {
        System.out.println("Berat Buku Non Fiksi: " + getTotalBerat() + "gram");
    }
}
