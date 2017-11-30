
public class DateTestProgramm {

	public static void main(String[] args) {
		
		
		Date test = new Date();
		System.out.println(test);

		Date test1 = new Date(11, 11, 2017);
		System.out.println(test1);

		Date validDateTest = new Date();
		System.out.println(validDateTest.isValidDate(2, 12, 2003));

		Date setDateTest = new Date(12, 13, 2005);
		System.out.println(setDateTest.setDate(1, 13, 2012));

		Date testOther = new Date(test1);
		System.out.println(testOther);

		Date davor = new Date(22, 11, 2000);
		Date danach = new Date(23, 11, 2000);

		System.out.println(davor.isBefore(danach));

		System.out.println(davor.nextDay());
		System.out.println(davor);

		Date DeutscherName = new Date(25, 8, 1994);
		System.out.println(DeutscherName.getWeekday());
		System.out.println(DeutscherName.getWeekday().getGermanDay());
		
		
		
		
		
		
		System.out.println(testOther.getNumberOfDateObjects());
		
	
		
		
	}
	

}
