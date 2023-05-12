package library;

public abstract class Script {

	// Attributi
	private long ISBN;
	private String title;
	private int publicationYear;
	private int numberOfPages;

	// Costruttore
	public Script(long ISBN, String title, int publicationYear, int numberOfPages) {
		this.setISBN(ISBN);
		this.setTitle(title);
		this.setPublicationYear(publicationYear);
		this.setNumberOfPages(numberOfPages);
	}

	// Getters & Setters => controllare a fine progetto se serve cancellare qualche Getters
	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void addScript(Script nameScript) {
	};

	@Override
	public String toString() {
		return "\nTitolo: " + getTitle() + "\nYear: " + getPublicationYear() + "\nPagine: " + getNumberOfPages()
				+ "\nISBN: " + getISBN() + "\n";
	}

}
