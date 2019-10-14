import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int superDefence;

    public Boss(int health, int damage, int superDefence) {
        this.health = health;
        this.damage = damage;
        this.superDefence = superDefence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperDefence() {
        return superDefence;
    }

    public void setSuperDefence(int superDefence) {
        this.superDefence = superDefence;
    }
    public void generateBossDefenceType (){
        Random random=new Random();
        int generateDefence=random.nextInt(50) + 1;

    }
}
