class MarioKartPlayer {
    // Initialize needed variables
    String playerName;
    String characterName;
    int playerSpeed;

    // Create constructor
    public MarioKartPlayer(String name, String character, int speed){
        playerName = name;
        characterName = character;
        playerSpeed = speed;
    }

    // Boost method
    public int boost(int speed, String playerName){
        System.out.println("\nBoosting " + playerName + "...");
        speed += 20;
        System.out.println("Whoosh! New speed: " + speed);
        return speed;
    }

    // displayInfo method
    public void displayInfo(String playerName, String character, int speed){
        System.out.println("Name: " + playerName + "\nCharacter: " + character + "\nSpeed: " + speed);
    }
}

class MarioKartGame {
    public static void main(String[] args) {

        System.out.println("Mario Kart!");

        // Construct players
        MarioKartPlayer playerOne = new MarioKartPlayer("Carah", "Shy Guy", 10);
        MarioKartPlayer playerTwo = new MarioKartPlayer("Collin", "Yoshi", 9);

        // Info
        System.out.println("--Player One--");
        playerOne.displayInfo(playerOne.playerName, playerOne.characterName, playerOne.playerSpeed);
        System.out.println("--Player Two--");
        playerOne.displayInfo(playerTwo.playerName, playerTwo.characterName, playerTwo.playerSpeed);

        // Boost
        System.out.println(playerOne.boost(playerOne.playerSpeed, playerOne.playerName));
        System.out.println(playerTwo.boost(playerTwo.playerSpeed, playerTwo.playerName));

    }
}
