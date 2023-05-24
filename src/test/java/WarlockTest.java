import org.junit.Before;
import org.junit.Test;
import players.creatures.Creature;
import players.creatures.Dragon;
import players.creatures.Ogre;
import players.magicians.Warlock;
import players.weapons.Wand;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Creature creature;
    Dragon dragon;
    Ogre ogre;
    Wand wand;

    @Before
    public void setup(){
        warlock = new Warlock("T",50);
        dragon = new Dragon("Dragon",true,50);
        ogre = new Ogre("Ogre",  true, 60);
        wand = new Wand("Wand",10);
    }
    @Test
    public void canSelectCreature(){
        this.warlock.getCreatures().add(dragon);
        this.warlock.getCreatures().add(ogre);
        this.warlock.setSelectedCreature(0);
        assertEquals(dragon, warlock.getSelectedCreature());
    }
}
