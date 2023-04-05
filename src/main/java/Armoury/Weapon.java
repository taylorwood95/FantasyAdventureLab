package Armoury;

public class Weapon {

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }


    public WeaponType getWeapon() {
        return weaponType;
    }

    public int getAttackDamage() {
        return this.weaponType.getDamage();
    }
}
