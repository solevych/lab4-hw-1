package lotr;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character character1 = factory.createCharacter();
        Character character2 = factory.createCharacter();

        gameManager.fight(character1, character2);
    }
}
