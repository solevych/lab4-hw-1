package lotr;

import java.util.Random;

public class King extends Character {
    private static Random random = new Random();

    // public King() {
    //     super(random.nextInt(11) + 5, random.nextInt(11) + 5);
           
    // }
    public King() {
        super(5 + random.nextInt(11), 5 + random.nextInt(11)); 
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.getPower() + 1); 
        c.decreaseHp(damage);
        System.out.println("King deals " + damage + " damage to " + c.getClass().getSimpleName() + "!");
    }
}

