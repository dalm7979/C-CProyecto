package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Credit {
	private String initialDate;
	private Term term;
	private CreditType creditType;
	private double value;
	private int id;
	
	
	public Credit(Term t, CreditType cdType, double v, int ref) {
		initialDate = getInitialDate();
		term=t;
		creditType	= cdType;
		value = v;
		id = (int) setiId(ref);
	}
	
	public String getInitialDate() {
			Date d= new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
			return dateFormat.format(d);			
	}



	public Term getTerm() {
		return term;
	}


	public CreditType getCreditType() {
		return creditType;
	}

	public double getValue() {
		return value;
	}	
	

	public void setValue(double v) {
		this.value = value - v;
	}

	public int getId() {
		return id;
	}	

	public double setiId(int min) {
		int max = min + 1000;
		double x = (int)(Math.random()*((max-min)+1))+min;
	
	    return x;
	    
	}
	
}
