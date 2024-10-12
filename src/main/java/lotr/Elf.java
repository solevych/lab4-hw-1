package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10); // Elf has power 10 and hp 10
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.decreaseHp(c.getHp()); // Set HP to 0
            System.out.println("Elf killed " + c.getClass().getSimpleName() + "!");
        } else {
            c.decreasePower(1);
            System.out.println("Elf decreases " + c.getClass().getSimpleName() + "'s power by 1!");
        }
    }
}

