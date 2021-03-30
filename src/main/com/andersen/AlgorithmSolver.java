package com.andersen;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.andersen.Constants.*;

class AlgorithmSolver {
    private static String getResult(String[] splitString, boolean isInteger) {
        String firstElement = splitString[0];
        if (splitString.length > SIZE_OF_ARRAY && isInteger) {
            return Arrays.stream(splitString)
                    .map(Integer::valueOf)
                    .filter(integer -> integer % MULTIPLE == 0)
                    .map(Object::toString)
                    .collect(Collectors.joining(EMPTY));

        } else if (isInteger && Integer.valueOf(firstElement) > MINIMAL_BOUND_FOR_GREETINGS) {
            return GREETING;
        } else if (firstElement.equals(USER_NAME)) {
            return GREETING + EMPTY + USER_NAME;
        } else if (!isInteger) {
            return NO_SUCH_NAME;
        }
        return EMPTY;
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String[] splitString = scanner.nextLine().trim().split(EMPTY);
            boolean isInteger = Arrays.stream(splitString).allMatch(str -> str.matches(REGEX_FOR_DIGIT));
            System.out.println(getResult(splitString, isInteger));
        }
        scanner.close();

    }


}
