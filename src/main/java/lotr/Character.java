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
        this.hp -= amount;
    }

    public void decreasePower(int amount) {
        this.power -= amount;
    }
}

