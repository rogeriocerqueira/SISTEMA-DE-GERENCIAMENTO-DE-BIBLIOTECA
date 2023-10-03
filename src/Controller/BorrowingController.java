package Controller;

import Model.Book;
import Model.Borrowing;
import java.util.Calendar;
import java.util.ArrayList;


/**Classe destinada a controlar o jogo de valor das classes relacionadas a emprestimo.
 * @author João Macedo e Rogério Cerqueira
 * @version 1.0
 *
 */


public class BorrowingController {

    ArrayList <Borrowing> borrowingList = new ArrayList<>();

    ArrayList <Borrowing> historic = new ArrayList<>();


    /** Método para criar um emprestimo.
     * @return void - Emprestimo*/

    public void createBorrowing(String idB, String idUser, String userName, String isbn, String bookName, Calendar dStart, boolean rSituation, BookController BookImp){

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

        borrowingList.add(borrowing);

    }

    /** Método para ler um emprestimo.
     * @return Borrowing - Emprestimo*
     * @param idB String - id de busca*
     * @param whichList ArrayList<String> - lista de emprestimo/reserva ou histórico de emprestimos*/

    public Borrowing readBorrowing(String idB, String whichList){

        Borrowing actualB = new Borrowing();

        if(whichList.equals("0")){

            for(Borrowing borrowing : borrowingList){

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

    /** Método para atualizar um emprestimo.
     * @param idB String - id de busca*
     * @param nIdUser String - novo id do usuario*
     * @param nUserName String - novo nome do usuario*
     * @param nIsbn String - isbn correto*
     * @param nBookName String - nome do livro correto*/

    public void updateBorrowing(String idB, String nIdUser, String nUserName, String nIsbn, String nBookName){

        for (Borrowing borrowing : borrowingList){

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


    /** Método para excluir um emprestimo.
     *@param idB String - id de busca*/
    public void deleteBorrowing(String idB){

        int index = 0;

        for(Borrowing borrowing : borrowingList){

            if (borrowing.getIdB().equals(idB)){
                borrowingList.remove(index);
            }
            else {
                index = index +1;
            }
        }
    }



}
