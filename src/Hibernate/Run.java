package Hibernate;

import java.util.*;

public class Run {
	
	public static void main(String[] args) {
		
		TestDAO test = TestDAO.getInstance();
		
		List<Book> book = test.getBooks();
		for (Book i : book) {
			System.out.println(i);
		}
		
		System.out.println(test.getBook(4));

	}
}
