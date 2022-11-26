package inheritance;

public sealed class Manager extends Employee permits Executive {


    private double bonus;

    public Manager(String name, int age, String id, String address, double salary, double bonus) {
        super(name, age, id, address, salary);

        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void fireEmployee(){}
}
