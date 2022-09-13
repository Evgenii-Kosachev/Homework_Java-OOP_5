package Characters;

import java.util.List;

/** Класс Арбалетчик */
public class Crossbowman extends BaseHero{

    /** Конструктор создания персонажа */
    public Crossbowman(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Crossbowman";
        this.attack = 11;
        this.defence = 6;
        this.crntShotsFired = shotsFired = 12;
        this.damage = new Vector2(1, 3);
        this.crntHeals = health = 12;
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
            if(this.position.y == 10 || this.crntShotsFired == 0) {
                this.distance = 10;
                this.position.y--;
                this.status = "step";
            }
            if(this.position.y < 10) {
                this.position.y++;
                this.status = "step";
            }
        }
    }
}
