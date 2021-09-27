package matrix;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class minMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		int i, j;
		int minCol = 0;
		Random ran = new Random();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = ran.nextInt(20);
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		int min = a[0][0];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minCol = j;
				}
			}
		}
		int max = a[0][minCol];
		for (i = 0; i < 3; i++) {
			if (a[i][minCol] > max)
				max = a[i][minCol];
		}

		System.out.println("minimum = "+min);
		System.out.println("maximum = "+max);
	}
}
