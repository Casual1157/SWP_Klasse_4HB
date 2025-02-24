package tupperware;

public class Main {
	public static void main(String[] args) {
        // Einzelne Tupperware-Objekte
        TupperwareItem smallBox = new TupperwareItem("Small Box", 0.5);
        TupperwareItem mediumBox = new TupperwareItem("Medium Box", 1.0);
        TupperwareItem largeBox = new TupperwareItem("Large Box", 2.0);

        // Ein Kompositum, das mehrere Behälter enthält
        TupperwareSet picnicSet = new TupperwareSet("Picnic Set");
        picnicSet.add(smallBox);
        picnicSet.add(mediumBox);

        // Ein größeres Kompositum, das das vorherige Kompositum enthält
        TupperwareSet familySet = new TupperwareSet("Family Set");
        familySet.add(picnicSet);
        familySet.add(largeBox);

        // Ausgabe der Hierarchie
        System.out.println("Tupperware Hierarchie:\n");
        picnicSet.display();
        System.out.println("\nTupperware Hierarchie:\n");
        familySet.display();
    }
}