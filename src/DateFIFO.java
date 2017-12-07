
public class DateFIFO {
	private int size=0;
	Date[] elements;
	private int anzahlDerObjekte;
	
	
	
	DateFIFO(int kapa){
		
		this.size=kapa;
		this.elements=new Date[size];
		this.anzahlDerObjekte=0;
		
		
		
		
	}
	
	public void push(Date date){
		
		if(anzahlDerObjekte<size){
			
			elements[anzahlDerObjekte]=date;
			anzahlDerObjekte++;
			
		}else{
			
			Date[] ZwischenSpeicher;
			ZwischenSpeicher=new Date[size+10];
			System.arraycopy(elements, 0, ZwischenSpeicher, 0, size);
			elements=ZwischenSpeicher;
			elements[anzahlDerObjekte]=date;
		}
		
		
		
		
	}

}
