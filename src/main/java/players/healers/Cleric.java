package players.healers;

import players.IHealable;
import players.Player;

public class Cleric extends Player {

    public Cleric(String name, int healthPoint) {
        super(name, healthPoint);
    }

    public void heal(IHealable healable){
         int health = healable.getHealthPoint();
         int newHealth = health + 20;
         healable.setHealthPoint(newHealth);
    }

}
