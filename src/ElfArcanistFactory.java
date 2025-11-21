public class ElfArcanistFactory implements PresetPlayerFactory {
    @Override
    public Player createPlayer(String name) {
        Player player = new Player();

        player.setName(name);
        player.setRpgRace(Race.ELF);
        player.setRpgClass(RPGClass.ARCANIST);

        player.resetBaseAttributes();
        player.resetPoints();

        player.ApplieBonus();
        player.AttributesCalculation();

        return player;
    }
}
