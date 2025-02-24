package taskManagement;

public class TaskManagementApp {
	public static void main(String[] args) {
        TaskList taskList1 = new TaskList("Nummer 1");
        TaskList taskList2 = new TaskList("Nummer 2");

        SimpleTask task1 = new SimpleTask("Einkaufen gehen");
    	SimpleTask task2 = new SimpleTask("Bericht schreiben");
    	SimpleTask task3 = new SimpleTask("Boden säubern");

    	taskList1.add(task1);
    	taskList1.add(task2);
    	taskList2.add(task3);
    	taskList2.add(taskList1);
    	

    	taskList1.display();
    	taskList2.display();
	}
}
