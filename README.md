# Ujian-Akhir-Praktikum

## Tugas 1
Method

- Menghitung Luas

```java
package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Menghitung Luas

public class Luas{
        int Persegi;
        int Segitiga;
        double Lingkaran;
        static int pilih;

        Luas(int s){
            this.Persegi = s * s;
        }
        Luas(double a, double t){
            this.Segitiga = (int) (a * t) / 2;
        }
        Luas(double r){
            if (r % 7 == 0){
                double phi = 22/7;
                double lingkaran = phi * r * r;
                this.Lingkaran= (int) lingkaran;
            }
            else if (r % 7 != 0){
                double phi = 3.14;
                double lingkaran = phi * r * r;
                this.Lingkaran= (int) lingkaran;
            }
        }
        void pilih(){
            if (pilih == 1){
                System.out.println(Persegi);
            }
            else if (pilih == 2){
                System.out.println(Segitiga);
            }
            else if (pilih == 3){
                System.out.println(Lingkaran);
            }
            else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            pilih = scan.nextInt();

            if (pilih == 1){
                int sisi= scan.nextInt();
                Luas persegi = new Luas(sisi);
                persegi.pilih();
            }
            else if (pilih == 2){
                double alas = scan.nextInt();
                double tinggi = scan.nextInt();
                Luas segitiga = new Luas(alas,tinggi);
                segitiga.pilih();
            }
            else if (pilih == 3){
                double jarijari = scan.nextInt();
                Luas lingkaran = new Luas(jarijari);
                lingkaran.pilih();
            }
            else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
        }
    }
```

- Menghitung Saldo

```java
package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Saldo Nasababah

public class Saldo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = scan.nextInt();
        double setoran = scan.nextInt();

        System.out.println(saldoFinal(saldo, setoran));
    }

    public static double saldoFinal (double j, double k) {
        double kurang = (j + k) - 7000;
        double bonus = kurang * 0.05 / 100;

        return kurang + bonus;
    }
}
```


- Menentukan Teks Kaisar

```java
package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Teks Kaisar

public class teksKaisar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String teks = scan.nextLine();
        int nilai = scan.nextInt();

        tekskaisar(teks, nilai);

    }
    public static void tekskaisar(String teks, int nilai) {
        String s = "";
        char alphabet;

        for(int i = 0; i < teks.length(); i++) {
            alphabet = teks.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + nilai);

                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                s += alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + nilai);

                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                s += alphabet;
            }
            else {
                s += alphabet;
            }

        }
        System.out.println(s);
    }
}
```


## Tugas 2

Menghitung Luas dengan Konsep OOP

```java
package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Menghitung Luas

public class Solution {
    int Persegi;
    int Segitiga;
    double Lingkaran;
    static int pilih;

    public Solution(int s){
        this.Persegi = s * s;
    }
    public Solution(double a, double t){
        this.Segitiga = (int) (a * t) / 2;
    }
    public Solution(double r){
        if (r % 7 == 0){
            double phi = 22/7;
            double lingkaran = phi * r * r;
            this.Lingkaran= (int) lingkaran;
        }
        else if (r % 7 != 0){
            double phi = 3.14;
            double lingkaran = phi * r * r;
            this.Lingkaran= (int) lingkaran;
        }
    }
    void pilih(){
        if (pilih == 1){
            System.out.println(Persegi);
        }
        else if (pilih == 2){
            System.out.println(Segitiga);
        }
        else if (pilih == 3){
            System.out.println(Lingkaran);
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pilih = scan.nextInt();

        if (pilih == 1){
            int sisi= scan.nextInt();
            Solution persegi = new Solution(sisi);
            persegi.pilih();
        }
        else if (pilih == 2){
            double alas = scan.nextInt();
            double tinggi = scan.nextInt();
            Solution segitiga = new Solution(alas,tinggi);
            segitiga.pilih();
        }
        else if (pilih == 3){
            double jarijari = scan.nextInt();
            Solution lingkaran = new Solution(jarijari);
            lingkaran.pilih();
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
```


## Tugas 3 

Studi Kasus Erigo Store Malang

