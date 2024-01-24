package o_Chapter14.model;

public class Book {
	private String title;		// 제목
	private String author;		// 저자
	private String publisher;	// 출판사
	
	// 생성자
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	// getter 메서드
	public String getTitle() {
		return this.title;
	}
	public String getauthor() {
		return this.author;
	}
	public String getpublisher() {
		return this.publisher;
	}
	
	@Override
	public String toString() {
		return "Title :" + title + ", Author :" + author + ", publisher :" + publisher;
	}
	
	
	
	
	
	
	
}
