import org.junit.Before;
import org.junit.Test;
import players.creatures.Creature;
import players.creatures.Dragon;
import players.creatures.Ogre;
import players.fighters.Barbarian;
import players.magicians.Warlock;
import players.weapons.Sword;
import players.weapons.Wand;

import static org.junit.Assert.*;

public class WarlockTest {

    Warlock warlock;
    Creature creature;
    Dragon dragon;
    Ogre ogre;
    Wand wand;
    Sword sword;
    Barbarian barbarian;

    @Before
    public void setup(){
        warlock = new Warlock("T",50);
        barbarian = new Barbarian("Lewis", 10);
        dragon = new Dragon("Dragon",true,50,20);
        ogre = new Ogre("Ogre",  true, 60,20);
        wand = new Wand("Wand",10);
        sword = new Sword("sword",90);
        this.barbarian.addWeapon(sword);
        this.barbarian.selectWeapon(0);
    }
    @Test
    public void canSelectCreature(){
        this.warlock.getCreatures().add(dragon);
        this.warlock.getCreatures().add(ogre);
        this.warlock.setSelectedCreature(0);
        assertEquals(dragon, warlock.getSelectedCreature());
    }
    @Test
    public void creatureCanDefendThenDieThenWarlockGetHurt(){
        this.warlock.getCreatures().add(dragon);
        this.warlock.setSelectedCreature(0);
        this.barbarian.attack(warlock);
        assertEquals(10, warlock.getHealthPoint());
        assertFalse(dragon.isAlive());
        assertNull(warlock.getSelectedCreature());
    }

    @Test
    public void creatureStillAlive(){
        this.barbarian.addWeapon(wand);
        this.barbarian.selectWeapon(1);
        this.warlock.getCreatures().add(dragon);
        this.warlock.setSelectedCreature(0);
        this.barbarian.attack(warlock);
        assertEquals(40, dragon.getHealthPoint());
        assertEquals(50, warlock.getHealthPoint());
    }

    @Test
    public void warlockTakesFullDamageWhenNoCreatureSelected(){
        this.barbarian.attack(warlock);
        assertEquals(-40, warlock.getHealthPoint());
    }
}
