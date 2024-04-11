package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {

	private String name;
	private Calendar birthday;
	
	public Persona() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	
	public int calculateAge() {
		Calendar currentlyDate = Calendar.getInstance();
		return currentlyDate.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
	}
	
	 public String getZodiacSign() {
		 	int day, month;
		 	day = this.birthday.get(Calendar.DAY_OF_MONTH);
		 	month = this.birthday.get(Calendar.MONTH) + 1;
		 
	        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
	            return "Aries";
	        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
	            return "Taurus";
	        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
	            return "Gemini";
	        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
	            return "Cancer";
	        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
	            return "Leo";
	        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
	            return "Virgo";
	        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
	            return "Libra";
	        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
	            return "Scorpio";
	        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
	            return "Sagittarius";
	        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
	            return "Capricorn";
	        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
	            return "Aquarius";
	        } else {
	            return "Pisces";
	        }
	    }
	
	 public String season() {
		 switch (birthday.get(Calendar.MONTH)+1) {
		case 12,1,2:
			return "Verano";
		case 3,4,5:
			return "Otoño";
		case 6,7,8:
			return "Invierno";
		case 9,10,11:
			return "Primavera";
		default:
			return "";
		}
	 }
	 
	
}
