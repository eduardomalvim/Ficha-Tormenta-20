public enum RPGClass {

    ARCANIST(8,6),
    BARBARIAN(24,3),
    BARD(12,4),
    BUCCANEER(16,3),
    HUNTER(16,4),
    KNIGHT(20,3),
    CLERIC(16,5),
    DRUID(16,4),
    WARRIOR(20,3),
    INVENTOR(12,4),
    ROGUE(12,4),
    FIGHTER(20,3),
    NOBLE(16,4),
    PALADIN(20,3),
    TAMER(12,4);

    private final int Health, Mana;

    RPGClass(int Health, int Mana) {
        this.Health = Health;
        this.Mana = Mana;
    }

    public int getHealth(){return this.Health;}

    public int getMana(){ return this.Mana; }
}