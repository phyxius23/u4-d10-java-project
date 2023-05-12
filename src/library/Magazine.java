package library;

public class Magazine extends Script {

	// Attributi
	private MagazineType periodicity;

	// Costruttore
	public Magazine(long ISBN, String title, int publicationYear, int numberOfPages, MagazineType periodicity) {
		super(ISBN, title, publicationYear, numberOfPages);
		this.setPeriodicity(periodicity);
	}

	// Getters & Setters => controllare a fine progetto se serve cancellare qualche Getters
	public MagazineType getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(MagazineType periodicity) {
		this.periodicity = periodicity;
	}
}
