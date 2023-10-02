package Model.DAO;

import Controller.BookController;
import Model.Borrowing;

public interface BorrowingDAO {

    public void create (Borrowing aBorrowing, BookController BookImp);
    public Borrowing read(String idB, String whichList);
    public void update(String idB, String nIdUser, String nUserName, String nIsbn, String nBookName);
    public void delete(String idB);

}
