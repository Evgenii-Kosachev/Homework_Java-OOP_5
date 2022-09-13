package Characters;

import java.util.List;

/** Класс Разбойник */
public class Brigand extends BaseHero{

    /** Конструктор создания персонажа */
    public Brigand(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Brigand";
        this.attack = 11;
        this.defence = 8;
        this.shotsFired = 0;
        this.damage = new Vector2(16, 5);
        this.crntHeals = health = 20;
        this.speed = 1;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
        this.distance = 1;
    }

    public boolean status() {return status.equals("active");}

    public void step() {
        Vector2 hero = getDistance(getList());
        boolean flag = false;

//        if (!list.get(hero.x).status.equals("Die.") & hero.y <= this.distance)    // Это условие тоже не работает.
        if (list.get(hero.x).crntHeals > 0 & hero.y <= this.distance) {             // Не могу разобраться: продолжает бить по мертвым.
            if (this.attack > list.get(hero.x).defence) {
                list.get(hero.x).crntHeals -= this.damage.x;
                this.status = String.format("(%d:-%s)", hero.x + 1, this.damage.x);
            } else this.status = String.format("(%d:-%s)", hero.x + 1, 0);
        } else {
            if(this.position.y == 10 & flag) {                                      // А в это условие не заходит.
                this.distance = 10;
                this.position.y--;
                if(this.position.y == 1) flag = false;
                this.status = "step-";
            }
            if(this.position.y < 10 & !flag) {                                      // Не могу разобраться: продолжает заходить в это условие при position.y = 10.
                this.position.y++;
                if(this.position.y == 10) flag = true;
                this.status = String.format("step+ %d", this.position.y);
            }
        }
    }
}
