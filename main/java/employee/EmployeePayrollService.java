package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner console = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(console);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner console){
        System.out.println("Enter employee Id");
        int id = console.nextInt();
        console.nextLine();
        System.out.println("Enter employee name");
        String name = console.nextLine();
        System.out.println("Enter salary");
        double salary = console.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData(){
        System.out.println("Writing employee payroll to console\n" + employeePayrollList);
    }
}
