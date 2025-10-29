package paymentsystem;

abstract class Employee {
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    abstract double calculatePay();
}