package Armoury;

public enum WeaponType {

    SWORD(15),
    AXE(20),
    STAFF(5),
    CLUB(10);

    private final int attackDMG;

    WeaponType(int attackDMG){
        this.attackDMG = attackDMG;
    }

    public int getDamage(){
        return attackDMG;
    }
}
