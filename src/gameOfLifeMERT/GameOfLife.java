package gameOfLifeMERT;

import java.util.Random;
import java.util.Scanner;

public class GameOfLife {

	private static int row;
	private static int column;
	private static boolean[][] grid;
	private static boolean[][] nextGrid;
	static Scanner scan = new Scanner(System.in);
	
	static void gridPrint() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(grid[i][j] ? "O " : ". ");
	        }
	        System.out.println();
		}
	    System.out.println();
	}
	
	static void random() {
		Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                grid[i][j] = random.nextBoolean();
            }
        }
	}
	
	static void Choice() {
		System.out.println("Would you like it randomized?(y/n): ");
		String choice = scan.next();
		if(choice.equalsIgnoreCase("y")) {
			random();
	        gridPrint();
		}
		else if(choice.equalsIgnoreCase("n")){
			System.out.println("Please input where you want the cells(INT ONLY)");
			while(true) {
				System.out.println("Input the row: ");
				int amount1 = scan.nextInt();
				if(amount1 > row) {
					System.err.println("TOO BIG");
				} else {
					System.out.println("Input the column: ");
					int amount2 = scan.nextInt();
					if(amount2 > column) {
						System.err.println("TOO BIG");
					} else {
						grid[amount1][amount2] = true;
						gridPrint();
						System.out.println("To stop editing, press 'q': ");
						String end = scan.next();
						if(end.equalsIgnoreCase("q")) {
							break;
						}
					}
				}
				
			}
		}else {
			System.err.println("WRONG INPUT");
		}
	}
	
	public static void updateGrid() {
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
    
    private static int countLiveNeighbors(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int newRow = row + i;
                int newCol = col + j;
                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < column && grid[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println("Please input the amount of rows: ");
		row = scan.nextInt();
		System.out.println("Please input the amount of columns: ");
		column = scan.nextInt();
		grid = new boolean[row][column];
		Choice();
		while (true) {
			gridPrint();
			nextGrid = new boolean[row][column];
            System.out.println("Running Simulation. Enter 'q' to end: ");
            String input = scan.nextLine();
            if (input.equals("q")) {
                break;
            }
            updateGrid();
        }
        scan.close();
	}
}
