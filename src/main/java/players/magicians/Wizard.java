package players.magicians;

import players.Player;
import players.creatures.Creature;
import players.fighters.Fighter;

import java.util.ArrayList;

public class Wizard extends Fighter {
    private ArrayList<Creature> creatures;

    public Wizard(String name, int healthPoint,ArrayList<Creature> creatures ) {
        super(name, healthPoint);
        this.creatures = creatures;
    }
}
