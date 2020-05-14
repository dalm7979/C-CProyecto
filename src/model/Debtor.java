package model;

import java.util.ArrayList;
import java.util.Date;

public class Debtor {

	private int age;
	private DocumentType documentType;
	private String name;
	private String lastName;
	private String nameCompany;
	private int numberID;
	private String adress;
	private String phone;
	private double debtCapacity;
	private double salary;
	ArrayList<Credit> credits = new ArrayList<Credit>();
	private int ref = 0;
	
	public Debtor(int a, DocumentType dcType, String n,String ln, String nCom, int nID, String ads, String p,double s, double v, CreditType cdType, Term t, int r) {
		age = a;
		documentType=dcType;
		name = n;
		lastName = ln;
		nameCompany = nCom;
		numberID = nID;
		adress = ads;
		phone = p;
		salary = s;
		ref=r;
		newCredit(t, cdType, v);
	}

	public int getAge() {
		return age;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public int getNumberID() {
		return numberID;
	}

	public String getAdress() {
		return adress;
	}

	public String getPhone() {
		return phone;
	}
	
	public double getDebtCapacity() {
		return debtCapacity;
	}

	public void setDebtCapacity() {
		double assets= salary;
		double liabilities = 100;
	}
	
	public ArrayList<Credit> showCredits(){
		return credits;
	}	

	public void newCredit(Term t,CreditType cdType, double v) {
		ref+=10000;
		Credit c= new Credit(t,cdType,v,ref);
		credits.add(c);		
	}
	
	public void payment(double v, int id) {
		//credits
		//for para buscar la factura  abonar
	}
	
	public Boolean status() {
		return false;
		
	}
	
	public int getRef() {
		return ref;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	
	
}
