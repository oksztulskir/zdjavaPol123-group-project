package pl.sdacademy.crudproject.dao;

public class DaoFactory {
    private static DepartmentDao departmentDao = null;
    private static WorkerDao workerDao = null;

    private DaoFactory() {

    }

    public static GenericDAO get(Class clazz) {
        if (clazz == DepartmentDao.class) {
            return getDepartmentDao();
        } else if (clazz == WorkerDao.class) {
            return getWorkerDao();
        }

        throw new IllegalArgumentException("There is no class " + clazz.getName() + " implementing DAO interface!");
    }

    private static DepartmentDao getDepartmentDao() {
        if (departmentDao == null) {
            departmentDao = new DepartmentDao();
        }

        return departmentDao;
    }

    private static WorkerDao getWorkerDao() {
        if (workerDao == null) {
            workerDao = new WorkerDao();
        }

        return workerDao;
    }
}
