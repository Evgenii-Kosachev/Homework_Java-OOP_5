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
    protected int distance;


    protected List<BaseHero> getList() {return this.list;}

    public BaseHero(List<BaseHero> side) {
        this.list = side;
    }

    @Override
    public String getInfo() {
        if(this.crntHeals > 0) {
            return "[x:" + this.position.x + ", y:" + this.position.y + "] " + this.name + " H:" + this.crntHeals + " "  + this.status;
        }
        else {
            this.status = "Die.";
            return String.format("<<< The %s is dead >>>", this.name);
        }
    }



    public Vector2 getDistance(List<BaseHero> side){
        int dist = Integer.MAX_VALUE;
        int out = 0;

        for (BaseHero baseHero : side) {
            float dX = Math.abs(baseHero.position.x - position.x);
            float dY = Math.abs(baseHero.position.y - position.y);
            long tD = Math.round(Math.sqrt(dX*dX + dY*dY));
            if (dist > tD) {
                out = side.indexOf(baseHero);
                dist = (int) tD;
            }
        }
        return new Vector2(out, dist);
    }
}
