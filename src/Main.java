import l_system.LSystem;

public class Main {
    public static void main(String[] args) {
        LSystem lSystem = new LSystem();

        String[][] ruleSet = {
                {"A", "AB"},
                {"B", "A"}
        };
        String axiom = "A";
        int iterations = 5;

        System.out.println(lSystem.transform(ruleSet, axiom, iterations));
    }
}
