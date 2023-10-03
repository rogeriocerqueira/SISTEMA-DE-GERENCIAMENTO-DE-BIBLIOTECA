package Model.DAO;

import Controller.BookController;
import Model.Borrowing;

public class BorrowingDAOImp implements BorrowingDAO{

    @Override
    public void create (Borrowing aBorrowing, BookController BookImp){}
    @Override
    public Borrowing read(String idB, String whichList){return new Borrowing();}
    @Override
    public void update(String idB, String nIdUser, String nUserName, String nIsbn, String nBookName){}
    @Override
    public void delete(String idB){}
}
