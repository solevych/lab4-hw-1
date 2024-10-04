package lotr;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        gameManager.fight(c1, c2);
    }
}