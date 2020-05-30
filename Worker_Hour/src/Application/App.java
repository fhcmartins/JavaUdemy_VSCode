package Worker_Hour.src.Application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Worker_Hour.src.entities.Department;
import Worker_Hour.src.entities.Worker;
import Worker_Hour.src.entities.enums.WorkLevel;
import jdk.internal.module.SystemModuleFinders;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd//MM//yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.printl("Base salary: ");
        double baseSalary = sc.nextDouble();

        // Instantiatin a new worker
        Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker: ");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++){
            System.out.println("Enter contract #" + i + " data:");;
            System.out.print("Date (DD/MM/YYYY): ");
            date contractDate = sdf.parse(sc.next());
        }

        sc.close();
    }
}
