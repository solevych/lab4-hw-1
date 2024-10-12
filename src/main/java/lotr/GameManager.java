package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1 + " vs " + c2);
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
            System.out.println(c1 + " vs " + c2);
        }
        if (!c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " is defeated!");
        }
        if (!c2.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " is defeated!");
        }
    }
}
