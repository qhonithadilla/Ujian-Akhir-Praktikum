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
