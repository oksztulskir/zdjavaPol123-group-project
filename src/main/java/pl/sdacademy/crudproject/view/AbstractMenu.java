package pl.sdacademy.crudproject.view;

import pl.sdacademy.crudproject.view.pages.Page;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractMenu implements Page {
    public abstract List<MenuItem> getMenuItems();

    @Override
    public void show() {
        getMenuItems().forEach(item -> System.out.println(item.getOption() + "." + item.getLabel()));
        System.out.println("Wybierz opcję:");
        Scanner scanner = ViewUtil.getScanner();
        MenuItem found = null;
        while (found == null) {
            int option = scanner.nextInt();
            found = getMenuItems().stream()
                    .filter(menuItem -> menuItem.getOption() == option)
                    .findAny()
                    .orElse(null);

            if (found != null) {
                if (found.getOption() == 0) {
                    if (found.getParent() == null) {
                        System.exit(0);
                    } else {
                        found.getParent().show();
                    }
                } else {
                    found.getChild().show();
                    found.getParent().show();
                }
            }
        }
    }
}
