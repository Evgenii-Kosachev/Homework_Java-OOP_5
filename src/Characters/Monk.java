package Characters;

import java.util.List;

/** Класс Монах */
public class Monk extends BaseHero{

    /** Конструктор создания персонажа */
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Monk";
        this.attack = 5;
        this.defence = 4;
        this.crntShotsFired = shotsFired = 0;
        this.damage = new Vector2(4, 4);
        this.crntHeals = this.health = 10;
        this.speed = 3;
        this.delivery = false;
        this.magic = true;
        this.status = "stand";
        this.position = new Vector2(x, y);
    }

    public boolean status() {return this.status.equals("active");}

    @Override
    public void step() {
        for (BaseHero bh: super.list) {
            if (!bh.status.equals("Die.") && bh.crntHeals < bh.health) {
                bh.crntHeals += this.damage.x;
                if (bh.crntHeals > bh.health) bh.crntHeals = bh.health;
                this.status = String.format("(%s:+%s)", list.indexOf(bh) + 1, this.damage.x);
                break;
            } else this.status = "stand";
        }
    }
}
