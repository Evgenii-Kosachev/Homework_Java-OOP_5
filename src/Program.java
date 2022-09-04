import Characters.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int step = 1;
        List<BaseHero> darkSide = new ArrayList<BaseHero>();
        List<BaseHero> whiteSide = new ArrayList<BaseHero>();

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    darkSide.add(new Sorcerer(darkSide, 0,0));
                    break;
                case 1:
                    darkSide.add(new Brigand(darkSide, 0,0));
                    break;
                case 2:
                    darkSide.add(new Crossbowman(darkSide, 0,0));
                    break;
                default:
                    darkSide.add(new Peasant(darkSide, 0,0));
            }
        }


        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Monk(darkSide, 0,0));
                    break;
                case 1:
                    whiteSide.add(new Spearman(darkSide, 0,0));
                    break;
                case 2:
                    whiteSide.add(new Sniper(darkSide, 0,0));
                    break;
                default:
                    whiteSide.add(new Peasant(darkSide, 0,0));
            }
        }


        if (step == 1 ){
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\t\tWhite side");
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).getInfo().length() > 27) {
                System.out.println(darkSide.get(i).getInfo() + "\t:\t" + whiteSide.get(i).getInfo());
            } else {
                System.out.println(darkSide.get(i).getInfo() + "\t\t:\t" + whiteSide.get(i).getInfo());
            }
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("next")){
                for (int i = 0; i < darkSide.size(); i++) {
                    darkSide.get(i).step();
                    whiteSide.get(i).step();
                    if (darkSide.get(i).getInfo().length() > 27) {
                        System.out.println(darkSide.get(i).getInfo() + "\t:\t" + whiteSide.get(i).getInfo());
                    } else {
                        System.out.println(darkSide.get(i).getInfo() + "\t\t:\t" + whiteSide.get(i).getInfo());
                    }
                }
            }
            if(txt.equals("quite")) break;
        }
    }
}