```java
package Main;

import java.util.Scanner;

public class baju {
    final int bajua, bajub, bajuc;
    int total;

    public baju(int hargaa, int hargab, int hargac){
        bajua = hargaa;
        bajub = hargab;
        bajuc = hargac;
    }
    public int getBajua(){
        return bajua;
    }
    public int getBajub() {
        return bajub;
    }
    public int getBajuc() {
        return bajuc;
    }
    public void display (String jenis, int jumlah){
        if (jenis.equalsIgnoreCase("a")){
            total = getBajua() * jumlah;
        }
        else if (jenis.equalsIgnoreCase("b")){
            total = getBajub() * jumlah;
        }
        else if (jenis.equalsIgnoreCase("c")){
            total = getBajuc() * jumlah;
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah\t\t : " + getBajua() );
        System.out.println("Total harga\t\t\t : " + total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        baju hargabju = new baju(100000, 125000, 175000);
        baju hrgdiskon = new baju(95000, 120000, 160000);

        System.out.println("Baju yang tersedia : ");
        System.out.print("""
                Baju A dengan harga 100000
                Baju B dengan harga 125000
                Baju C dengan harga 175000
                """);

        System.out.print("Baju yang akan anda beli bertipe : ");
        String pilih = scan.next();
        if (pilih.equalsIgnoreCase("a")){
            System.out.print("jumlah Baju yang akan anda beli adalah : ");
            int jum = scan.nextInt();
            if (jum <= 100){
                hargabju.display(pilih, jum);
            }
            else {
                hrgdiskon.display(pilih, jum);
            }
        }
        else if (pilih.equalsIgnoreCase("b")){
            System.out.print("jumlah Baju yang akan anda beli adalah : ");
            int jum = scan.nextInt();
            if (jum <= 100){
                hargabju.display(pilih, jum);
            }
            else {
                hrgdiskon.display(pilih, jum);
            }
        }
        else if (pilih.equalsIgnoreCase("c")){
            System.out.print("jumlah Baju yang akan anda beli adalah : ");
            int jum = scan.nextInt();
            if (jum <= 100){
                hargabju.display(pilih, jum);
            }
            else {
                hrgdiskon.display(pilih, jum);
            }
        }
    }
}
```


## Tugas 4

Studi Kasus UB Company (Enkapsulasi dan Kelas Relasi)

- class Main

```java
package Main;

public class Main {
    public static void main(String[] args) {

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.scan.nextLine(), DataMerchant.scan.nextLine(), DataMerchant.scan.nextDouble()));
        DataMerchant.tampilData();
    }
}
```

- class Merchant

```java
package Main;

public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;

    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan) {
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

}
```

- class DataMerchant

```java
package Main;

import java.util.Scanner;

public class DataMerchant {
    static Scanner scan = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant temp []=new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++){
            temp [i]=DataMerchant.merc[i];
        }
        temp[DataMerchant.merc.length]=merchant;
        return temp;
    }

    public static void tampilData(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant Food====");
            System.out.println("Nama Merchant   : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama){
        for(int i = 0; i < DataMerchant.merc.length; i++){
            if (nama.equalsIgnoreCase(DataMerchant.merc[i].getNamaMerchant())){
                return DataMerchant.merc[i];
            }
        }
        return null;
    }

    public static void updateMerchant(Merchant merchant){

    }
}
```


## Tugas 5
Studi Kasus Sewa Mobil (ArrayList)

- class Main
```java
package Main;

public class Main {

    public static void main(String[] args) {
        CarRider Maki = new CarRider ("Zenin Maki", 20, "080000000120");
        CarRider Panda = new CarRider ("Panda", 22, "080000000305");
        CarRider Yuta = new CarRider ("Okkotsu Yuta", 21, "080000000307");
        CarRider Toge = new CarRider ("Inumaki Toge", 20, "080000001023");

        CarData data = new CarData();
        data.addCar ("SUV", "J 0120 JK", "Mercedes-Benz");
        data.addCar ("SPORT", "J 0305 JK", "Lexus");
        data.addCar ("ELECTRIC CAR", "J 0307 JK", "Tesla");
        data.addCar ("OFFROAD", "J 1023 JK", "Jeep");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent (Maki, data.carList.get(0), 5);
        arsip.Rent (Panda, data.carList.get(0), 3);
        arsip.Rent (Yuta, data.carList.get(1), 1);
        arsip.Rent (Toge, data.carList.get(1), 2);

        System.out.println("");
        arsip.info();
    }
}
```
- class Car
```java
package Main;

public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Car (String carType, String polNum, String merk, Boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this. merk = merk;
        this.status = status;
    }

    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
```

- class CarData
```java
package Main;

import java.util.ArrayList;

public class CarData {
    ArrayList<Car> carList = new ArrayList<>();

    public void addCar (String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar(){
        System.out.println("=================================");
        System.out.println("DAFTAR MOBIL");
        System.out.println("=================================");

        for (Car data : carList){
            System.out.println("TIPE MOBIL  : " + data.getCarType());
            System.out.println("NO. POLISI  : " + data.getPolNum());
            System.out.println("MERK MOBIL  : " + data.getMerk());
            System.out.println("=================================");
        }
        System.out.println("");
    }
}
```

