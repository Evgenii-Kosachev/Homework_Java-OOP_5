package Characters;

import java.util.List;

/** Класс Арбалетчик */
public class Crossbowman extends BaseHero{

    /** Конструктор создания персонажа */
    public Crossbowman(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Crossbowman";
        this.attack = 6;
        this.defence = 3;
        this.shotsFired = 16;
        this.damage = new Vector2(2.0F, 3.0F);
        this.crntHeals = health = 10;
        this.speed = 4;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {
    }
}
