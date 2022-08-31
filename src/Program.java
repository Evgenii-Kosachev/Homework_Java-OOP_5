import Characters.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        BaseHero hero1 = new Crossbowman("Hero1");
        BaseHero hero2 = new Peasant("Hero2");
        BaseHero hero3 = new Monk("Hero3");
        BaseHero hero4 = new Sniper("Hero4");
        BaseHero hero5 = new Sorcerer("Hero5");
        BaseHero hero6 = new Spearman("Hero6");
        BaseHero hero7 = new Robber("Hero7");


        List<BaseHero> Battle = new ArrayList<>();
        Battle.add(hero1);
        Battle.add(hero2);

        for (BaseHero baseHero : Battle) {System.out.println(baseHero.getInfo());}
        System.out.println();

        Battle.get(0).hit(Battle.get(1));

        for (BaseHero baseHero : Battle) {System.out.println(baseHero.getInfo());}
    }
}
