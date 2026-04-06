public class Hourly extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public Hourly(String name, String employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getDetails() {
        return "Hourly Employee: " + getName();
    }
}