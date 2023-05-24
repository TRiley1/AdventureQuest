package players.weapons;

import java.util.ArrayList;

public class Wand extends Weapon{

    private ArrayList<String> spells;
    public Wand(String name, int damage) {
        super(name, damage);
        this.spells = new ArrayList<>();
    }

    public ArrayList<String> getSpells() {
        return spells;
    }
}
