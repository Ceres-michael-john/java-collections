package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type something:");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Type y/n:");
        String userString = scanner.nextLine();
        return (userString.equalsIgnoreCase("yes") ||
                userString.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userString = scanner.nextLine();
        return (userString.equalsIgnoreCase("yes") ||
                userString.equalsIgnoreCase("y"));
    }

    public int getInt() {
        System.out.println("Type an integer:");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt < min || userInt > max) {
            System.out.format("That number is out of range.  Please enter an integer between %d and %d.%n", min, max);
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userInt = Integer.parseInt(scanner.nextLine());
        if (userInt < min || userInt > max) {
            System.out.format("That number is out of range.  Please enter an integer between %d and %d.%n", min, max);
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public double getDouble() {
        System.out.println("Type a decimal number:");
        return Double.parseDouble(scanner.nextLine());
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max) {
            System.out.format("That number is out of range.  Please enter a decimal number between %f and %f.%n", min, max);
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userDouble = Double.parseDouble(scanner.nextLine());
        if (userDouble < min || userDouble > max) {
            System.out.format("That number is out of range.  Please enter a decimal number between %f and %f.%n", min, max);
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }

}
