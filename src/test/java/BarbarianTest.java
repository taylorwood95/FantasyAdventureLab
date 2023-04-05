import Armoury.WeaponType;
import org.junit.Before;
import org.junit.Test;
import people.Barbarians;
import people.Wizard;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarians barbarians;
    Wizard wizard;

    @Before
    public void before(){
        barbarians = new Barbarians("Chris The Barbarian", 100, "Human", true, WeaponType.AXE);
        wizard = new Wizard("Connor The Wizard", 100, "Human", true, WeaponType.STAFF,"Dog");
    }

    @Test
    public void canAttack(){
        barbarians.attack(wizard);
        assertEquals(80, wizard.getHealth());
    }

}
