import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while(true) {
            System.out.println("1.Add Task 2.View Tasks 3.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1: System.out.print("Enter task: "); tasks.add(sc.nextLine()); break;
                case 2: System.out.println("Tasks: " + tasks); break;
                case 3: System.exit(0);
            }
        }
    }
}