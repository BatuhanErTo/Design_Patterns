package Behavioral_Patterns.Strategy_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("A for add, M for multiply: ");
        String name = scanner.nextLine();

        Context context = new Context();

        if (name.equals("A")) {
            context.setStrategy(new StrategyAdd());
            context.executeStrategy(a,b);
        }else{
            context.setStrategy(new StrategyMultiply());
            context.executeStrategy(a,b);
        }

    }
}
