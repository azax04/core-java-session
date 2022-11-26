package inheritance;

public final class Executive extends Manager {

    private double shares;

    public Executive(String name, int age, String id, String address, double salary, boolean fireEmployee, double bonus, double shares) {
        super(name, age, id, address, salary, bonus);
        this.shares = shares;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + shares;
    }

    public void fireManager(){}

}
