package maze.gugudan;

import java.util.Scanner;

public class gugudanPractice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		scanner.close();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int i = 1; i < first; i++) {
			for (int j = 0; j < second; j++) {
				System.out.println((i + 1) * (j + 1));
			}
		}
	}
}
