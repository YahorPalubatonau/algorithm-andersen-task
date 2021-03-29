package com.andersen;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmSolver {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            String input = scanner.nextLine();
            if (input.split(" ").length > 1 && Arrays.stream(input.split(" ")).allMatch(str -> str.matches("-?\\d+"))) {
                Arrays.stream(input.split(" "))
                        .map(Integer::valueOf)
                        .filter(integer -> integer % 3 == 0)
                        .forEach(System.out::println);

            } else if (input.matches("-?\\d+") && Integer.valueOf(input) > 7) {
                System.out.println("Hi)");
            } else if (input.equals("Viacheslav")) {
                System.out.println("Hi, Viacheslav");
            } else if (!input.matches("-?\\d+")) {
                System.out.println("No such name");
            }
        }
        scanner.close();

    }


}
