package echo;

import java.util.ArrayList;
import java.util.List;

public class Echo {
    public static void main(String[] args) {
        List<String> argsToPrint = new ArrayList<>();

        for (String arg : args) {
            if (arg.startsWith("-")) {
                // TODO: Interpret argument
            } else {
                argsToPrint.add(arg);
            }
        }

        for (int i = 0; i < argsToPrint.size(); i++) {
            String arg = argsToPrint.get(i);
            System.out.print(arg);

            if (i != argsToPrint.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
