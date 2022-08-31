package Characters;

import java.util.Random;

/** Базовый класс */
public abstract class BaseHero implements Actions {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int attack;
    protected int[] damage;
    protected int protection;
    protected int shotsFired;
    protected int health;
    protected int speed;
    protected boolean delivery;
    protected boolean magic;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }


    @Override
    public void hit(BaseHero target) {
        target.getHit(this.damage);
        System.out.printf("%s %s.\n", this.getClass().getSimpleName(), changePosition());
    }

    @Override
    public void getHit(int[] damage) {this.health -= damage[2];}

    @Override
    public boolean status() {return health > 0;}

    @Override
    public String changePosition() {
        if(this.magic || this.shotsFired > 0) return "attacked from the spot";
        else return "shortened the distance";
    }

    @Override
    public String getInfo() {
        if(this.status()) {
            return String.format("Name: %s, health: %d, damage: %d, type: %s.",
                    this.name, this.health, this.damage[2], this.getClass().getSimpleName());
        }else return String.format("%s is dead.", this.getClass().getSimpleName());
    }


    /**
     * Конструктор создания персонажа.
     * @param name Имя персонажа заданного пользователем.
     */
    public BaseHero(String name) {this.name = name;}

    public BaseHero() {this(String.format("Hero #%d", ++BaseHero.number));}


    /** Геттер приватного поля name */
    public String getName() {return this.name;}

    /** Геттер приватного поля attack */
    public int getAttack() {return this.attack;}

    /** Геттер приватного поля protection */
    public int getProtection() {return this.protection;}

    /** Геттер приватного поля shotsFired */
    public int getShotsFired() {return this.shotsFired;}

    /** Геттер приватного поля damage */
    public int[] getDamage() {return this.damage;}

    /** Геттер приватного поля health */
    public int getHealth() {return this.health;}

    /** Геттер приватного поля speed */
    public int getSpeed() {return this.speed;}

    /** Геттер приватного поля delivery */
    public boolean getDelivery() {return this.delivery;}

    /** Геттер приватного поля magic */
    public boolean getMagic() {return this.magic;}
}
