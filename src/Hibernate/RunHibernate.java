package Hibernate;

import java.util.*;

public class RunHibernate {
	
	public static void displayHibernate() {
		
		TestDAO test = TestDAO.getInstance();
		
		List<Book> book = test.getBooks();
		for (Book i : book) {
			System.out.println(i);
		}
		
		System.out.println(test.getBook(4));

	}
}
