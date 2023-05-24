package Rooms;

import players.Player;
import players.weapons.Weapon;

import java.util.ArrayList;

public class TreasureRoom extends Room{

    private ArrayList<Weapon>chest;

    public TreasureRoom(ArrayList<Player> players, String name, ArrayList<Weapon>chest) {
        super(name,players);
        this.chest= chest;
    }

    public ArrayList<Weapon> getChest() {
        return chest;
    }
}
