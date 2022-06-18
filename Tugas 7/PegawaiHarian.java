package Main;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private double totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, double totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public double getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        return "Pegawai Harian \t: " + getNama() +
                "\n" + "No KTP \t\t\t: " + getNoKTP() +
                "\n" + "Upah/jam \t\t: " + getUpahPerJam() +
                "\n" + "Total jam kerja : " + getTotalJam() +
                "\n" + "Pendapatan \t\t: Rp " + (int)(getUpahPerJam() * getTotalJam()) + "\n";
    }
}