class Employee {
    protected String name;
    protected int id;
    protected String department;

    public void setDetails(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public double calculatePay() {
        return 0; 
    }
}


class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public void setSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public void setWorkDetails(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}


class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    public void setContractDetails(String projectName, double contractAmount) {
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}


public class EmploySystem {
    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee();
        emp1.setDetails("Nahid", 101, "IT");
        emp1.setSalary(50000);

        System.out.println("Full Time Salary = " + emp1.calculatePay());

        PartTimeEmployee emp2 = new PartTimeEmployee();
        emp2.setDetails("Ratul", 102, "Support");
        emp2.setWorkDetails(200, 20);

        System.out.println("Part Time Salary = " + emp2.calculatePay());

        ContractEmployee emp3 = new ContractEmployee();
        emp3.setDetails("Adetty", 103, "Project");
        emp3.setContractDetails("AI System", 80000);

        System.out.println("Contract Salary = " + emp3.calculatePay());
    }
}