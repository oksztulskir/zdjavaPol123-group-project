package pl.sdacademy.crudproject.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.sdacademy.crudproject.view.pages.Page;

@Getter
@AllArgsConstructor
public class MenuItem {
    private String label;

    private int option;

    private Page parent;

    private Page child;
}
