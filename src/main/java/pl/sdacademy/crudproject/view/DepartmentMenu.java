package pl.sdacademy.crudproject.view;

import pl.sdacademy.crudproject.view.pages.CreateDepartmentPage;

import java.util.Arrays;
import java.util.List;

public class DepartmentMenu extends AbstractMenu {
    @Override
    public List<MenuItem> getMenuItems() {
        return Arrays.asList(
                new MenuItem("Dodaj wydział", 1, new DepartmentMenu(), new CreateDepartmentPage()),

                new MenuItem("Powrót", 0, new Menu(), null)
        );
    }
}
