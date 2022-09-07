package Characters;

import java.util.List;
import java.util.Random;

/** Класс Снайпер*/
public class Sniper extends BaseHero{

    /** Конструктор создания персонажа */
    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Sniper";
        this.attack = 12;
        this.defence = 10;
        this.crntShotsFired = shotsFired = 32;
        this.damage = new Vector2(8, 10);
        this.crntHeals = this.health = 15;
        this.speed = 9;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        if(this.crntShotsFired > 0) {
            int hr = new Random().nextInt(list.size());
            if(!list.get(hr).status.equals("Die.")) {
                if(this.attack > list.get(hr).defence) {
                    list.get(hr).crntHeals -= damage.x;
                    this.status = String.format("(%d:-%s)", hr + 1, this.damage.x);
                } else this.status = String.format("(%d:-%s)", hr + 1, 0);
            } else this.status = "miss";
            this.crntShotsFired--;
        }
    }
}
