package app;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import library.Book;
import library.Magazine;
import library.MagazineType;
import library.Script;

public class Main {

	public static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static List<Script> library = new ArrayList<>();

	public static void addScript(Script nameScript) {
		library.add(nameScript);
	}

	public static void deleteFromISBN() {

	}

	public static void main(String[] args) {

		// ********** ********** **********
		// ********** ** BOOK ** **********
		// ********** ********** **********
		Book book1 = new Book(9788893904704l, "Yellow diamonds", 2023, 336, "Paolo Roversi", "Thriller");
		Book book2 = new Book(9788809968950l, "L'impostore", 2023, 288, "Martin Griffin", "Thriller");
		Book book3 = new Book(9788829710348l, "La setta", 2022, 768, "Camilla Läckberg", "Giallo");
		Book book4 = new Book(9788829713554l, "La caccia", 2022, 384, "Will Dean", "Giallo");
		Book book5 = new Book(9788820074449l, "Fairy Tale", 2022, 677, "Stephen King", "Horror");
		Book book6 = new Book(9788820073169l, "Black phone. Mai parlare con gli sconosciuti", 2022, 393, "Joe Hill",
				"Horror");

		// ********** ********** **********
		// **********  MAGAZINE  **********
		// ********** ********** **********
		Magazine magazine1 = new Magazine(9928892704704l, "National Geographic", 1888, 110, MagazineType.MONTHLY);
		Magazine magazine2 = new Magazine(9578802468950l, "Settimana Enigmistica", 1932, 60, MagazineType.WEEKLY);
		Magazine magazine3 = new Magazine(9926329710394l, "Focus", 1992, 105, MagazineType.MONTHLY);
		Magazine magazine4 = new Magazine(9629429713554l, "Panorama", 1962, 85, MagazineType.WEEKLY);
		Magazine magazine5 = new Magazine(9933329444449l, "Scienza & Politica", 1989, 164, MagazineType.HALFYEARLY);
		Magazine magazine6 = new Magazine(9024720354169l, "ArtApp", 2009, 145, MagazineType.HALFYEARLY);
	}

}
