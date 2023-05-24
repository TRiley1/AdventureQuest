import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Before;
import org.junit.Test;
import players.creatures.Orc;
import players.fighters.Dwarf;
import players.weapons.Axe;
import players.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Axe axe;
    Sword sword;
    Orc orc;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Sky",100);
        axe = new Axe("Sky's axe", 10);
        sword = new Sword("Thomas's sword", 20);
        orc = new Orc("J",false, 100 );
    }
    @Test
    public void canAddWeapon(){
        dwarf.addWeapon(axe);
        assertEquals(1, dwarf.getWeapons().size());
    }
    @Test
    public void canChangeWeapon(){
        dwarf.addWeapon(axe);
        dwarf.addWeapon(sword);
        dwarf.selectWeapon(0);
        assertEquals(axe,dwarf.getHoldWeapon());
    }
    @Test
    public void canDamage(){
        dwarf.addWeapon(axe);
        dwarf.selectWeapon(0);
        dwarf.attack(orc);
        assertEquals(90, orc.getHealthPoint());
    }

}
