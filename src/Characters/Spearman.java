package Characters;

import java.util.List;

/** Класс Копейщик */
public class Spearman extends BaseHero{

    /** Конструктор создания персонажа */
    public Spearman(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Spearman";
        this.attack = 10;
        this.defence = 9;
        this.shotsFired = 0;
        this.damage = new Vector2(3, 4);
        this.crntHeals = this.health = 18;
        this.speed = 1;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2(x, y);
        this.distance = 1;
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        Vector2 hero = getDistance(getList());
        if (!list.get(hero.x).status.equals("Die.") && hero.y <= this.distance) {
            if (this.attack > list.get(hero.x).defence) {
                list.get(hero.x).crntHeals -= this.damage.x;
                this.status = String.format("(%d:-%s)", hero.x + 1, this.damage.x);
            } else this.status = String.format("(%d:-%s)", hero.x + 1, 0);
        } else {
            if(this.position.y == 1) {
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
