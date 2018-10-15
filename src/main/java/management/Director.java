package management;

public class Director extends Manager {

    private double budget;
    private double salary;

    public Director(String name, int niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
        this.salary = salary;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return (salary * 0.02);
    }
}
