package players;

import players.creatures.Creature;

public interface IFightable {
    void attack(IFightable fightable);
    void takeDamage(int damage);

}
