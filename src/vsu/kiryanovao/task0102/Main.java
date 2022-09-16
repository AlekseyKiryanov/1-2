package vsu.kiryanovao.task0102;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(compareNumbers(a, b, c));
    }

    public static String compareNumbers(int a, int b, int c) {
        String rez = Integer.toString((int) Math.min(a, Math.min(b, c)));
        rez = rez + ", " + Integer.toString((int) (a + b + c - Math.min(a, Math.min(b, c)) - Math.max(a, Math.max(b, c))));
        rez = rez + ", " + Integer.toString((int) Math.max(a, Math.max(b, c)));
        return (rez);
    }
}
