package jump2java;
import java.util.Scanner;

class Book{
	String title;
	String author;
	int year;
	boolean borrow;
	
	Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
		borrow = false;
		
	}
	
	void show() {
		System.out.println("제목 : "+ title);
	}
	
	Boolean borrowOf() {
		if (borrow) {
			return "대출 중";
		} else {
			return "대충 가능";
		}
			
	}
}

public class S0609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목 : ");
		String title = sc.next();
		System.out.println("저자 : ");
		String author = sc.next();
		System.out.println("발행연도 : ");
		int year = sc.nextInt();
		
		Book b1 = new Book(title,author,year);
		b1.show();
		
		System.out.println("대출여부 : " + b1.borrowOf());
		
		
	}
}
