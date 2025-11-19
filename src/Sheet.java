import java.util.Scanner;

public class Sheet {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        Menu();
    }

    private static void Menu() {

        int opcao = -1;

        Player player = new Player();
        DefaultPlayerFactory factory = new DefaultPlayerFactory();

        while (opcao != 0){

            ClearConsole();
            System.out.print("===== FICHA TORMENTA 20 =====\n");
            System.out.print("          1 - CRIAR          \n");
            System.out.print("          2 - EDITAR         \n");
            System.out.print("          3 - FICHA          \n");
            System.out.print("          0 - SAIR           \n");
            System.out.print("=============================\n");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1: player = CreatePlayer(factory); break;
                case 2: EditSheet(player); break;
                case 3: PlayerSheet(player); break;
                case 0: break;
            }
        }
    }

    public static Player CreatePlayer(DefaultPlayerFactory factory) {

        ClearConsole();
        System.out.print("========== CRIAR FICHA ==========\n");
        System.out.print(" NOME: ");

        String name = scanner.nextLine();
        Race race = PlayerRace();
        RPGClass rpgClass = PlayerClass();

        Player player = factory.createPlayer(name, race, rpgClass);

        ClearConsole();
        System.out.print("= PERSONAGEM CRIADO COM SUCESSO =");
        return player;
    }

    public static RPGClass PlayerClass(){
        int opcao = -1;

        ClearConsole();
        System.out.print("==========   CLASSES   ==========\n");
        RPGClass[] classes = RPGClass.values();
            for(int i = 0; i < classes.length; i++){
            System.out.printf((i+1) + "- " + classes[i].toString() + "\n");
            }
        System.out.print("Escolha uma classe: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        return classes[opcao - 1];
    }

    public static Race PlayerRace(){
        int opcao = -1;

        ClearConsole();
        System.out.print("==========    RAÇAS    ==========\n");
        Race[] races = Race.values();
            for(int i = 0; i < races.length; i++){
            System.out.printf((i+1) + "- " + races[i].toString() + "\n");
            }
        System.out.print("Escolha uma raça: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        return races[opcao - 1];
    }

    public static void EditSheet(Player player){
        ClearConsole();

        if (player == null || player.getName() == null || player.getName().isEmpty()){
            System.out.println("Nenhum personagem criado. Crie um personagem primeiro.");
            Wait();
            return;
        }

        int opcao = -1;
        System.out.print("=============================\n");
        System.out.printf("| FORÇA:            %d       \n", player.getStrength());
        System.out.printf("| DESTREZA:         %d       \n", player.getDexterity());
        System.out.printf("| CONSTITUIÇÃO:     %d       \n", player.getConstitution());
        System.out.printf("| INTELIGÊNCIA:     %d       \n", player.getIntelligence());
        System.out.printf("| SABEDORIA:        %d       \n", player.getWisdom());
        System.out.printf("| CARISMA:          %d       \n", player.getCharisma());
        System.out.print("=============================\n");
        System.out.printf("PONTOS: %d\n", player.getPoints());
        System.out.println("1- Colocar pontos");
        System.out.println("2- Tirar pontos");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                    addPoints(player, SelectAttribute());
                    break;
            case 2:
                    subPoints(player, SelectAttribute());
                    break;
        }
    }

    public static int SelectAttribute(){
        int opcao;
        System.out.println("=== SELECIONE O ATRIBUTO ===");
        System.out.println("       1 - FORÇA");
        System.out.println("       2 - DESTREZA");
        System.out.println("       3 - CONSTITUIÇÃO");
        System.out.println("       4 - INTELIGÊNCIA");
        System.out.println("       5 - SABEDORIA");
        System.out.println("       6 - CARISMA");
        System.out.println("============================");

        opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public static void addPoints(Player player, int option){
        int attribute = 0;
        int price = 1;

        attribute = switch (option) {
                    case 1 -> player.getStrength();
                    case 2 -> player.getDexterity();
                    case 3 -> player.getConstitution();
                    case 4 -> player.getIntelligence();
                    case 5 -> player.getWisdom();
                    case 6 -> player.getCharisma();
                    default -> attribute;
        };

        if (attribute >= 13 && attribute < 16){ price = 2;}
        if (attribute >= 16){ price = 3;}
        if (player.getPoints() < price){ System.out.print("Acabaram os pontos!!!"); Wait(); return;}
        else{ player.setPoints(player.getPoints() - price);}

        switch (option){
            case 1: player.setStrength(++attribute); break;
            case 2: player.setDexterity(++attribute); break;
            case 3: player.setConstitution(++attribute); break;
            case 4: player.setIntelligence(++attribute); break;
            case 5: player.setWisdom(++attribute); break;
            case 6: player.setCharisma(++attribute); break;
        }
        player.AttributesCalculation();
    }

    public static void subPoints(Player player, int option){
        int attribute = 0;
        int price = 1;

        attribute = switch (option) {
                    case 1 -> player.getStrength();
                    case 2 -> player.getDexterity();
                    case 3 -> player.getConstitution();
                    case 4 -> player.getIntelligence();
                    case 5 -> player.getWisdom();
                    case 6 -> player.getCharisma();
                    default -> attribute;
        };

        if(attribute <= 8){ System.out.println("Não é possível retirar mais"); Wait(); return;}
        else{ player.setPoints(player.getPoints() + price);}

        switch (option){
            case 1: player.setStrength(--attribute); break;
            case 2: player.setDexterity(--attribute); break;
            case 3: player.setConstitution(--attribute); break;
            case 4: player.setIntelligence(--attribute); break;
            case 5: player.setWisdom(--attribute); break;
            case 6: player.setCharisma(--attribute); break;

        }
        player.AttributesCalculation();
    }

    public static void PlayerSheet(Player player){
        String opcao;
        ClearConsole();
        System.out.print("=========== FICHA ==============\n");
        System.out.printf("| NOME: %s                   \n", player.getName());
        System.out.printf("| CLASSE: %s     RAÇA: %s    \n",player.getRpgClass(), player.getRpgRace());
        System.out.printf("| VIDA: %d       MANA: %d    \n", player.getHealth(), player.getMana());
        System.out.print("| ==============================\n");
        System.out.printf("| FORÇA:            %d       \n", player.getStrength());
        System.out.printf("| DESTREZA:         %d       \n", player.getDexterity());
        System.out.printf("| CONSTITUIÇÃO:     %d       \n", player.getConstitution());
        System.out.printf("| INTELIGÊNCIA:     %d       \n", player.getIntelligence());
        System.out.printf("| SABEDORIA:        %d       \n", player.getWisdom());
        System.out.printf("| CARISMA:          %d       \n", player.getCharisma());
        System.out.print("================================\n");
        System.out.print("   PRECISONE QUALQUER TECLA\n");

        opcao = scanner.nextLine();
    }

    public void NullVerification(Player player){
        if (player == null || player.getName() == null || player.getName().isEmpty()){
            System.out.println("Nenhum personagem criado. Crie um personagem primeiro.");
            Wait();
        }
    }

    static void Wait(){
        try {Thread.sleep(1500);} catch (InterruptedException _) {}
    }

    static void ClearConsole(){
        for(int i = 0; i < 50; i++){ System.out.println();}
    }
}
