public enum Race {

    HUMAN(0, 0, 0, 0, 0, 0), // +2 EM 3 ATRIBUTOS
    DWARF(0, -2, 4, 0, 2, 0),
    DAHLLAN(0, 2, 0, -2, 4, 0),
    ELF(0, 2, -2, 4, 0, 0),
    GOBLIN(0, 4, 0, 2, 0, -2),
    LEFOU(0, 0, 0, 0, 0, -2), // +2 EM 3 ATRIBUTOS
    MINOTAUR(4, 0, 2, 0, -1, 0),
    QAREEN(0, 0, 0, 2, -2, 4),
    GOLEM(4, 0, 2, 0, 0, -2),
    HYNNE(-2, 4, 0, 0, 2, 0),
    KLIREN(-2, 0, 0, 4, 0, 2),
    MEDUSA(0, 4, 0, 0, 0, 2),
    OSTEON(0, 0, -2, 0, 0, 0), // +2 EM 3 ATRIBUTOS
    MERMAID(0, 0, 0, 0, 0, 0), // +2 EM 3 ATRIBUTOS
    SYLPH(-4, 2, 0, 0, 0, 4),
    SURAGGEL_AGGELUS(0, 0, 0, 0, 4, 2),
    SURAGGEL_SULFURE(0, 4, 0, 2, 0, -2),
    TROG(2, 0, 4, -2, 0, 0),
    PIXIE(0, 0, 0, 0, 0, 0), // CRIE VOCE MESMO
    EIRADAAN(-1, 0, 0, 0, 2, 1),
    GALOKK(1, 0, 1, 0, 0, -1), // +1 EM 1 ATRIBUTO
    HALF_ELF(0, 0, 0, 1, 0, 0), // +1 EM 2 ATRIBUTOS - CON
    SATYR(0, 1, 0, 0, -1, 2);


    private final int strength, dexterity, constitution, intelligence, wisdom, charisma;

    Race(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int getStrength(){ return strength;}

    public int getDexterity(){ return dexterity;}

    public int getConstitution(){ return constitution;}

    public int getIntelligence(){ return intelligence;}

    public int getWisdom(){ return wisdom;}

    public int getCharisma(){ return charisma;}
}