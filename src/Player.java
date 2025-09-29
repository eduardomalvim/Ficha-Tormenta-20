public class Player extends Entity {

    private Race race;
    private RPGClass rpgClass;

    public void ApplieRaceBonus(){
        setStrength(getStrength() + race.getStrength());
        setDexterity(getDexterity() + race.getDexterity());
        setConstitution(getConstitution() + race.getConstitution());
        setIntelligence(getIntelligence() + race.getIntelligence());
        setWisdom(getWisdom() + race.getWisdom());
        setCharisma(getCharisma() + race.getCharisma());
    }

    public void ApplieClassBonus(){
        setHealth(getHealth() + rpgClass.getHealth());
        setMana(getMana() + rpgClass.getMana());
    }

    public void AttributesCalculation(){
        setHealth(rpgClass.getHealth() + HealthMod());
        setMana(rpgClass.getMana() + ManaMod());
    }

    public int HealthMod(){ return (getConstitution() - 10) / 2;}

    public int ManaMod(){ return (getWisdom() - 10) / 2;}

    public void exibirFicha(Entity entidade) {
        System.out.printf("=== Ficha de %s ===\n", getName());
        System.out.printf("Raça: %s | Classe: %s\n", getRpgRace(), getRpgClass());
        System.out.printf("For: %d, Des: %d, Con: %d, Int: %d, Sab: %d, Car: %d\n",
                getStrength(), getDexterity(), getConstitution(), getIntelligence(), getWisdom(), getCharisma());
        System.out.printf("PV: %d | PM: %d\n", getHealth(), getMana());
    }

    public RPGClass getRpgClass() {return rpgClass;}
    public void setRpgClass(RPGClass rpgClass) {this.rpgClass = rpgClass;}

    public Race getRpgRace() {return race;}
    public void setRpgRace(Race race) {this.race = race;}
}
