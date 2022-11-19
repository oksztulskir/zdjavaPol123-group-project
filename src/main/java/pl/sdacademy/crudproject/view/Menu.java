package pl.sdacademy.crudproject.view;

import java.util.Arrays;
import java.util.List;

public class Menu extends AbstractMenu {
    @Override
    public List<MenuItem> getMenuItems() {
        return Arrays.asList(
                new MenuItem("Zarządzanie wydziałami", 1, null, new DepartmentMenu()),
                new MenuItem("Zarządzanie pracownikami", 2, null, new WorkerMenu()),
                new MenuItem("Wyjście", 0, null, null)
        );
    }
}
