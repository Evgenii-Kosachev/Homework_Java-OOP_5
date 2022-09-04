package Characters;

import java.util.List;

/** Класс Копейщик */
public class Spearman extends BaseHero{

    /** Конструктор создания персонажа */
    public Spearman(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Spearman";
        this.attack = 4;
        this.defence = 5;
        this.shotsFired = 0;
        this.damage = new Vector2(1.0F, 3.0F);
        this.crntHeals = this.health = 10;
        this.speed = 4;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
    }
}
