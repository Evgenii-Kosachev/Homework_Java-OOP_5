package Characters;

import java.util.Random;

/** Класс Разбойник */
public class Robber extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Robber(String name) {
        super.name = name;

        super.attack = 8;
        super.protection = 3;
        super.shotsFired = 0;
        super.damage = new int[]{2, 4, 0};
        super.health = 10;
        super.speed = 6;
        super.delivery = false;
        super.magic = false;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
