package test;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Rick", "rick@student.ro", 10.50, 8, 3);
//        System.out.println(firstEmployee.getCalculateDailyIncome());
//        System.out.println(firstEmployee.getCalculateMonthlyIncome());
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employee: ");
        int howManyEmployees = Integer.parseInt(scanner.nextLine());
        System.out.println(howManyEmployees);

        for(int i = 0; i < howManyEmployees;i++){
            System.out.println("Name: ");
            String first = scanner.nextLine();
            System.out.println("Email: ");
            String second = scanner.nextLine();
            System.out.println("Hour Rate: ");
            double third = Double.parseDouble(scanner.nextLine());
            System.out.println("Capacity: ");
            int fourth = Integer.parseInt(scanner.nextLine());
            System.out.println("Free Days: ");
            double fifth = Double.parseDouble(scanner.nextLine());

            System.out.println(first);

            Employee newEmployee = new Employee(first,second,third,fourth,fifth);
            employees.add(newEmployee);



        }

        for (Employee e : employees) {
            System.out.println(e.getEmail());
        }
    }
}
