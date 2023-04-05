import Armoury.Weapon;
import Armoury.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;


    @Before
    public void before(){
        weapon = new Weapon(WeaponType.SWORD);
    }

    @Test
    public void  canGetAttackDamage(){
        assertEquals(15, weapon.getAttackDamage());
    }

}
