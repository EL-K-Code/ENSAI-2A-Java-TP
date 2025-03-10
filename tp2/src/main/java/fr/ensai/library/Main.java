package fr.ensai.library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());
        Author SeydouB = new Author("Seydou Badian", 81, "MLI");
        Book book1 = new Book("123-09-12628", "Sous l'orage", SeydouB, 1234, 234);
        List<Book> listeDeLivres = new ArrayList<Book>();
        listeDeLivres.add(book1);
        LIbrary Ax = new LIbrary("Bibliothèque U de la Kozah", listeDeLivres);
        Ax.DisplayBooks();
        Ax.loadBooksFromCSV("books.csv");
        Ax.DisplayBooks();

    }
}
