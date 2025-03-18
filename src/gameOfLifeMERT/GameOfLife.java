package gameOfLifeMERT;

import java.util.Random;
import java.util.Scanner;

public class GameOfLife {

    private static int row; // Anzahl von Zeilen
    private static int column; // Anzahl von Spalten
    private static boolean[][] grid; // Gitter
    private static boolean[][] nextGrid; // neue Gitter
    static Scanner scan = new Scanner(System.in); // Scanner
    
    static void gridPrint() { //Gibt den Gitter aus
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(grid[i][j] ? "O " : ". ");
                /*Wenn Gitter wahr ist, wird 'O' ausgegeben
                 *Ansonstens wird '.' ausgegeben*/
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void random() { //Gitter wird zufällig ausgefüllt
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                grid[i][j] = random.nextBoolean();
            }
        }
    }
    
    static void Choice() {
    	/*Der User hat den Wahl ob die lebende Zellen zufällig ausgefügt werden oder
    	 *Sie von der User selbst zugefügt werden*/
        System.out.println("Would you like it randomized? (y/n): ");
        String choice = scan.next();
        if(choice.equalsIgnoreCase("y")) {
            random();
        } else if(choice.equalsIgnoreCase("n")){
            System.out.println("Please input where you want the cells (INT ONLY). Enter -1 to stop.");
            while (true) {
                System.out.print("Input the row: ");
                int amount1 = scan.nextInt();
                if (amount1 == -1) break; //Wenn der eingegbene Zahl -1 ist ==> abbrechen
                if (amount1 >= row) {//Wenn der eingegebene Zahl zu groß für die Gitter ist ==> benachrichtigen und nochmal eingeben
                    System.err.println("TOO BIG");
                    continue;
                }
                System.out.print("Input the column: ");
                int amount2 = scan.nextInt();
                if (amount2 >= column) {
                    System.err.println("TOO BIG");
                    continue;
                }
                grid[amount1][amount2] = true; //Die eingegebene Koordinaten werden in der Gitter als lebendige Zelle gespeichert
                gridPrint();
            }
        } else {
            System.err.println("WRONG INPUT");
        }
    }
    
    public static void updateGrid() { //Gitter wird aktualisert und je nach Anzahl der Nachbarnzellen geändert 
        nextGrid = new boolean[row][column];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int liveNeighbors = countLiveNeighbors(i, j);
                if (grid[i][j]) {
                    nextGrid[i][j] = liveNeighbors == 2 || liveNeighbors == 3;
                } else {
                    nextGrid[i][j] = liveNeighbors == 3;
                }
            }
        }

        boolean[][] temp = grid;
        grid = nextGrid;
        nextGrid = temp;
    }
    
    private static int countLiveNeighbors(int r, int c) { //Anzahl von Nachbarnzellen werden gezählt
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int newRow = r + i;
                int newCol = c + j;
                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < column && grid[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.print("Please input the amount of rows: ");
        row = scan.nextInt(); // Zeilenanzahl wird eingegeben
        System.out.print("Please input the amount of columns: ");
        column = scan.nextInt(); // Spaltenanzahl wird eingegeben
        grid = new boolean[row][column]; // Gitter wird ausgegeben
        
        Choice();
        
        while (true) {
            gridPrint();
            System.out.println("Running Simulation. Enter 'q' to end: ");
            String input = scan.next();
            if (input.equalsIgnoreCase("q")) {//Simulation wird so lange dauern, bis 'q' eingegeben ist
            	System.out.println("Simulation has ended");
                break;
            }
            updateGrid();
        }
        scan.close();
    }
}
