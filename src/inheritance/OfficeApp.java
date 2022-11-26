package inheritance;

public class OfficeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 19, "987XYZ", "Itahari", 25000);
        System.out.println(employee.getSalary());

        Manager manager = new Manager("Ram", 23, "123ABC", "Kathmandu", 50000,1000);
        System.out.println(manager.getSalary());

        Executive executive = new Executive("Shawn", 40, "555JKL", "USA", 80000, true, 3000, 2000);
        System.out.println(executive.getSalary());

        Programmer programmer = new Programmer("Hari", 33, "jhrhhe23", "USA", 60000, 500);
        System.out.println(programmer.getSalary());




    }
}
