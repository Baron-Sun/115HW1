
public class BolunSun {
	String getFullName() {
		return "Bolun Sun";
	}
	
	String getFirstName(){
		return "Bolun";
	}
	
	String getLastName() {
		return "Sun";
	}
	
	String getUCInetID() {
		return "boluns";
	}
	
	int getStudentNumber() {
		return 52332355;
	}
	
	String getRotatedFullName(int shift) {
		String fullname = "Bolun Sun";
		if(shift>0) {
			String firstPart = fullname.substring(shift,fullname.length());
			String lastPart = fullname.substring(0,shift);
			return firstPart+""+lastPart;}
		else {
			shift = -1*shift;
			String firstPart = fullname.substring(fullname.length()-shift,fullname.length());
			String lastPart = fullname.substring(0,fullname.length()-shift);
			return firstPart+""+lastPart;
		}
		
	}

}

