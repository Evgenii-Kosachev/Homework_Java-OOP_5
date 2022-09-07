package Characters;

import java.util.List;

/** Базовый класс */
public abstract class BaseHero implements Actions {
    protected String name;

    protected int attack;
    protected int defence;
    protected int shotsFired;  protected int crntShotsFired;
    protected Vector2 damage;
    protected int health;      protected int crntHeals;
    protected int speed;
    protected boolean delivery;
    protected boolean magic = true;

    protected String status;
    protected Vector2 position;
    protected List<BaseHero> list;


    protected List<BaseHero> getList() {return this.list;}

    public BaseHero(List<BaseHero> side) {
        this.list = side;
    }

    @Override
    public String getInfo() {
        if(this.crntHeals > 0) {
            return this.name + " H:" + this.crntHeals + " D:" + this.defence + " A:" + this.attack + " " + this.status;
        }
        else {
            this.status = "Die.";
            return String.format("<<< The %s is dead >>>", this.name);
        }
    }
}
