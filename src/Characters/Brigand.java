package Characters;

import java.util.List;
import java.util.Random;

/** Класс Разбойник */
public class Brigand extends BaseHero{

    /** Конструктор создания персонажа */
    public Brigand(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Brigand";
        this.attack = 8;
        this.defence = 3;
        this.shotsFired = 0;
        this.damage = new Vector2(2, 4);
        this.crntHeals = health = 10;
        this.speed = 6;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

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
