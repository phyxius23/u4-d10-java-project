package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	public static void searchFromYear(int publicationYear) {
		for (Script script : library) {
			if (script.getPublicationYear() == publicationYear) {
				logger.info("\nRICERCA PER " + publicationYear + ": {}", script.toString());
			}
			//else {
			//	logger.info("Nessuna pubblicazione trovata per l'anno " + publicationYear);
			//}
		}
	}

	public static void deleteFromISBN(long ISBN) {
		library.removeIf(script -> script.getISBN() == ISBN);
	}

	public static void searchFromISBN(long ISBN) {
		List<Script> ISBNSearched = library.stream().filter(publication -> (publication).getISBN() == ISBN)
				.collect(Collectors.toList());
		logger.info("RICERCA PER " + ISBN + ": {}", ISBNSearched.toString());
	}

	public static void searchFromAuthor(String author) {
		List<Book> authorSearched = library.stream()
				.filter(book -> book instanceof Book && ((Book) book).getAuthor().equals(author)).map(p -> (Book) p)
				.collect(Collectors.toList());
		logger.info("RICERCA PER " + author + ": {}", authorSearched.toString());
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

		// ********** *********** **********
		// ******  AGGIUNTA ELEMENTI  ****** => FUNZIONA
		// ********** *********** **********
		addScript(book1);
		addScript(book2);
		addScript(book3);
		addScript(book4);
		addScript(book5);
		addScript(book6);

		addScript(magazine1);
		addScript(magazine2);
		addScript(magazine3);
		addScript(magazine4);
		addScript(magazine5);
		addScript(magazine6);

		// ********** ************ **********
		// *******  RICERCA PER ANNO  ******* => FUNZIONA
		// ********** ************ **********
		searchFromYear(2023); //=> Yellow diamonds / L'impostore

		// ********** ************ **********
		// ******  RICERCA PER AUTORE  ****** => FUNZIONA
		// ********** ************ **********
		searchFromAuthor("Stephen King");

		// ********** ************* **********
		// ********  RIMUOVI DA ISBN  ******** => FUNZIONA
		// ********** ************* **********
		deleteFromISBN(9933329444449l); //=> Scienza & Politica

		// ********** ************* **********
		// ********  RICERCA DA ISBN  ******** => FUNZIONA
		// ********** ************* **********
		searchFromISBN(9928892704704l); //=> National Geographic

		// ********** ************ ***********
		// *******  SALVATAGGIO IN HD  *******
		// ********** ************* **********

	}

}
