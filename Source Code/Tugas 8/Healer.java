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
