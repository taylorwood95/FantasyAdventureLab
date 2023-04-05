package people;

public abstract class Person {

    private String name;
    private int health;
    private String species;

    private boolean alive;

    public Person(String name, int health, String species, boolean alive){
        this.name = name;
        this.health = health;
        this.species = species;
        this.alive = alive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
