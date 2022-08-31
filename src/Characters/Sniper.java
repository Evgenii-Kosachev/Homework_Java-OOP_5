package Characters;

import java.util.Random;

/** Класс Снайпер*/
public class Sniper extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Sniper(String name) {
        super.name = name;

        super.attack = 12;
        super.protection = 10;
        super.shotsFired = 32;
        super.damage = new int[]{8, 10, 0};
        super.health = 15;
        super.speed = 9;
        super.delivery = false;
        super.magic = false;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
