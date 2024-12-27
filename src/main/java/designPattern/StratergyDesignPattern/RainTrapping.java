package designPattern.StratergyDesignPattern;

import java.util.ArrayList;

public class RainTrapping {
    private static SolveStrategy solveStrategy;

    public static void main(String[] args) {
        solveStrategy = new DpStrategy();
        solveStrategy.solve(new ArrayList<>());
    }
}
