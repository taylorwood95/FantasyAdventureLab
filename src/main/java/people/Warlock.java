package people;

import Armoury.Weapon;
import SpellBook.SpellType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import SpellBook.Spell;
import Armoury.WeaponType;
import behaviours.IHeal;

public class Warlock extends Person implements IHeal {

    private WeaponType weapon;
    private ArrayList<Spell> spells;
    private String pet;
    public Warlock(String name, int health, String species, boolean alive, WeaponType weapon, String pet) {
        super(name, health, species, alive);
        this.weapon = weapon;
        this.spells = new ArrayList<>();
        this.pet = pet;
    }


    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }


    @Override
    public void heal(Person person) {
        setHealth(100);
    }
}
