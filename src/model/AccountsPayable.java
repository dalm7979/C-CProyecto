package model;

import java.util.ArrayList;

public class AccountsPayable {
	ArrayList<Debtor> debtors;
	private int ref = 0;
	
	public AccountsPayable() {
		debtors = new ArrayList<Debtor>();

	}

	public void addDebtor(int a, DocumentType dcType, String n,String ln, String nCom, int nID, String ads, String p,double s, double v,CreditType cdType,Term t) {
		Debtor d= new Debtor(a,dcType,n,ln,nCom,nID,ads,p,s,v,cdType,t,ref);
		debtors.add(d);
	}	
	
	public Debtor searchByID(int id) {
		Debtor debtorF=null;
		
		for(Debtor d:debtors) {
			int dID = d.getNumberID();
			if(dID == id) {
				debtorF = d;
			}
		}
		return debtorF;
	}
	
	public Debtor searchByBillID(int id) {
		Debtor debtorF=null;
		
		for(Debtor d:debtors) {
			ArrayList<Credit> credits = d.showCredits();
			for(Credit c: credits) {
				int cID = c.getId();
				if(id == cID) {
					debtorF = d;
				}
			}
		}
		
		return debtorF;
	}
	
	
	public ArrayList<Debtor> categorizeDebtors(int i){
		return null;
	}

	public int setRef(int i) {
		return ref = i;
	}
	
	

}
