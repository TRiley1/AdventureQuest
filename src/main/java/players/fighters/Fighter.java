package players.fighters;

import players.IFightable;
import players.Player;
import players.creatures.Creature;

public abstract class Fighter extends Player implements IFightable {

    public Fighter(String name, int healthPoint) {
        super(name, healthPoint);
    }

    public void attack(IFightable fightable) {
        int damage = this.getHoldWeapon().getDamage();
        fightable.takeDamage(damage);
//        Player thingToAttack = (Player) fightable;
//        thingToAttack.setHealthPoint(fightable.getHealthPoint() - this.getHoldWeapon().getDamage());
    }

    public void takeDamage(int damage) {
        this.setHealthPoint(this.getHealthPoint() - damage);
    }


}
