package maze.gugudan;

import java.util.Scanner;

public class gugudanPractice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			scanner.close();
			for (int i = 1; i < num; i++) {
				for (int j = 0; j < num; j++) {
					System.out.println((i + 1) * (j + 1));
				}
			}
	}
}
