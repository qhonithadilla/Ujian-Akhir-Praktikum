package Main;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){

        return null;
    }

    @Override
    public String toString() {
        super.toString();
        return "Pekerja{" + "gaji=" + getGaji() + ", bonus=" + getBonus() + ", jamKerja=" + getJamKerja() + ", hariKerja=" + getHariKerja() + ", NIP='" + getNIP() + '\'' + '}';
    }
}