package SpellBook;

public class Spell {

    private  SpellType spellType;

    public Spell(SpellType spellType){
        this.spellType = spellType;
    }


    public SpellType getSpellType() {
        return spellType;
    }


    public int getSpellDamage() {
        return this.spellType.getSpellDMG();
    }
}
