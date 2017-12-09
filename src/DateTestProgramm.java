import java.util.Arrays;

public class DateTestProgramm {

	public static void main(String[] args) {
		
		
		Date test = new Date(2,2,2222);
		System.out.println(test);

		Date test1 = new Date(11, 11, 2017);
		System.out.println(test1);

		Date validDateTest = new Date();
		System.out.println(validDateTest.isValidDate(0, 1, 1970));

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
		
		
		
		System.out.println(danach.equals(danach));
		
		DateFIFO te=new DateFIFO(2);
		te.push(davor);
		te.push(danach);
		te.push(test);
		
		
		System.out.println(Arrays.toString(te.elements));
		System.out.println(Arrays.toString(te.SpeicherArray));
		Date rek=te.pop();
		System.out.println(rek);
		System.out.print("\n");
		System.out.println(te.elements[0]);
		System.out.println(te.elements[1]);
		System.out.println(te.elements[2]);
		System.out.println(te.elements[3]);
		
		
	}
	

}
