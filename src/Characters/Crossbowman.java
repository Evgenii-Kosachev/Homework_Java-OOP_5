package Characters;

import java.util.List;
import java.util.Random;

/** Класс Арбалетчик */
public class Crossbowman extends BaseHero{

    /** Конструктор создания персонажа */
    public Crossbowman(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Crossbowman";
        this.attack = 6;
        this.defence = 3;
        this.crntShotsFired = shotsFired = 16;
        this.damage = new Vector2(2, 3);
        this.crntHeals = health = 10;
        this.speed = 4;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        if(this.crntShotsFired > 0) {
            int hr = new Random().nextInt(list.size());
            if (!list.get(hr).status.equals("Die.")) {
                if (this.attack > list.get(hr).defence) {
                    list.get(hr).crntHeals -= damage.x;
                    this.status = String.format("(%d:-%s)", hr + 1, this.damage.x);
                } else this.status = String.format("(%d:-%s)", hr + 1, 0);
            } else this.status = "miss";
            this.crntShotsFired--;
        }
    }
}
