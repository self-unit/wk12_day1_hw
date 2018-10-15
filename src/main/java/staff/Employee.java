package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.niNumber = niNumber;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseAmount) {
        if (raiseAmount >= 1) {
            this.salary += raiseAmount;
        }
    }

    public double payBonus() {
        return (salary * 0.01);
    }

    public void setName(String newName) {
        if (newName.isEmpty()) {
            return;
        } else {
            this.name = newName;
        }
//        if (newName != null && newName.length() == 0) {
//            this.name = newName;
//        }
//        if (newName == null){
//            return;
//        } else {
//            this.name = newName;
//        }
    }
}
