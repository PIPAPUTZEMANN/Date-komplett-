import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;

public class DateFIFO {
	private int size = 0;
	Date[] elements;

	
	private int anzahlDerObjekte;

	DateFIFO(int kapa) {

		this.size = kapa;
		this.elements = new Date[size];
		this.anzahlDerObjekte = 0;
		
	}

	public void push(Date date) {

		if (anzahlDerObjekte < size) {

			elements[anzahlDerObjekte] = date;
			anzahlDerObjekte++;

		} else {

			Date[] ZwischenSpeicher;
			ZwischenSpeicher = new Date[size + 10];
			System.arraycopy(elements, 0, ZwischenSpeicher, 0, size);
			elements = ZwischenSpeicher;
			elements[anzahlDerObjekte] = date;
		}

	}

	public Date pop() {

		Date ausgabe;

		ausgabe = elements[0];

		System.arraycopy(elements, 1, elements, 0, elements.length - 1);

		return ausgabe;

	}

	public int find(Date date) {

		int rückgabe = -1;

		for (int i = 0; i <= anzahlDerObjekte; i++) {
			if ((date.getDay() == elements[i].getDay()) && (date.getMonth() == elements[i].getMonth())
					&& (date.getYear() == elements[i].getYear())) {

				rückgabe = i;
				break;
			}

		}
		return rückgabe;
	}

	public Date peek() {
		Date rück;
		if (elements[0] instanceof Date) {

			rück = elements[0];

		} else {

			rück = null;
		}
		return rück;

	}

	public boolean isEmpty() {

		boolean leer = true;

		for (int i = 0; i < anzahlDerObjekte; i++) {
			if (elements[i] != null) {

				leer = false;
			}

		}
		return leer;

	}
	
	public DateFIFO deepCopy(){
		
	DateFIFO rück=new DateFIFO(elements.length);
	for(int i=0;i<elements.length;i++){
	
			
			rück.push(new Date(elements[i]));
		
	}
	return rück;
	}


	}

