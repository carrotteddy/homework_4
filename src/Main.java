import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList names1 = new ArrayList<>();
        ArrayList names2 = new ArrayList<>();
        System.out.println("введите 5 имен мужских");

        for (int i = 0; i < 5; i++) {
            String name  = scanner.next();
            names1.add(name);
        }
        System.out.println(names1);

        System.out.println("введите 5 имен женских");
        for (int i = 0; i < 5; i++) {
            String name  = scanner.next();
            names2.add(name);
        }
        System.out.println(names2);

        Collections.reverse(names2);

        ArrayList allNames = new ArrayList();
        for (int i = 0; i < 5; i++) {
            allNames.add(names1.get(i));
            allNames.add(names2.get(i));
        }
        System.out.println(allNames);

    }
}