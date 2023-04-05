import Armoury.WeaponType;
import org.junit.Before;
import org.junit.Test;
import people.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Taylor", 80, "Human", true, WeaponType.AXE, "Cat");
    }
    @Test
    public void canGetPet(){
        assertEquals("Cat", warlock.getPet());
    }

    @Test
    public void canReplenishHealth(){
        warlock.heal(warlock);
        assertEquals(100, warlock.getHealth());

    }

}
