package Characters;

import java.util.Random;

/** Класс Крестьянин */
public class Peasant extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Peasant(String name) {
        super.name = name;

        super.attack = 1;
        super.protection = 1;
        super.shotsFired = 0;
        super.damage = new int[]{1, 1, 0};
        super.health = 1;
        super.speed = 3;
        super.delivery = true;
        super.magic = false;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
