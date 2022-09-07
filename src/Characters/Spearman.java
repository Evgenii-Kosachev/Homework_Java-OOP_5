package Characters;

import java.util.List;
import java.util.Random;

/** Класс Копейщик */
public class Spearman extends BaseHero{

    /** Конструктор создания персонажа */
    public Spearman(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Spearman";
        this.attack = 4;
        this.defence = 5;
        this.shotsFired = 0;
        this.damage = new Vector2(1, 3);
        this.crntHeals = this.health = 10;
        this.speed = 4;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        int hr = new Random().nextInt(list.size());
        if(!list.get(hr).status.equals("Die.")) {
            if(this.attack > list.get(hr).defence) {
                list.get(hr).crntHeals -= damage.x;
                this.status = String.format("(%d:-%s)", hr + 1, this.damage.x);
            } else this.status = String.format("(%d:-%s)", hr + 1, 0);
        } else this.status = "miss";
    }
}
