package Characters;

import java.util.Random;

/** Класс Колдун */
public class Sorcerer extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Sorcerer(String name) {
        super.name = name;

        super.attack = 17;
        super.protection = 12;
        super.shotsFired = 0;
        super.damage = new int[]{-5, -5, 0};
        super.health = 30;
        super.speed = 9;
        super.delivery = false;
        super.magic = true;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
