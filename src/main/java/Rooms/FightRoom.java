package Rooms;

import players.Player;
import players.creatures.Creature;

import java.util.ArrayList;

public class FightRoom extends Room{
    ArrayList<Creature>creatures;

    public FightRoom(ArrayList<Player> players, String name, ArrayList<Creature> creatures) {
        super(name, players);
        this.creatures = creatures;
    }

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<Creature> creatures) {
        this.creatures = creatures;
    }

}
