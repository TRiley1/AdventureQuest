package players.creatures;

import players.IFightable;
import players.IHealable;

public abstract class Creature implements IFightable, IHealable {
    private String name;
    private int healthPoint;
    private boolean friendly;
    private int attack;
    private boolean alive;

    public Creature(String name, int healthPoint, boolean friendly, int attack) {
        this.name = name;
        this.friendly = friendly;
        this.healthPoint= healthPoint;
        this.attack = attack;
        this.alive = true;

    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void takeDamage(int damage){

        this.healthPoint -= damage;
    };

    public void attack(IFightable fightable){
      int damage = this.attack;
      fightable.takeDamage(damage);
    }
}
