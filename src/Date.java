
public class Date {

	private int day;
	private int month;
	private int year;
	static int aObjekte;

	Date() {

		this.day = 1;
		this.month = 1;
		this.year = 1970;

		aObjekte++;
	}

	Date(int day, int month, int year) {

		this();
		if(isValidDate(day, month, year) == true){
		this.day = day;
		this.month = month;
		this.year = year;
		}
	}

	Date(Date other) {

		this();
		if (other != null) {

			day = other.day;
			month = other.month;
			year = other.year;
		}

	}

	boolean setDate(int day, int month, int year) {

		if (isValidDate(day, month, year) == true) {

			this.day = day;
			this.month = month;
			this.year = year;

			return true;

		} else {

			return false;

		}

	}

	public boolean isValidDate(int day, int month, int year) {

		boolean validDate = true;
		int maxDay;

		if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month == 2) {

			maxDay = 29;

		} else {

			switch (month) {
			case 1:
				maxDay = 31;
				break;
			case 2:
				maxDay = 28;
				break;
			case 3:
				maxDay = 31;
				break;
			case 4:
				maxDay = 30;
				break;
			case 5:
				maxDay = 31;
				break;
			case 6:
				maxDay = 30;
				break;
			case 7:
				maxDay = 31;
				break;
			case 8:
				maxDay = 31;
				break;
			case 9:
				maxDay = 30;
				break;
			case 10:
				maxDay = 31;
				break;
			case 11:
				maxDay = 30;
				break;
			case 12:
				maxDay = 31;
				break;

			default:
				validDate = false;
				maxDay = 0;

			}
		}

		if (day > maxDay || day <= 0) {

			validDate = false;
		}

		if (year < 1583) {

			validDate = false;

		}

		return validDate;

	}

	public String toString() {

		return String.format("%02d.%02d.%04d", day, month, year);

	}

	boolean isBefore(Date otherDate) {

		boolean geber = false;

		if (otherDate.day > day && otherDate.month >= month && otherDate.year >= year) {

			geber = true;
		}

		if (otherDate.month > month && otherDate.year >= year) {

			geber = true;
		}

		if (otherDate.year > year) {

			geber = true;

		}

		return geber;
	}

	Date nextDay() {

		if (isValidDate(day + 1, month, year) == true) {

			return new Date(day + 1, month, year);

		}

		else if (isValidDate(1, month + 1, year) == true) {

			return new Date(1, month + 1, year);

		}

		else {

			return new Date(1, 1, year + 1);

		}
	}

	public Day getWeekday() {

		Day EnumDay = null;
		int w;

		if (month < 3) {

			month = month + 12;
			year = year - 1;
		}

		w = (day + 2 * month + (3 * month + 3) / 5 + year + year / 4 - year / 100 + year / 400 + 1) % 7;

		switch (w) {

		case 0:
			EnumDay = Day.Sunday;
			break;

		case 1:
			EnumDay = Day.Monday;
			break;

		case 2:
			EnumDay = Day.Tuesday;
			break;

		case 3:
			EnumDay = Day.Wednesday;
			break;

		case 4:
			EnumDay = Day.Thursday;
			break;

		case 5:
			EnumDay = Day.Friday;
			break;

		case 6:
			EnumDay = Day.Saturday;
			break;

		}
		return EnumDay;

	}

	public static int getNumberOfDateObjects() {

		return aObjekte;

	}

	public void finalize() {

		aObjekte--;

	}
	
	public boolean equals(Object other){
		
		if( other instanceof Date){
			Date neu=new Date();
			neu=(Date) other;
		if(neu.day==this.day && neu.month==this.month && neu.year==this.year){
			
			return true;
		}
			
			
		}
		return false;
		
	}

	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	

}
