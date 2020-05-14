package ui;

import java.util.ArrayList;

import model.AccountsPayable;
import model.Credit;
import model.CreditType;
import model.Debtor;
import model.DocumentType;
import model.Term;

public class Main2 {

	public static void main(String[] args) {
		AccountsPayable book = new AccountsPayable();
		
		//System.out.println("Arraylist= " + book.arraySize());
		System.out.println("se esta añadiendo un nuevo deudor");
		book.addDebtor(10,DocumentType.DRIVER_LICENSE,"david","lopez", "algosS.A",123123,"Carrera novena", "3172538383", 1212333, 4000000, CreditType.CREDIT, Term.PERIODS_1);
		Debtor dp1 = book.searchByID(123123);
		ArrayList<Credit> credits = dp1.showCredits();
		Credit c1 = credits.get(0);
		System.out.println("id factura: " + c1.getId());
		
		Debtor pf1 = book.searchByBillID(c1.getId());

		System.out.println("busca");
		book.addDebtor(12,DocumentType.DRIVER_LICENSE,"alejandro","munoz", "cpanic S.A",1115554,"Carrera octava", "3171138383", 12000000, 3000000, CreditType.CREDIT, Term.PERIODS_2);
		//System.out.println("Arraylist= " + book.arraySize());	

		
				
		System.out.println("buscar a un usuario por id de Factura");
		int id = 123123;
		book.searchByID(id);
		Debtor debtor1 = book.searchByID(id);
		System.out.println("nombre= "+debtor1.getName());
		ArrayList<Credit> creditlist = debtor1.showCredits();
		//Credit c1 = creditlist.get(0);
		System.out.println("fecha inical del credito"+c1.getInitialDate());
		
		
		 int id22 = 0;
		System.out.println("esss" + id22);
		
		ArrayList<Debtor> debtors = book.showDebtors();
		
		for(int i=0; i<debtors.size(); i++) {
			String index = "Deudores: ";
			Debtor d = debtors.get(i);
			String name = d.getName() + " " + d.getLastName();
			int nCredits = debtors.size();
			

			index = index + " Nombre: " + name + " | N° creditos: " + nCredits;
			
		    //listModel.add(i, index);
		}
		
	}

}
