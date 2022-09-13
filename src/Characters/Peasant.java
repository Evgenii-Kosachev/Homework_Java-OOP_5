package Characters;

import java.util.List;

/** Класс Крестьянин */
public class Peasant extends BaseHero{

    /** Конструктор создания персонажа */
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Peasant";
        this.attack = 5;
        this.defence = 4;
        this.crntShotsFired = shotsFired = 0;
        this.damage = new Vector2(1, 1);
        this.crntHeals = this.health = 6;
        this.speed = 3;
        this.delivery = true;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        for (BaseHero bh: super.list) {
            if (!bh.status.equals("Die.") && bh.crntShotsFired < bh.shotsFired) {
                bh.crntShotsFired++;
                this.status = String.format("(%s:+%s)", list.indexOf(bh) + 1, this.damage.x);
                break;
            }
        }
    }
}
