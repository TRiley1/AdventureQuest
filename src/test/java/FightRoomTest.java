import Rooms.FightRoom;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.creatures.Creature;
import players.creatures.Orc;
import players.creatures.Troll;
import players.fighters.Barbarian;
import players.healers.Cleric;
import players.weapons.Axe;
import players.weapons.Sword;

import java.util.ArrayList;

public class FightRoomTest {
    FightRoom fightRoom;
    Barbarian barbarian;
    Cleric cleric;
    Axe axe;
    Sword sword;
    Troll troll;
    Orc orc;
    ArrayList<Player>players;
    ArrayList<Creature>creatures;


    @Before
    public void setUp(){
        barbarian = new Barbarian("H",100);
        cleric = new Cleric("U", 20);
        axe = new Axe("Axe",20);
        sword = new Sword("Sword", 30);
        orc = new Orc("Orc",false,20);
        troll = new Troll("Orc",false,20);
        barbarian.addWeapon(axe);
        barbarian.addWeapon(sword);
        players.add(barbarian);
        players.add(cleric);
        creatures.add(orc);
        creatures.add(troll);

        fightRoom = new FightRoom(players,"E63",creatures);
    }

    @Test
    public void

}
