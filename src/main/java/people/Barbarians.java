package people;

import Armoury.WeaponType;
import behaviours.IAttack;

public class Barbarians extends Person implements IAttack {

    private WeaponType weapon;


    public Barbarians(String name, int health, String species, boolean alive, WeaponType weapon) {
        super(name, health, species, alive);
        this.weapon = weapon;
    }

    public void attack(Person victim) {
        int victimHealth = victim.getHealth();
        int newVictimHealth = victimHealth - this.getWeapon().getDamage();
        victim.setHealth(newVictimHealth);
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
