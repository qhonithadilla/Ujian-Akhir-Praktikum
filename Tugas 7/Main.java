package Main;

public class Main {

    public static void main(String[] args) {
        Pegawai pegawaiTetap1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000.0);
        Pegawai pegawaiTetap2 = new PegawaiTetap("Armand", "987651234958245029812", 4000000.0);
        Pegawai pegawaiTetap3 = new PegawaiTetap("Max", "1284037294027463829876", 3500000.0);

        Pegawai pegawaiHarian1 = new PegawaiHarian("Edo", "350728490327424892343", 8500.0, 40.0);
        Pegawai pegawaiHarian2 = new PegawaiHarian("Harvey", "987651234958245029813", 9300.0, 80.0);
        Pegawai pegawaiHarian3 = new PegawaiHarian("Keaton", "1284037294027463829877", 8300.0, 50.0);

        Pegawai sales1 = new Sales("Tika", "350728490327424892344", 50.0, 50000.0);
        Pegawai sales2 = new Sales("Alex", "987651234958245029814", 42.0, 51500.0);
        Pegawai sales3 = new Sales("Jayden", "1284037294027463829878", 61.0, 60000.0);

        System.out.println(pegawaiTetap1);
        System.out.println(pegawaiTetap2);
        System.out.println(pegawaiTetap3);

        System.out.println(pegawaiHarian1);
        System.out.println(pegawaiHarian2);
        System.out.println(pegawaiHarian3);

        System.out.println(sales1);
        System.out.println(sales2);
        System.out.println(sales3);

    }
}
