package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName() + " fight begins!");

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " has been defeated!");
                break;
            }

            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has been defeated!");
            }
        }
    }
}
