package Characters;

import java.util.List;

/** Класс Крестьянин */
public class Peasant extends BaseHero{

    /** Конструктор создания персонажа */
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Peasant";
        this.attack = 1;
        this.defence = 1;
        this.shotsFired = 0;
        this.damage = new Vector2(1.0F, 1.0F);
        this.crntHeals = this.health = 1;
        this.speed = 3;
        this.delivery = true;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {}
}
