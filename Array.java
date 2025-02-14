public class Array
{

	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
	public int[][] getRowMajorSquare(int x) {
		int count = 1;
		int[][] a = new int[x][x];  // Initialize a square 2D array
		for (int row = 0; row < x; row++) {
			for (int col = 0; col < x; col++) {
				a[row][col] = count;  // Assign the count to each element
				count++;
			}
		}
		return a;  // Return the populated array
	}
	
	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
	public int[][] getColumnMajorSquare(int x) {
		int count = 1;
		int[][] a = new int[x][x];  // Initialize a square 2D array
		for (int col = 0; col < x; col++) {  // Iterate over columns first
			for (int row = 0; row < x; row++) {  // Then iterate over rows
				a[row][col] = count;  // Assign the count to each element
				count++;
			}
		}
		return a;  // Return the populated array
	}
	

	// Array should be of format
	// 1  2  3  4
	// 5  6  7  8
	// 9 10 11 12
	public int[][] getRowMajorRectangle(int row, int column) {
		int count = 1;
		int[][] a = new int[row][column];  // Correct array initialization
		for (int r = 0; r < row; r++) {    // Iterate over rows
			for (int c = 0; c < column; c++) {  // Then iterate over columns
				a[r][c] = count;
				count++;
			}
		}
		return a;  // Return the populated array
	}
	

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
	public int[][] getColumnMajorRectangle(int column, int row) {
		int count = 1;
		int[][] a = new int[row][column];  // Fix: column-major means rows should come first
		for (int c = 0; c < column; c++) {   // Iterate over columns first
			for (int r = 0; r < row; r++) { // Then iterate over rows
				a[r][c] = count;
				count++;
			}
		}
		return a;
	}
	

	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
	public void printDouble(int[][] a){
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				// Print each element with a space after it, ensuring at least two spaces for single digits
				System.out.printf("%2d ", a[r][c]);
			}
			System.out.println();  // Move to the next line after each row
		}
	}
	
		 
	

	

	}
