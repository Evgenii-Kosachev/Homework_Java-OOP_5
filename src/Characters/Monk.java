package Characters;

import java.util.List;

/** Класс Монах */
public class Monk extends BaseHero{

    /** Конструктор создания персонажа */
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Monk";
        this.attack = 12;
        this.defence = 7;
        this.crntShotsFired = shotsFired = 0;
        this.damage = new Vector2(-4, -4);
        this.crntHeals = this.health = 30;
        this.speed = 5;
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
                bh.crntHeals += this.damage.x * -1;
                if (bh.crntHeals > bh.health) bh.crntHeals = bh.health;
                this.status = String.format("(%s:+%s)", list.indexOf(bh) + 1, this.damage.x * -1);
                break;
            } else this.status = "stand";
        }
    }
}
