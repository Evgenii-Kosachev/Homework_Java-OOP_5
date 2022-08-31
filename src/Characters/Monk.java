package Characters;

import java.util.Random;

/** Класс Монах */
public class Monk extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Monk(String name) {
        super.name = name;

        super.attack = 12;
        super.protection = 7;
        super.shotsFired = 0;
        super.damage = new int[]{-4, -4, 0};
        super.health = 30;
        super.speed = 5;
        super.delivery = false;
        super.magic = true;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
