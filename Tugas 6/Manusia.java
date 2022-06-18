package Main;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){

        return 0;
    }

    public double getPendapatan(){

        return 0;
    }

    public String toString() {
        return "Manusia{" + "nama='" + getNama() + '\'' + ", NIK='" + getNIK() + '\'' + ", jenisKelamin=" + isJenisKelamin() + ", pendapatan=" + getPendapatan() + '}';
    }
}