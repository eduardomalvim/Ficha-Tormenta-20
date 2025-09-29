import java.util.Scanner;

public class Sheet {

    private static int points = 20;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {

        int opcao = -1;

        Player player = new Player();

        while (opcao != 0){

            ClearConsole();
            System.out.printf("===== FICHA TORMENTA 20 =====\n");
            System.out.printf("          1 - CRIAR          \n");
            System.out.printf("          2 - EDITAR         \n");
            System.out.printf("          3 - FICHA          \n");
            System.out.printf("          0 - SAIR           \n");
            System.out.printf("=============================\n");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1: CreatePlayer(player); break;
                case 2: EditSheet(player); break;
                case 3: PlayerSheet(player); break;
                case 0: // sair
            }
        }
    }

    public static void CreatePlayer(Player player){

        ClearConsole();
        System.out.printf("========== CRIAR FICHA ==========\n");
        System.out.print(" NOME: ");
        player.setName(scanner.nextLine());

        player.setRpgClass(PlayerClass());
        player.setRpgRace(PlayerRace());
        player.ApplieClassBonus();
        player.ApplieRaceBonus();

        ClearConsole();
        System.out.printf("= PERSONAGEM CRIADO COM SUCESSO =");
    }

    public static RPGClass PlayerClass(){
        int opcao = -1;

        ClearConsole();
        System.out.printf("==========   CLASSES   ==========\n");
        RPGClass[] classes = RPGClass.values();
            for(int i = 0; i < classes.length; i++){
            System.out.printf((i+1) + "- " + classes[i].toString() + "\n");
            }
        System.out.printf("Escolha uma classe: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        return classes[opcao - 1];
    }

    public static Race PlayerRace(){
        int opcao = -1;

        ClearConsole();
        System.out.printf("==========    RAÇAS    ==========\n");
        Race[] racas = Race.values();
            for(int i = 0; i < racas.length; i++){
            System.out.printf((i+1) + "- " + racas[i].toString() + "\n");
            }
        System.out.printf("Escolha uma raça: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        return racas[opcao - 1];
    }

    public static void EditSheet(Player player){
        ClearConsole();
        int opcao = -1;
        System.out.printf("=============================\n");
        System.out.printf("| FORÇA:            %d       \n", player.getStrength());
        System.out.printf("| DESTREZA:         %d       \n", player.getDexterity());
        System.out.printf("| CONSTITUIÇÃO:     %d       \n", player.getConstitution());
        System.out.printf("| INTELIGÊNCIA:     %d       \n", player.getIntelligence());
        System.out.printf("| SABEDORIA:        %d       \n", player.getWisdom());
        System.out.printf("| CARISMA:          %d       \n", player.getCharisma());
        System.out.printf("=============================\n");
        System.out.printf("PONTOS: %d\n", points);
        System.out.println("1- Colocar pontos");
        System.out.println("2- Tirar pontos");

        switch (opcao){
            case 1:
                    opcao = -1;

                    System.out.println("=== SELECIONE O ATRIBUTO ===");
                    System.out.println("       1 - FORÇA");
                    System.out.println("       2 - DESTREZA");
                    System.out.println("       3 - CONSTITUIÇÃO");
                    System.out.println("       4 - INTELIGÊNCIA");
                    System.out.println("       5 - SABEDORIA");
                    System.out.println("       6 - CARISMA");
                    System.out.println("============================");

                    switch (opcao){
                        case 1: addPoints(player.getStrength()); break;
                        case 2: addPoints(player.getDexterity()); break;
                        case 3: addPoints(player.getConstitution()); break;
                        case 4: addPoints(player.getIntelligence()); break;
                        case 5: addPoints(player.getWisdom()); break;
                        case 6: addPoints(player.getCharisma()); break;
                    }
            case 2:
        }
    }

    public static void addPoints(Player player, int attribute){
        int opcao = -1;
        int price = 1;

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

        switch (opcao){
            case 1: attribute = player.getStrength(); break;
            case 2: attribute = player.getDexterity(); break;
            case 3: attribute = player.getConstitution(); break;
            case 4: attribute = player.getIntelligence(); break;
            case 5: attribute = player.getWisdom(); break;
            case 6: attribute = player.getCharisma(); break;

        if(attribute > 13 && attribute < 16){ price *= 2;}
        if(attribute > 16){ price *= 3;}
        points -= price;

        switch (opcao){
            case 1: player.setStrength(attribute); break;
            case 2: player.setDexterity(attribute); break;
            case 3: player.setConstitution(attribute); break;
            case 4: player.setIntelligence(attribute); break;
            case 5: player.setWisdom(attribute); break;
            case 6: player.setCharisma(attribute); break;
    }

    public static void subPoints(Player player, int attribute){
          switch (opcao){
              case 1: attribute = player.getStrength(); break;
              case 2: attribute = player.getDexterity(); break;
              case 3: attribute = player.getConstitution(); break;
              case 4: attribute = player.getIntelligence(); break;
              case 5: attribute = player.getWisdom(); break;
              case 6: attribute = player.getCharisma(); break;

              if(attribute == 8){ System.out.println("Não é possível abaixar mais");}
              else{
                  points += price;

          switch (opcao){
              case 1: player.setStrength(attribute); break;
              case 2: player.setDexterity(attribute); break;
              case 3: player.setConstitution(attribute); break;
              case 4: player.setIntelligence(attribute); break;
              case 5: player.setWisdom(attribute); break;
              case 6: player.setCharisma(attribute); break;
            }
        }
    }

    public static void PlayerSheet(Player player){
        int opcao = -1;
        ClearConsole();
        System.out.printf("=========== FICHA ===========\n");
        System.out.printf("| NOME: %s                   \n", player.getName());
        System.out.printf("| CLASSE: %s     RAÇA: %s    \n",player.getRpgClass(), player.getRpgRace());
        System.out.printf("| VIDA: %d       MANA: %d    \n", player.getHealth(), player.getMana());
        System.out.printf("| ===========================\n");
        System.out.printf("| FORÇA:            %d       \n", player.getStrength());
        System.out.printf("| DESTREZA:         %d       \n", player.getDexterity());
        System.out.printf("| CONSTITUIÇÃO:     %d       \n", player.getConstitution());
        System.out.printf("| INTELIGÊNCIA:     %d       \n", player.getIntelligence());
        System.out.printf("| SABEDORIA:        %d       \n", player.getWisdom());
        System.out.printf("| CARISMA:          %d       \n", player.getCharisma());
        System.out.printf("=============================\n");
        System.out.printf("          0 - SAIR\n");

        opcao = scanner.nextInt();
        scanner.nextLine();
    }

    public static void Wait(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {}
    }

    private static void ClearConsole(){
        for(int i = 0; i < 50; i++){ System.out.println();}
    }
}
