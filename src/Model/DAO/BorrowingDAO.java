package Model.DAO;

import Controller.ControllerBook;
import Model.Book;
import Model.Borrowing;

import java.util.Date;

public interface BorrowingDAO {

    public void create (Borrowing aBorrowing, ControllerBook BookImp);
    public Borrowing read(String idB, String whichList);
    public void update(String idB, String nIdUser, String nUserName, String nIsbn, String nBookName);
    public void delete(String idB);

}
