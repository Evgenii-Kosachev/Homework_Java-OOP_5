package Characters;

import java.util.List;
import java.util.Random;

/** Класс Монах */
public class Monk extends BaseHero{

    /** Конструктор создания персонажа */
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Monk";
        this.attack = 12;
        this.defence = 7;
        this.shotsFired = 0;
        this.damage = new Vector2(-4.0F, -4.0F);
        this.crntHeals = this.health = 30;
        this.speed = 5;
        this.delivery = false;
        this.magic = true;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return this.status.equals("active");}

    @Override
    public void step() {
        Random rnd = new Random();
        list.get( rnd.nextInt( list.size() ) ).health -= damage.x;
    }
}
