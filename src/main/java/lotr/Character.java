package lotr;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Character {
    private int power;
    private int hp;
    public Character(int hp, int power){
        this.hp = hp;
        this.power = power;

    }
    public void kick(Character c){

    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getPower() {
        return this.power;
    }

    public int getHp() {
        return this.hp;
    }

    public void decreaseHp(int amount) {
        this.hp = Math.max(this.hp - amount, 0);
    }

    public void decreasePower(int amount) {
        this.power = Math.max(this.power - amount, 0);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0); // Ensure hp cannot be set to a negative value
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}

