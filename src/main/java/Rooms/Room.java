package Rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Player>players;
    private String name;

    public Room( String name,ArrayList<Player>players) {

        this.name = name;
        this.players = players;

    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
