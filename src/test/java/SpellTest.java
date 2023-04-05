import SpellBook.SpellType;
import org.junit.Before;
import org.junit.Test;
import SpellBook.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before(){
        spell = new Spell(SpellType.FELFIRE);
    }

    @Test
    public void canGetSpellDamage(){
        assertEquals(23, spell.getSpellDamage());
    }

}
