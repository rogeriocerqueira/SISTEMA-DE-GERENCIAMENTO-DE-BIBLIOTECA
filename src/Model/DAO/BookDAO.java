package Model.DAO;

import Model.Book;

import java.util.ArrayList;

public interface BookDAO {

    public void create(String idBook, String isbn, String title, String author, String publisher, String year, String category, int number);
    public ArrayList<Book> read(String isbn, String title, String author, String category);
    public void update(String idBook,String nIsbn, String nTitle, String nAuthor, String nPublisher, String nYear, String nCategory, int nNumber);
    public void delete(String idBook);

}
