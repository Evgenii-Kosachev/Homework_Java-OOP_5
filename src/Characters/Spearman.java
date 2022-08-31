package Characters;

import java.util.Random;

/** Класс Копейщик */
public class Spearman extends BaseHero{

    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public Spearman(String name) {
        super.name = name;

        super.attack = 4;
        super.protection = 5;
        super.shotsFired = 0;
        super.damage = new int[]{1, 3, 0};
        super.health = 10;
        super.speed = 4;
        super.delivery = false;
        super.magic = false;

        damage[2] = new Random().nextInt(damage[0],damage[1] + 1);
    }
}
