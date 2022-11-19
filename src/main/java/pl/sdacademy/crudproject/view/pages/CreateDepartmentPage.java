package pl.sdacademy.crudproject.view.pages;

import pl.sdacademy.crudproject.dao.DaoFactory;
import pl.sdacademy.crudproject.dao.DepartmentDao;
import pl.sdacademy.crudproject.model.Department;
import pl.sdacademy.crudproject.view.ViewUtil;

import java.util.Scanner;

public class CreateDepartmentPage implements Page {
    @Override
    public void show() {
        System.out.println("Dodawanie nowego wydziału:");
        Scanner scanner = ViewUtil.getScanner();
        System.out.println("Nazwa wydziału: ");
        String name = scanner.nextLine();
        DepartmentDao dao = (DepartmentDao) DaoFactory.get(DepartmentDao.class);
        dao.create(new Department(name));
        scanner.nextLine();
    }
}
