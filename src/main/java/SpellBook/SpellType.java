package SpellBook;

public enum SpellType {

    FIREBALL(20),
    ICEBLAST(15),
    FELFIRE(23),
    LIGHTNING_STRIKE(18);

    public final int spellDMG;


          SpellType(int spellDMG){
        this.spellDMG = spellDMG;
    }

    public int getSpellDMG(){
              return this.spellDMG;
    }



}
