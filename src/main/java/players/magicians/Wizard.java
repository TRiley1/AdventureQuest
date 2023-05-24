package players.magicians;

import players.Player;
import players.creatures.Creature;

import java.util.ArrayList;

public class Wizard extends Player {
    private ArrayList<Creature> creatures;

    public Wizard(String name, int healthPoint,ArrayList<Creature> creatures ) {
        super(name, healthPoint);
        this.creatures = creatures;
    }
}
