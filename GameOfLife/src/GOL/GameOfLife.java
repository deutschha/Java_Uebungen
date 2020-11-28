package GOL;

import java.util.concurrent.TimeUnit;

public class GameOfLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] helper = new int[5+2][5 +2];
		int[][] arr = new int[5][5];
		int count = 5;
		fill(arr);
		cycle(count,arr);
		System.out.println("Ende");
	}
	public static void fill(int arr[][]) {
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[2][3] = 1;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println("|");
		}
		System.out.println("----------");
	}
		
	public static void des( int arr[][]) {
		//fill(arr);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				check(arr,row,col);
				System.out.print(arr[row][col] + " ");
			}
			System.out.println("|");
		}
		System.out.println("----------");
	}
	public static void trans(int helper[][]) {
		for (int row = 1; row< helper.length - 1; row++ ) {
			for(int col = 0; col < helper[row-1].length; col++) {
			}
		}
	}
	
	public static void cycle(int c, int arr[][]) {
		long millis = 3000;
		for (int i= 0; i< c; i++) {
			des(arr);
			try {
				Thread.sleep(millis);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
				
			}
		}	
	}
	public static void start(int row, int col,int arr[][] ) {
			arr[2][1]=1;
			arr[2][2]=1;
			arr[2][3]=1;
	}
	
	public static void rules(int arr[][], int row, int col,int sum) {
		if (sum == 3 && arr[row][col]== 0) {
			arr[row][col]= 1;
		}
		else if (sum == 2  && arr[row][col]== 1 || sum == 3 && arr[row][col]== 1 ){
			arr[row][col] = 1 ;
		}
	}
	
	public static void check(int arr[][], int row, int col) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;	
		if (col > 0 && row > 0 && col < 4 && row < 4) {
			for (int i = 1; i <= 3; i++) {
				if (arr[row - 1][i] == 1) {
					sum +=1;
				}
				if (arr[row + 1][i] == 1) {
					sum+=1;
				}
			}
			if (arr[row][col-1] == 1) {
				sum+=1;
			}
			if (arr[row][col+1]==1) {
				sum+=1;
			}
		}
		rules(arr,row,col,sum);
	}
}
