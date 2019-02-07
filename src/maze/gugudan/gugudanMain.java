package maze.gugudan;

import java.util.Scanner;

public class gugudanMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		int[] result = gugudan.calculate(num);
		gugudan.print(result);
	}
}