- class CarRent
```java
package Main;

public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;

    public CarRent (CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }
}
```

- class CarRider
```java
package Main;

public class CarRider {
    private String name;
    private int age;
    private String phone;

    public CarRider (String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
```

- class RentArchive
```java
package Main;

import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent (CarRider rider, Car car, int rentDur){
        if (car.isStatus()){
            rentData.add(new CarRent(rider, car, rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
        }
        else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("=================================");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("=================================");
        for (CarRent data : rentData){
            System.out.println("NAMA PEMINJAM : " + data.getRider().getName());
            System.out.println("TIPE MOBIL    : " + data.getCar().getCarType());
            System.out.println("NO. POLISI    : " + data.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + data.getRentDur());
            System.out.println("=================================");
        }
    }
}
```


## Tugas 6
Studi Kasus Profesi (Inheritance)

- class Main
```java
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
```
- class Manusia
```java
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
```
- class Pekerja
```java
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
```
- class MahasiswaFilkom
```java
package Main;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){

        return null;
    }

    public double getBeasiswa(){

        return 0;
    }

    @Override
    public String toString() {
        super.toString();
        return "MahasiswaFilkom{" + "NIM='" + getNIM() + '\'' + ", IPK=" + getIPK() + '}';
    }
}
```
- class Manajer
```java
package Main;

public class Manajer extends Pekerja {
    private int lamaKerja;

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
}
```


## Tugas 7
Studi Kasus Pengelompokkan Karyawan (Polimorfisme)

- class Main
```java
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
```
- class Pegawai
```java
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
```
- class PegawaiHarian
```java
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
```
- class PegawaiTetap
```java
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
```
- class Sales
```java
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
```


## Tugas 8
Studi Kasus Game Melawan Titan (Exception Handling)

- class Character
```java
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;
    private String role;

    public Character(String role, int HP, int attack, int defense){
        this.role = role;
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        if (damage > defense){
            this.HP = (HP + defense) - damage;
            if (this.HP <= 0){
                HP = 0;
            }
        }
    }

    public void info(){
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player   : ");
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();

        System.out.println("Silahkan pilih karakter yang anda inginkan  : ");
        System.out.println("1.  Magician");
        System.out.println("2.  Healer");
        System.out.println("3.  Warrior");

        try {
            Scanner scn = new Scanner(System.in);
            scn.nextInt();
            System.out.println("Selamat datang, " + nama + " !");
        } catch (InputMismatchException e) {
            System.out.println("Masukkan angka, jangan memasukkan teks");

        }
        System.out.println("---status---");
        System.out.println("Role    : " + getRole());
        System.out.println("HP      : " + getHP());
        System.out.println("Attack  : " + getAttack());
        System.out.println("Defense : " + getDefense());
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

    public String getRole() {
        return role;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
```
- class Healer
```java
package Main;

public class Healer extends Character{
    private int defense;
    private int attack;
    private int HP;
    private String role;

    public Healer(String role, int HP, int attack, int defense) {
        super(role, HP, attack, defense);
        this.role = role;
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    @Override
    public boolean attack() {
        double Hit = Math.random();
        if (Hit < 0.85){
            return true;
        }
        return false;
    }
}
```
- class Magician
```java
package Main;

public class Magician extends Character{
    private int defense;
    private int attack;
    private int HP;
    private String role;

    public Magician(String role, int HP, int attack, int defense) {
        super(role, HP, attack, defense);
        this.role = role;
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    @Override
    public boolean attack() {
        double Hit = Math.random();
        if (Hit < 0.35){
            return true;
        }
        return false;
    }
}
```
- class Titan
```java
package Main;

public class Titan extends Character{
    private int defense;
    private int attack;
    private int HP;
    private String role;

    public Titan(String role, int HP, int attack, int defense) {
        super(role, HP, attack, defense);
        this.role = role;
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    @Override
    public boolean attack() {
        double Hit = Math.random();
        if (Hit < 0.40){
            return true;
        }
        return false;
    }
}
```
- class Warrior
```java
package Main;

public class Warrior extends Character{
    private int defense;
    private int attack;
    private int HP;
    private String role;

    public Warrior(String role, int HP, int attack, int defense) {
        super(role, HP, attack, defense);
        this.role = role;
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    @Override
    public boolean attack() {
        double Hit = Math.random();
        if (Hit < 0.60){
            return true;
        }
        return false;
    }
}
```
