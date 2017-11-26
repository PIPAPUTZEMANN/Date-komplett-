
public class DateTestProgramm {

	public static void main(String[] args) {
		
		
		Date test=new Date();
		System.out.println(test);
		
		Date test1=new Date(11,11,2017);
		System.out.println(test1);
		
		
		
		Date validDateTest= new Date(2,2,2300);
		System.out.println(validDateTest.isValidDate(2,13,2003));
		
		
		Date setDateTest= new Date (12,13,2005);
		System.out.println(setDateTest.setDate(1,13,2012));
		
		Date testOther=new Date(test1);
		System.out.println(testOther);
		
		
		
	}
	

}
