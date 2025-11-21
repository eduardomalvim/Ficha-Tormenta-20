public class HumanPaladinFactory implements PresetPlayerFactory{
    @Override
    public Player createPlayer(String name) {
        Player player = new Player();

        player.setName(name);
        player.setRpgRace(Race.HUMAN);
        player.setRpgClass(RPGClass.PALADIN);

        player.resetBaseAttributes();
        player.resetPoints();

        player.ApplieBonus();
        player.AttributesCalculation();

        return player;
    }
}
