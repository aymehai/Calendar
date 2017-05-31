import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the month");
		int monthNumber = keyboard.nextInt();
		System.out.println("Enter the Year");
		int yearNumber = keyboard.nextInt();
		String monthName = null;
		switch (monthNumber) {
		case 1:
			monthName = "January";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		case 2:
			monthName = "February";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28");
			break;
		case 3:
			monthName = "March";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		case 4:
			monthName = "April";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30");
			break;
		case 5:
			monthName = "May";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		case 6:
			monthName = "June";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30");
			break;
		case 7:
			monthName = "July";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		case 8:
			monthName = "August";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		case 9:
			monthName = "September";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30");
			break;
		case 10:
			monthName = "October";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		case 11:
			monthName = "November";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30");
			break;
		case 12:
			monthName = "December";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" \t \t \t 1");
			System.out.println(" 2   3   4   5   6   7   8");
			System.out.println(" 9   10  11  12  13  14  15");
			System.out.println(" 16  17  18  19  20  21  22");
			System.out.println(" 23  24  25  26  27  28  29");
			System.out.println(" 30  31");
			break;
		default:
			monthName = "Unknown";
			break;
		}
	}
}
