package library;

public class Book extends Script {

	// Attributi
	private String author;
	private String literaryGenre;

	// Costruttore
	public Book(long ISBN, String title, int publicationYear, int numberOfPages, String author, String literaryGenre) {
		super(ISBN, title, publicationYear, numberOfPages);
		this.setAuthor(author);
		this.setLiteraryGenre(literaryGenre);
	}

	// Getters & Setters => controllare a fine progetto se serve cancellare qualche Getters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLiteraryGenre() {
		return literaryGenre;
	}

	public void setLiteraryGenre(String literaryGenre) {
		this.literaryGenre = literaryGenre;
	}
}
