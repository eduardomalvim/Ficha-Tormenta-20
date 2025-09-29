public abstract class Entity {

// ATTRIBUTES

    private String alignment;
    private String name;
    private int age;
    private int level = 1;
    private int health= 0;
    private int mana = 0;

    private int strength = 10;
    private int dexterity = 10;
    private int constitution = 10;
    private int intelligence = 10;
    private int wisdom = 10;
    private int charisma = 10;

// GETS & SETS

    public String getAlignment() {return alignment;}
    public void setAlignment(String alignment) {this.alignment = alignment;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}

    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getMana() {return mana;}
    public void setMana(int mana) {this.mana = mana;}

    public int getStrength() {return strength;}
    public void setStrength(int strength) {this.strength = strength;}

    public int getDexterity() {return dexterity;}
    public void setDexterity(int dexterity) {this.dexterity = dexterity;}

    public int getConstitution() {return constitution;}
    public void setConstitution(int constitution) {this.constitution = constitution;}

    public int getIntelligence() {return intelligence;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}

    public int getWisdom() {return wisdom;}
    public void setWisdom(int wisdom) {this.wisdom = wisdom;}

    public int getCharisma() {return charisma;}
    public void setCharisma(int charisma) {this.charisma = charisma;}

}