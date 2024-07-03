package Behavioral_Patterns.Strategy_Pattern;

public class StrategyAdd implements Strategy{
    @Override
    public void execute(int a, int b) {
        System.out.println(a+b);
    }
}
