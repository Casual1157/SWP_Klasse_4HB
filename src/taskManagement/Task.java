package taskManagement;

public abstract class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void display();

    public void add(Task task) {
        
    }

    public void remove(Task task) {
        
    }
}
