public class MinotaurBarbarianFactory implements PresetPlayerFactory {
    @Override
    public Player createPlayer(String name) {
        Player player = new Player();

        player.setName(name);
        player.setRpgRace(Race.MINOTAUR);
        player.setRpgClass(RPGClass.BARBARIAN);

        player.resetBaseAttributes();
        player.resetPoints();

        player.ApplieBonus();
        player.AttributesCalculation();

        return player;
    }
}
