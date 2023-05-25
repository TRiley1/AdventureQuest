import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Before;
import org.junit.Test;
import players.creatures.Orc;
import players.fighters.Dwarf;
import players.fighters.Knight;
import players.weapons.Axe;
import players.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Knight knight;
    Knight knight1;
    Axe axe;
    Sword sword;
    Orc orc;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Sky",100);
        knight = new Knight("Mar", 200, 30);
        knight1 = new Knight("Mar1", 200, 5);
        axe = new Axe("Sky's axe", 10);
        sword = new Sword("Thomas's sword", 20);
        orc = new Orc("J",false, 100,10 );
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
    @Test
    public void canFightEachOther(){
        dwarf.addWeapon(axe);
        knight.addWeapon(sword);
        dwarf.selectWeapon(0);
        knight.selectWeapon(0);
        dwarf.attack(knight);
        assertEquals(190, knight.getHealthPoint());
    }
    @Test
    public void armourCanReduceDamage(){
        dwarf.addWeapon(axe);
        knight.addWeapon(sword);
        dwarf.selectWeapon(0);
        knight.selectWeapon(0);
        dwarf.attack(knight);
        assertEquals(200, knight.getHealthPoint());
    }
    @Test
    public void armourCanNotReduceDamage(){
        dwarf.addWeapon(axe);
        knight1.addWeapon(sword);
        dwarf.selectWeapon(0);
        knight1.selectWeapon(0);
        dwarf.attack(knight1);
        assertEquals(195, knight1.getHealthPoint());
    }


}
