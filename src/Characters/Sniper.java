package Characters;

import java.util.List;

/** Класс Снайпер*/
public class Sniper extends BaseHero{

    /** Конструктор создания персонажа */
    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Sniper";
        this.attack = 12;
        this.defence = 10;
        this.shotsFired = 32;
        this.damage = new Vector2(8.0F, 10.0F);
        this.crntHeals = this.health = 15;
        this.speed = 9;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {}
}
