package taskManagement;

import java.util.ArrayList;

public class TaskList extends Task {
    private ArrayList<Task> tasks = new ArrayList<>();

    public TaskList(String title) {
        super(title);
    }

    @Override
    public void display() {
        System.out.println("Aufgabenliste: " + getTitle());
        for (Task task : tasks) {
            task.display();
        }
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

}
