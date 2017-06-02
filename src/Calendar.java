import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the month number");
		int monthNumber = keyboard.nextInt();
		System.out.println("Enter the Year");
		int yearNumber = keyboard.nextInt();
		String monthName = null;
		switch (monthNumber) {
		case 1:
			monthName = "January";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" 1   2   3   4   5   6   7");
			System.out.println(" 8   9   10  11  12  13  14");
			System.out.println(" 15  16  17  18  19  20  21");
			System.out.println(" 22  23  24  25  26  27  28");
			System.out.println(" 29  30  31");
			break;
		case 2:
			monthName = "February";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("             1   2   3   4");
			System.out.println(" 5   6   7   8   9   10  11");
			System.out.println(" 12  13  14  15  16  17  18");
			System.out.println(" 19  20  21  22  23  24  25");
			System.out.println(" 26  27  28");
			break;
		case 3:
			monthName = "March";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("             1   2   3   4");
			System.out.println(" 5   6   7   8   9   10  11");
			System.out.println(" 12  13  14  15  16  17  18");
			System.out.println(" 19  20  21  22  23  24  25");
			System.out.println(" 26  27  28  29  30  31");
			break;
		case 4:
			monthName = "April";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("                         1");
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
			System.out.println("     1   2   3   4   5   6");
			System.out.println(" 7   8   9   10  11  12  13");
			System.out.println(" 14  15  16  17  18  19  20");
			System.out.println(" 21  22  23  24  25  26  27");
			System.out.println(" 28  29  30  31");
			break;
		case 6:
			monthName = "June";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("                 1   2   3");
			System.out.println(" 4   5   6   7   8   9   10");
			System.out.println(" 11  12  13  14  15  16  17");
			System.out.println(" 18  19  20  21  22  23  24");
			System.out.println(" 25  26  27  28  29  30");
			break;
		case 7:
			monthName = "July";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("                         1");
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
			System.out.println("         1   2   3   4   5");
			System.out.println(" 6   7   8   9   10  11  12");
			System.out.println(" 13  14  15  16  17  18  19");
			System.out.println(" 20  21  22  23  24  25  26");
			System.out.println(" 27  28  29  30  31");
			break;
		case 9:
			monthName = "September";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("                     1   2");
			System.out.println(" 3   4   5   6   7   8   9");
			System.out.println(" 10  11  12  13  14  15  16");
			System.out.println(" 17  18  19  20  21  22  23");
			System.out.println(" 24  25  26  27  28  29  30");
			break;
		case 10:
			monthName = "October";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println(" 1   2   3   4   5   6   7");
			System.out.println(" 8   9   10  11  12  13  14");
			System.out.println(" 15  16  17  18  19  20  21");
			System.out.println(" 22  23  24  25  26  27  28");
			System.out.println(" 29  30  31");
			break;
		case 11:
			monthName = "November";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("             1   2   3   4");
			System.out.println(" 5   6   7   8   9   10  11");
			System.out.println(" 12  13  14  15  16  17  18");
			System.out.println(" 19  20  21  22  23  24  25");
			System.out.println(" 26  27  28  29  30");
			break;
		case 12:
			monthName = "December";
			System.out.println("       " + monthName + " " + yearNumber);
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("                     1   2");
			System.out.println(" 3   4   5   6   7   8   9");
			System.out.println(" 10  11  12  13  14  15  16");
			System.out.println(" 17  18  19  20  21  22  23");
			System.out.println(" 24  25  26  27  28  29  30");
			System.out.println(" 31");
			break;
		default:
			monthName = "Unknown";
			break;
		}
	}
}
