package Characters;

import java.util.List;

/** Класс Снайпер*/
public class Sniper extends BaseHero{

    /** Конструктор создания персонажа */
    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Sniper";
        this.attack = 12;
        this.defence = 5;
        this.crntShotsFired = shotsFired = 14;
        this.damage = new Vector2(1, 3);
        this.crntHeals = this.health = 14;
        this.speed = 1;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
        this.distance = 3;
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        Vector2 hero = getDistance(getList());
        if (this.crntShotsFired > 0 && !list.get(hero.x).status.equals("Die.") && hero.y <= this.distance) {
            if (this.attack > list.get(hero.x).defence) {
                list.get(hero.x).crntHeals -= this.damage.x;
                this.status = String.format("(%d:-%s)", hero.x + 1, this.damage.x);
            } else this.status = String.format("(%d:-%s)", hero.x + 1, 0);
            this.crntShotsFired--;
        } else {
            if(this.position.y == 1 || this.crntShotsFired == 0) {
                this.distance = 10;
                this.position.y++;
                this.status = "step";
            }
            if(this.position.y > 1) {
                this.position.y--;
                this.status = "step";
            }
        }
    }
}
