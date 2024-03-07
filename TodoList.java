import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    todoList.addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter index of task to remove: ");
                    int indexToRemove = scanner.nextInt() - 1;
                    todoList.removeTask(indexToRemove);
                    break;
                case 3:
                    todoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

