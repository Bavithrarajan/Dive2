package bavithra.model;

import java.util.logging.Logger;

import bavithra.model.Book;

public class Book {
	private static final Logger LOGGER = Logger.getLogger(Book.class.getName() );
	private	int isbn;
private	String author;
private	String content;
private	Float price;
private	String title;
private	String publishdate;
private	String Status;
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", author=" + author + ", content=" + content + ", price=" + price + ", title="
			+ title + ", publishdate=" + publishdate + ", Status=" + Status + "]";
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Float getPrice() {
	return price;
}
public void setPrice(Float price) {
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPublishdate() {
	return publishdate;
}
public void setPublishdate(String publishdate) {
	this.publishdate = publishdate;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
}
