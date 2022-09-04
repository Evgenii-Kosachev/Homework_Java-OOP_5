package Characters;

import java.util.List;

/** Класс Разбойник */
public class Brigand extends BaseHero{

    /** Конструктор создания персонажа */
    public Brigand(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Brigand";
        this.attack = 8;
        this.defence = 3;
        this.shotsFired = 0;
        this.damage = new Vector2(2.0F, 4.0F);
        this.crntHeals = health = 10;
        this.speed = 6;
        this.delivery = false;
        this.magic = false;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {}
}
