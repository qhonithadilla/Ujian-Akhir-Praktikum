package Main;

public class Sales extends Pegawai {
    private double penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, double penjualan, double komisi){
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public double getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return "Sales \t\t\t: " + getNama() +
                "\n" + "No KTP \t\t\t: " + getNoKTP() +
                "\n" + "Total Penjualan : " + getPenjualan() +
                "\n" + "Besaran Komisi \t: " + getKomisi() +
                "\n" + "Pendapatan \t\t: Rp " + (int)(getPenjualan() * getKomisi()) + "\n";
    }
}