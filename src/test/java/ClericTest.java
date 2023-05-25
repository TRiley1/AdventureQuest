import org.junit.Before;
import org.junit.Test;
import players.creatures.Orc;
import players.fighters.Knight;
import players.healers.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;
    Orc orc;
    Knight knight;

    @Before
    public void setUp() {
        cleric = new Cleric("Toby", 100);
        orc = new Orc("H", true,10, 20);
        knight = new Knight("Keith",100,50);


    }
    @Test
    public void canHealCreature(){
        this.cleric.heal(orc);
        assertEquals(30, orc.getHealthPoint());
    }


}
