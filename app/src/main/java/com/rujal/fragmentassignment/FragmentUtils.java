package com.rujal.fragmentassignment;

public class FragmentUtils {
    private FragmentUtils() {
        /*
         * Because Util class should be let to create object
         */
    }

    public static boolean isValidInt(String numberString) {
        try {
            if (!numberString.isEmpty()) {
                Integer.parseInt(numberString);
                return true;
            }
            return false;
        } catch (NumberFormatException ex) {
            System.err.println(numberString + " is not a number");
            return false;
        }
    }

    public static boolean isValidFloat(String numberString) {
        try {
            if (!numberString.isEmpty()) {
                Float.parseFloat(numberString);
                return true;
            }
            return false;
        } catch (NumberFormatException ex) {
            System.err.println(numberString + " is not a number");
            return false;
        }
    }

    public static float getAreaOfCircle(float radius) {
        return 22/(float)7 * radius * radius;
    }

    public static boolean isPalindromeNumber(String numberString) {
        if (isValidInt(numberString)) {
            int num = Integer.parseInt(numberString);
            int remainder, sum = 0, temp;
            temp = num;
            while (num > 0) {
                remainder = num % 10;  //getting remainder
                sum = (sum * 10) + remainder;
                num = num / 10;
            }
            if (temp == sum) {
                return true;
            }
        }

        return false;
    }

    public static boolean isArmStrongNumber(String numberString) {
        if (isValidInt(numberString)) {
            int num = Integer.parseInt(numberString);
            int c = 0, a, temp;
            temp = num;
            while (num > 0) {
                a = num % 10;
                num = num / 10;
                c = c + (a * a * a);
            }
            if (temp == c) {
                System.out.println("armstrong number");
                return true;
            }
        }
        return false;
    }

    public static boolean isAutomorphicNumber(String numberString) {
        if (isValidInt(numberString)) {
            int num = Integer.parseInt(numberString);
            int squareNum = num * num;
            String str_num = Integer.toString(num);
            String square = Integer.toString(squareNum);

            if (square.endsWith(str_num)) {
                System.out.println("Automorphic Number.");
                return true;
            }
        }
        return false;
    }

    public static float getSimpleInterest(float principal, float timeInYears, float rate) {
        return principal * timeInYears * rate;
    }

    public static SwapMember swapVariables(SwapMember swapMember) {
        int a = swapMember.getA();
        int b = swapMember.getB();

        a = a + b;
        b = a - b;
        a = a - b;

        swapMember.setA(a);
        swapMember.setB(b);

        return swapMember;
    }
}
