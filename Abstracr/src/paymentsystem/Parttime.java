package paymentsystem;

class Parttime extends Employee {
    private double ratePerHour;
    private double hoursWorked;
    
    public Parttime(String name, double ratePerHour, double hoursWorked) {
        super(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    double calculatePay() {
        return ratePerHour * hoursWorked;
    }
}