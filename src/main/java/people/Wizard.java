package people;


import Armoury.Weapon;
import Armoury.WeaponType;
import SpellBook.Spell;
import SpellBook.SpellType;

import java.util.ArrayList;

public class Wizard extends Person{

private ArrayList<SpellType> spells;
private WeaponType weaponType;

private String pet;



    public Wizard(String name, int health, String species, boolean alive, WeaponType weaponType, String pet) {
        super(name, health, species, alive);
        this.spells = new ArrayList<>();
        this.weaponType = weaponType;
        this.pet = pet;

    }

    public ArrayList<SpellType> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<SpellType> spells) {
        this.spells = spells;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public void castFireball(Person person) {
        int fireballDMG = SpellType.FIREBALL.getSpellDMG();
        int personHealth = person.getHealth();
        int newHealth = personHealth - fireballDMG;
        person.setHealth(newHealth);
    }

    public void addSpell(SpellType spell) {
        this.spells.add(spell);
    }
}
