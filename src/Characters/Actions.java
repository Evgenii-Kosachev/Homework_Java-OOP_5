package Characters;

public interface Actions {
    void hit(BaseHero target);
    void getHit(int[] damage);
    boolean status();
    String changePosition();
    String getInfo();
}
