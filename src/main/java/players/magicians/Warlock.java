package players.magicians;

import players.Player;
import players.creatures.Creature;

import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<Creature> creatures;
    private Creature selectedCreature;

    public Warlock(String name, int healthPoint) {

        super(name, healthPoint);
        this.creatures = new ArrayList<>();
        this.selectedCreature = null;
    }

    public void setSelectedCreature(int value) {
        this.selectedCreature = this.creatures.get(value);
    }

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public Creature getSelectedCreature() {
        return selectedCreature;
    }

}
