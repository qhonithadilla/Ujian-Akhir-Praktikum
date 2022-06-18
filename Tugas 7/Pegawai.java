package Main;

public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai (String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return "Pendapatan \t\t: Rp " + (int)gaji();
    }

    public static double gaji(){
        int gaji = 0;
        return gaji;
    }
}