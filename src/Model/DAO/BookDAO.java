package Model.DAO;

import Model.Book;

import java.util.ArrayList;

public interface BookDAO {

    public void create(Book aBook);
    public ArrayList<Book> read(String isbn, String title, String author, String category);
    public void update(String idBook, Book aBook);
    public void delete(String idBook);

}
