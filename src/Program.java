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
                    darkSide.add(new Sorcerer(darkSide, i + 1,1));
                    break;
                case 1:
                    darkSide.add(new Brigand(whiteSide, i + 1,1));
                    break;
                case 2:
                    darkSide.add(new Crossbowman(whiteSide, i + 1,1));
                    break;
                default:
                    darkSide.add(new Peasant(darkSide, i + 1,1));
            }
        }


        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Monk(whiteSide, i + 1,10));
                    break;
                case 1:
                    whiteSide.add(new Spearman(darkSide, i + 1,10));
                    break;
                case 2:
                    whiteSide.add(new Sniper(darkSide, i + 1,10));
                    break;
                default:
                    whiteSide.add(new Peasant(whiteSide, i + 1,10));
            }
        }


        if (step == 1){
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\t\t\tWhite side");
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).getInfo().length() > 28) {
                System.out.println("#"+ (i + 1) +" "+ darkSide.get(i).getInfo() + "\t:\t" + "#"+ (i + 1) + " " + whiteSide.get(i).getInfo());
            } else {
                System.out.println("#"+ (i + 1) +" "+ darkSide.get(i).getInfo() + "\t\t:\t" + "#"+ (i + 1) + " " + whiteSide.get(i).getInfo());
            }
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("next")){
                for (int i = 0; i < darkSide.size(); i++) {
                    darkSide.get(i).step();
                    whiteSide.get(i).step();
                    if (darkSide.get(i).getInfo().length() > 28) {
                        System.out.println("#"+ (i + 1) +" "+ darkSide.get(i).getInfo() + "\t:\t" + "#"+ (i + 1) + " " + whiteSide.get(i).getInfo());
                    } else {
                        System.out.println("#"+ (i + 1) +" "+ darkSide.get(i).getInfo() + "\t\t:\t" + "#"+ (i + 1) + " " + whiteSide.get(i).getInfo());
                    }
                }
            }
            if(txt.equals("quite")) break;
        }

        darkSide.forEach(Actions::step);
        whiteSide.forEach(Actions::step);
    }
}
