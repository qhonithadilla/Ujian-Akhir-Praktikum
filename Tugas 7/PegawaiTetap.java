package Main;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap \t: " + getNama() +
                "\n" + "No KTP \t\t\t: " + getNoKTP() +
                "\n" + "Upah \t\t\t: " + getUpah() +
                "\n" + "Pendapatan \t\t: Rp " + (int)getUpah() + "\n";
    }
}
