package paymentsystem;

class FullTimeEmployee extends Employee {
private double monthlySalary;
    
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    double calculatePay() {
        return monthlySalary;
    }
}