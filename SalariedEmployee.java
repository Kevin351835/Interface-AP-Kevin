public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String id, double salary) {
        super(name, id);
        this.weeklySalary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String getDetails() {
        return "Salaried Employee: " + getName();
}
}