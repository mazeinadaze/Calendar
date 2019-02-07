package Calendar;

import java.util.Scanner;

public class maxDayPerMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 2 == 1) {
			System.out.println("31");
		} else if (num == 2) {
			System.out.println("28");
		} else {
			System.out.println("30");
		}
		scanner.close();
	}
}
