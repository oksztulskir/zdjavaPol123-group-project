package pl.sdacademy.crudproject.view;

import java.util.Scanner;

public class ViewUtil {
    private static Scanner scanner = null;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
