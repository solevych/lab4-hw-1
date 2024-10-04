package lotr;

import java.util.Random;

public class Knight extends Character {
    private static Random random = new Random();


    public Knight() {
        super(random.nextInt(11) + 2, random.nextInt(11) + 2);
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.getPower() + 1); 
        c.decreaseHp(damage);
        System.out.println("Knight deals " + damage + " damage to " + c.getClass().getSimpleName() + "!");
    }
}