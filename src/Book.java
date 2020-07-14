import java.util.Date;

public class Book implements Comparable<Book> {
	private String title;
	private Date publishDate;
	private String comment;

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		} else if(o == null) {
			return false;
		} else if(o instanceof Book) {
			Book book = (Book) o;
			if(!this.publishDate.equals(book.publishDate)) {
				return false;
			} else if(!this.title.equals(book.title)) {
				return false;
			}else if(this.publishDate == book.publishDate && this.title == book.title) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		int result = 1;
		result = result * 31 + publishDate.hashCode();
		result = result * 31 + title.hashCode();
		return result;
	}

	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate);
	}

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.comment = this.comment;
		result.publishDate = (Date) this.publishDate.clone();
		return result;
	}
}
