package gameOfLifeBEISPIEL;
import java.util.Random;
import java.util.Scanner;

public class GameOfLife {
    private int rows;
    private int cols;
    private boolean[][] grid;
    private boolean[][] nextGrid;
    
    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new boolean[rows][cols];
        this.nextGrid = new boolean[rows][cols];
    }
    
    public void initializeRandom() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = random.nextBoolean();
            }
        }
    }
    
    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] ? "O " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void updateGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
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
    
    private int countLiveNeighbors(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int newRow = row + i;
                int newCol = col + j;
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public void runSimulation() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printGrid();
            System.out.println("Drücke Enter für die nächste Generation oder 'q' zum Beenden.");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            updateGrid();
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib die Anzahl der Zeilen ein: ");
        int rows = scanner.nextInt();
        System.out.print("Gib die Anzahl der Spalten ein: ");
        int cols = scanner.nextInt();
        
        GameOfLife game = new GameOfLife(rows, cols);
        game.initializeRandom();
        game.runSimulation();
        
        scanner.close();
    }
}
