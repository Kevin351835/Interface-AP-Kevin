public abstract class Employee implements Payable {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double getPaymentAmount();
    public abstract String getDetails();

    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }

}