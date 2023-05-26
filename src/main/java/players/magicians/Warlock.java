package players.magicians;

import players.Player;
import players.creatures.Creature;
import players.fighters.Fighter;

import java.util.ArrayList;

public class Warlock extends Fighter {

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

    public void takeDamage(int damage) {
        int warlockHealth = this.getHealthPoint();

        if (selectedCreature != null) {
            int creatureHealth = selectedCreature.getHealthPoint();

            if (damage >= creatureHealth) {
                this.setHealthPoint(warlockHealth - (damage - creatureHealth));
                this.handleCreatureDeath(selectedCreature);
            } else {
                selectedCreature.takeDamage(damage);
            }
        } else {
            this.setHealthPoint(warlockHealth - damage);
        }
    }

    public void handleCreatureDeath(Creature creature){
        creature.setAlive(false);
        selectedCreature = null;
    }

}
