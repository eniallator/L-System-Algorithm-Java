package l_system;

public class LSystem implements LSystemInterface {

    private String searchRuleSet(String[][]ruleSet, String toFind) {
        for (String[] rule: ruleSet) {
            if (rule[0].equals(toFind)) {
                return rule[1];
            }
        }

        return null;
    }

    @Override
    public String transform(String[][] ruleSet, String axiom, int iterations) {
        String outString = axiom;

        for (int i = 0; i < iterations; i++) {
            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < outString.length(); j++) {
                String toFind = outString.substring(j, j + 1);
                String result = searchRuleSet(ruleSet, toFind);

                if (result == null) {
                    result = toFind;
                }

                builder.append(result);
            }

            outString = builder.toString();
        }

        return outString;
    }
}
