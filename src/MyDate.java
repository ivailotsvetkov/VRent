import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7444029914352265014L;
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public MyDate(int day, int month, int year) {
		set(day, month, year);
	}

	public MyDate() {
		Calendar now = GregorianCalendar.getInstance();
		day = now.get(Calendar.DAY_OF_MONTH);
		month = now.get(Calendar.MONTH) + 1;
		year = now.get(Calendar.YEAR);
	}

	public static MyDate now() {
		return new MyDate();
	}

	public void set(int day, int month, int year) {
		if (year < 0)
			year = year * -1;
		if (month < 1)
			month = 1;
		if (month > 12)
			month = 12;
		if (day < 1)
			day = 1;
		if (day > numberOfDaysInMonth(month))
			day = numberOfDaysInMonth(month);

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void set(int day, String month, int year) {
		set(day, convertToMonthNumber(month), year);
	}

	public boolean isLeapYear() {
		return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
	}

	public int numberOfDaysInMonth(int month) {
		switch (month) {
		default:
			return -1;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear() ? 29 : 28;
		}
	}

	public boolean isBeforeDate(MyDate other) {
		if (year < other.getYear())
			return true;
		else if (year == other.getYear())
			if (month < other.getMonth())
				return true;
			else if (month == other.getMonth())
				if (day < other.getDay())
					return true;

		return false;
	}

	public String getMonthName() {
		switch (month) {
		default:
			return "invalid month";
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
	}

	public int yearsBetween(MyDate other) {
		// return (int) (this.daysBetween(other) / 365.25);

		if (!isBeforeDate(other)) {
			return other.yearsBetween(this);
		}

		int daysBetween = day - other.getDay();
		int monthsBetween = month - other.getMonth();
		int modifer = 0;

		if (monthsBetween > 0)
			modifer++;
		else if (monthsBetween == 0)
			if (daysBetween > 0)
				modifer++;

		return other.getYear() - year - modifer;
	}

	public void stepForwardOneDay() {
		day++;
		if (day > numberOfDaysInMonth(month)) {
			day = 1;
			month++;
		}
		if (month > 12) {
			month = 1;
			year++;
		}
	}

	public void stepForward(int days) {
		for (int i = 0; i < days; i++)
			stepForwardOneDay();
	}

	public int daysBetween(MyDate other) {
		MyDate counterDate, controlDate;
		if (isBeforeDate(other)) {
			counterDate = this.copy();
			controlDate = other.copy();
		} else {
			counterDate = other.copy();
			controlDate = this.copy();
		}

		int counter = 0;
		while (!counterDate.equals(controlDate)) {
			counterDate.stepForwardOneDay();
			counter++;
		}

		return counter;
	}

	public String toString() {
		String dayString = Integer.toString(day);
		String monthString = Integer.toString(month);
		String yearString = Integer.toString(year);
		String returnString;

		if (day < 10)
			dayString = "0" + day;
		if (month < 10)
			monthString = "0" + month;
		if (year < 1000)
			if (year < 100)
				if (year < 10)
					yearString = "000" + year;
				else
					yearString = "00" + year;
			else
				yearString = "0" + year;

		returnString = dayString + "/" + monthString + "/" + yearString;

		return returnString;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof MyDate))
			return false;
		else {
			MyDate other = (MyDate) obj;
			return other.getDay() == day && other.getMonth() == month
					&& other.getYear() == year;
		}
	}

	public MyDate copy() {
		return new MyDate(day, month, year);
	}

	public static int convertToMonthNumber(String month) {
		switch (month.toLowerCase()) {
		default:
			return -1;
		case "january":
			return 1;
		case "february":
			return 2;
		case "march":
			return 3;
		case "april":
			return 4;
		case "may":
			return 5;
		case "june":
			return 6;
		case "july":
			return 7;
		case "august":
			return 8;
		case "september":
			return 9;
		case "october":
			return 10;
		case "november":
			return 11;
		case "december":
			return 12;
		}
	}
}