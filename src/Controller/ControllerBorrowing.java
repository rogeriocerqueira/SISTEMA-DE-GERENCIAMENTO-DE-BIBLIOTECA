package Controller;

import Model.Book;
import Model.Borrowing;
import Model.DAO.BorrowingDAO;
import java.util.Date;
import java.util.ArrayList;

public class ControllerBorrowing {

    ArrayList <Borrowing> BorrowingList = new ArrayList<>();

    ArrayList <Borrowing> historic = new ArrayList<>();



    public void createBorrowing(String idB, String idUser, String userName, String isbn, String bookName, Date dStart, boolean rSituation, ControllerBook BookImp){

        Borrowing borrowing = new Borrowing();

        borrowing.setIdB(idB);
        borrowing.setIdUser(idUser);
        borrowing.setUserName(userName);
        borrowing.setIsbn(isbn);
        borrowing.setBookName(bookName);
        borrowing.setdStart(dStart);

        for (Book book : BookImp.collection){

            if(book.getIdBook().equals(idB)) {

                borrowing.setrSituation(book.getNumber() >= 1);
            }
        }

        BorrowingList.add(borrowing);

    }

    public Borrowing readBorrowing(String idB, String whichList){

        Borrowing actualB = new Borrowing();

        if(whichList.equals("0")){

            for(Borrowing borrowing : BorrowingList){

                if(idB.equals(borrowing.getIdB())){
                    actualB = borrowing;

                }
            }
        }
        else{
            for(Borrowing borrowing : historic){

                if(idB.equals(borrowing.getIdB())){
                    actualB = borrowing;

                }

            }

        }

        return actualB;
    }

    public void updateBorrowing(String idB, String nIdUser, String nUserName, String nIsbn, String nBookName){

        for (Borrowing borrowing : BorrowingList){

            if(borrowing.getIdB().equals(idB)){

                if(nIdUser != null){
                    borrowing.setIdUser(nIdUser);
                }
                if(nUserName != null){
                    borrowing.setUserName(nUserName);
                }
                if(nIsbn != null){
                    borrowing.setIsbn(nIsbn);
                }
                if(nBookName != null){
                    borrowing.setBookName(nBookName);
                }
            }

        }
    }


    public void deleteBorrowing(String idB){

        int index = 0;

        for(Borrowing borrowing : BorrowingList){

            if (borrowing.getIdB().equals(idB)){
                BorrowingList.remove(index);
            }
            else {
                index = index +1;
            }
        }
    }

}
