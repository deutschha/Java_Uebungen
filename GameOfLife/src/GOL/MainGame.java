package GOL;

import java.util.Timer;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] field = new int[8][8];
		int round = 0;
		setup(field);
		do{
			round += 1;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {};
			GameGrid(field);		
			check(field);
		}while (round < 10);		
	}
	
	public static void setup(int field[][]) {
		int row= 0;
		int col= 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many coins to set [1-64]: ");
		int anz = scan.nextInt();
		for (int i = 0; i < anz; i++) {
			Scanner r = new Scanner(System.in);
			System.out.println("choose row: ");
			row = r.nextInt();
			Scanner c = new Scanner(System.in);
			System.out.println("choose column: ");
			col = c.nextInt();
			field[row][col] = 1;
		}
	}
	public static void GameGrid(int field[][]) {
		int r = 0;
		int c = 0;
		int turn = 0;
		
		for (int row = 0; row < field.length; row++) {
			System.out.println(""); 
			for ( int col = 0; col < field.length; col++) {
				r = row;
				c = col;
				System.out.print(field[row][col] +" ");
				System.out.print("|");
			}
		}
		System.out.println("");	
		turn += 1;
	}
	public static void check(int field[][]) {
		for (int ro = 0; ro < field.length ;ro ++)  {
			for(int co : field[ro]) {
				System.out.print(co + " das ist der eintrag");
			}
			
		}
	}
		
	/*public static void check(int field[][], int r, int c) {
		int checksum =  r*10 + c;
		int sum = 0;
		//hier fehlt noch die Schleife die das Grid durchläuft
		//System.out.println("die checksum ist: " + checksum);
		//Corner left uo
	if (r == 1 || c == 1) {
	if (checksum == 0) {
			sum += field[r +1][c];
			sum += field[r +1][c +1];	// von + auf minus
			sum += field[r][c +1];		// von + auf minus
		}
		// corner right up
		else if (checksum == 7) {
			sum += field[r ][c - 1];
			sum += field[r +1][c -1];
			sum += field[r+1][c];		
		}
		// corner left down
		else if (checksum == 70) {
			sum += field[r -1][c];
			sum += field[r -1][c +1];
			sum += field[r][c +1];		
		}
		// corner right down
		else if (checksum == 77) {
			sum += field[r -1][c];
			sum += field[r -1][c -1];
			sum += field[r][c -1];		
		}
		// row top
		else if (checksum > 0 && checksum < 7) {
			System.out.println(checksum);
			sum += field[r +1][c - 1];
			sum += field[r][c -1];
			sum += field[r +1][c];
			sum += field[r +1][c +1];
			sum += field[r][c +1];
		}
		// row left
		else if (checksum == 10 || checksum == 20 || checksum == 30 || checksum == 40 || checksum == 50 || checksum==60) {
			sum +=field[r-1][c];
			sum +=field[r -1][c+1];
			sum +=field[r][c+ 1];
			sum +=field[r+1][c +1];
			sum +=field[r +1][c];	
		}
		//row right
		else if (checksum == 17 || checksum == 27 || checksum == 37 || checksum == 47 || checksum == 57 || checksum==67) {
			sum +=field[r-1][c];
			sum +=field[r -1][c-1];
			sum +=field[r][c- 1];
			sum +=field[r+1][c -1];
			sum +=field[r +1][c];
		}
		// row bottom
		else if (checksum > 70 && checksum < 77) {
			sum += field[r -1][c - 1];
			sum += field[r][c -1];
			sum += field[r -1][c];
			sum += field[r -1][c +1];
			sum += field[r][c +1];
		}
		else {
			sum += field[r-1][c];
			sum += field[r-1][c + 1];
			sum += field[r][c + 1];
			sum += field[r + 1][c + 1];
			sum += field[r + 1][c];
			sum += field[r-1][c - 1];
			sum += field[r][c - 1];	
		}
		if ( sum == 2 && field[r][c] == 1 || sum == 3 && field[r][c] == 1) {
			field[r][c] = 1;
		}
		else if ( sum == 3 && field[r][c] == 0) {
			field[r][c] = 1;
		}
		else {
			field[r][c] = 0;
		}
		//GameGrid(field);
	}
	} */
}
