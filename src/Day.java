
public enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	
	
	
		public String getGermanDay(){
			
			
			
			String day = null;
			
			
			if(this==Sunday){
				
				day="Sonntag";
			}
			
			if(this==Monday){
				
				day="Montag";
			}
			
			if(this==Tuesday){
				
				day="Dienstag";
			}
			
			if(this==Wednesday){
				
				day="Mittwoch";
			}
			
			if(this==Thursday){
				
				day="Donnerstag";
			}
			
			if(this==Friday){
				
				day="Freitag";
			}
			
			if(this==Saturday){
				
				day="Samstag";
			}
			
			return day;
			
			
			
		}
		
		
		
	

}
