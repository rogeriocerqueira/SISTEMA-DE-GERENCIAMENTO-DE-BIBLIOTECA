package Model.DAO;

import Model.Borrowing;

import java.util.Date;

public interface BorrowingDAO {

    public void create (String idB, String idUser, String userName, String isbn, String bookName, Date dStart, boolean rSituation, BookDAOImp BookImp);
    public Borrowing read(String idB, String whichList);
    public void update(String idB, String nIdUser, String nUserName, String nIsbn, String nBookName);
    public void delete(String idB);

}
