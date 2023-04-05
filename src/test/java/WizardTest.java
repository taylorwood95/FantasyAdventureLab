import Armoury.Weapon;
import Armoury.WeaponType;
import SpellBook.Spell;
import org.junit.Before;
import org.junit.Test;
import people.Barbarians;
import people.Wizard;
import SpellBook.SpellType;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Barbarians barbarians;


    @Before
    public void before(){
        wizard = new Wizard("Connor The Wizard", 100, "Human", true, WeaponType.STAFF,"Dog");
        barbarians = new Barbarians("Chris The Barbarian", 100, "Human", true, WeaponType.AXE);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(WeaponType.STAFF, wizard.getWeaponType());
    }

    @Test
    public void canCastFireball(){
        wizard.castFireball(barbarians);
        assertEquals(80, barbarians.getHealth());
    }
    @Test
    public void canAddNewSpell(){
        wizard.addSpell(SpellType.FIREBALL);
        assertEquals(1, wizard.getSpells().size());
    }
}
