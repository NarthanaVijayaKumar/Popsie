import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double basicSalary;
    private double hra;
    private double da;
    private double deduction;

    public Employee(int id, String name, String department,
                    double basicSalary, double hra,
                    double da, double deduction) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.deduction = deduction;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getDeduction() {
        return deduction;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }


    public double calculateNetSalary() {
        return basicSalary + hra + da - deduction;
    }

    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Employee ID      : " + id);
        System.out.println("Name             : " + name);
        System.out.println("Department       : " + department);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA              : " + hra);
        System.out.println("DA               : " + da);
        System.out.println("Deduction        : " + deduction);
        System.out.println("Net Salary       : " + calculateNetSalary());
    }
}

public class EmployeePayrollSystem {

    static ArrayList<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        Employee emp = new Employee(id, name, department,
                basic, hra, da, deduction);

        employeeList.add(emp);

        System.out.println("Employee Added Successfully.");
    }

    public static void displayEmployees() {

        if (employeeList.isEmpty()) {
            System.out.println("No Employee Records.");
            return;
        }

        for (Employee emp : employeeList) {
            emp.display();
        }
    }

    public static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee emp : employeeList) {

            if (emp.getId() == id) {
                emp.display();
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void updateEmployee() {

        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();

        for (Employee emp : employeeList) {

            if (emp.getId() == id) {

                sc.nextLine();

                System.out.print("Enter New Name: ");
                emp.setName(sc.nextLine());

                System.out.print("Enter New Department: ");
                emp.setDepartment(sc.nextLine());

                System.out.print("Enter New Basic Salary: ");
                emp.setBasicSalary(sc.nextDouble());

                System.out.print("Enter New HRA: ");
                emp.setHra(sc.nextDouble());

                System.out.print("Enter New DA: ");
                emp.setDa(sc.nextDouble());

                System.out.print("Enter New Deduction: ");
                emp.setDeduction(sc.nextDouble());

                System.out.println("Employee Updated Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        for (Employee emp : employeeList) {

            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== Employee Payroll System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);
    }
}
