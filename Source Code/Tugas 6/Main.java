package Main;

public class Main {

    public static void main(String[] args) {
        Manusia man1 = new Manusia("Aku", "3923842934", true, true);
        Manusia man2 = new Manusia("ani", "2394013453", false, true);
        Manusia man3 = new Manusia("budi", "1029384633", true, false);
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(man3.toString());

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Liam Simpati", "211923848288", true, false, "215150601211020", 3.25);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Harry Indosat", "201923848223", false, true, "225150601311030", 3.92);
        System.out.println(mhs1.toString());
        System.out.println(mhs2.toString());
        System.out.println(mhs3.toString());

        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        Pekerja pekerja2 = new Pekerja(9, 21, "195102439230", "Charlie Spring", "351717912", true, false);
        Pekerja pekerja3 = new Pekerja(5, 20, "195102439212", "Nick Nelson", "341717999", false, true);
        System.out.println(pekerja1.toString());
        System.out.println(pekerja2.toString());
        System.out.println(pekerja3.toString());

        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        Manajer manajer2 = new Manajer(7, 21, "204837283776", "Elle Yass", "351707384399", true, false, 1800);
        Manajer manajer3 = new Manajer(8, 22, "204837283745", "Will Xu", "351707384323", false, true, 1400);
        System.out.println(manajer1.toString());
        System.out.println(manajer2.toString());
        System.out.println(manajer3.toString());
    }
}