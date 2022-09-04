package Characters;

import java.util.List;
import java.util.Random;

/** Класс Колдун */
public class Sorcerer extends BaseHero{

    /** Конструктор создания персонажа */
    public Sorcerer(List<BaseHero> side, int x, int y) {
        super(side);
        this.name = "Sorcerer";
        this.attack = 17;
        this.defence = 12;
        this.shotsFired = 0;
        this.damage = new Vector2(-5.0F, -5.0F);
        this.crntHeals = this.health = 30;
        this.speed = 9;
        this.delivery = false;
        this.magic = true;
        this.status = "stand";
        this.position = new Vector2((float)x, (float)y);
    }

    public boolean status() {return this.status.equals("active");}

    public void step() {
        Random rnd = new Random();
        list.get( rnd.nextInt( list.size() ) ).health -= damage.x;
    }
}
