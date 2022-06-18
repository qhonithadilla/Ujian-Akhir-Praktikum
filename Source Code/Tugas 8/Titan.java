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
