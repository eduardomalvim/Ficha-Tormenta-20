public class DefaultPlayerFactory implements PlayerFactory{
    @Override
    public Player createPlayer(String name, Race race, RPGClass rpgClass) {
        Player player = new Player();

        player.setName(name);
        player.setRpgRace(race);
        player.setRpgClass(rpgClass);

        player.resetBaseAttributes();
        player.resetPoints();

        player.ApplieBonus();
        player.AttributesCalculation();

        return player;
    }

    public Player createElfArcanist
}
