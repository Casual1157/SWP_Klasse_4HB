package tupperware;

public class TupperwareItem extends TupperwareComponent {
    private String name;
    private double capacity;

    public TupperwareItem(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public void display() {
        System.out.println("Tupperware: " + name + " (Größe: " + capacity + " Liter)");
    }

}