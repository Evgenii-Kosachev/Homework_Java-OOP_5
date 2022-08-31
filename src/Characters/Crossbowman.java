package Characters;

import java.util.Random;

/** Класс Арбалетчик */
public class Crossbowman extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Crossbowman(String name) {
        super.name = name;

        super.attack = 6;
        super.protection = 3;
        super.shotsFired = 16;
        super.damage = new int[]{2, 3, 0};
        super.health = 10;
        super.speed = 4;
        super.delivery = false;
        super.magic = false;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
