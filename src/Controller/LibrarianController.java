package Controller;
import Controller.UserController;
import Model.Book;
import Controller.Functions;
import Controller.BorrowingController;
import Model.Borrowing;
import Model.Librarian;
import Model.DAO.BorrowingDAO;
import Model.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class LibrarianController {

    ArrayList <Librarian> collection = new ArrayList<>();
    /*
    * @param name String - nome do bibliotecário
    * @param cpf String - cpf do bibliotecário
    * @param office String -  profissão do bibliotecário
    * @param age int - idade do bibliotecário
    * @param email String do bibliotecário
    *  */
    public void create(String name, String cpf, String office, int age, String nPhone, String email){
        Librarian librarian = new Librarian();

        librarian.setName(name);
        librarian.setCpf(cpf);
        librarian.setOffice(office);
        librarian.setAge(age);
        librarian.setnPhone(nPhone);
        librarian.setEmail(email);
        collection.add(librarian);
    }

    public ArrayList<Librarian> readLibrarian(String name, String cpf, String office, int age, String nPhone, String email){

        ArrayList<Librarian> seach = new ArrayList<>();

        for (Librarian librarian : collection){

            String aName = librarian.getName();
            String aCpf = librarian.getCpf();
            String aOffice = librarian.getOffice();
            int aAge = librarian.getAge();
            String anPhone = librarian.getnPhone();
            String aEmail = librarian.getEmail();

            if(aName.equals(name) || aCpf.equals(cpf) || aOffice.equals(office) || aAge == age || anPhone.equals(nPhone) || aEmail.equals(email) ){
                seach.add(librarian);
            }

        }
        return seach;
    }
    /*
    * @param idLibrarian String id gerado pela classe de função de forma aleartória necessário para atualização e identificação única de cada bibliotecário
    * */
    public void updateLibrarian(String idLibrarian,String nName, String nCpf, String nOffice, int nAge, String nPhone, String nEmail) {

        for (Librarian librarian : collection) {

            if (librarian.getName().equals(idLibrarian)) {

                if (nName != null) {
                    librarian.setName(nName);
                }

                if (nCpf != null){
                    librarian.setCpf(nCpf);
                }
                if (nOffice != null ){
                    librarian.setOffice(nOffice);
                }
                if (librarian.getAge() == 0){
                    librarian.setAge(nAge);
                }
                if (librarian.getnPhone() != null){
                    librarian.setnPhone(nPhone);
                }
                if (librarian.getEmail() != null){
                    librarian.setOffice(nEmail);
                }
            }

        }
    }

    public void deleteLibrarian(String idLibrarian){

        int index = 0;

        for (Librarian librarian : collection){

            if(librarian.getId().equals(idLibrarian)){
                collection.remove(index);
            }
            else{
                index = index + 1;
            }
        }
    }

    /*
    * @param borrowing Borrowing - Tipo de classe responsável pelo empréstimo
    *  @return borrowing retorna um tipo Borrowing  que contém as informações do empréstimo do(s) livros*/
    public Borrowing borrowingLibrarian(Borrowing borrowing, User user, ArrayList<Book> borrowedBooks, Book book) {

        Functions bfunctions = new Functions();

        String newIdB = bfunctions.generateId("br");
        String nidUser = bfunctions.generateId("us");
        String nUserName = borrowing.getUserName();
        String nIsbn = borrowing.getIsbn();
        String nBookName = borrowing.getBookName();
        Calendar ndStart = borrowing.getdStart();
        Calendar nDevolution = borrowing.getDevolution();
        Calendar nEnd = borrowing.getdEnd();
        Boolean nSituation = borrowing.getrSituation();

        if(nSituation == false) {

            if(borrowedBooks.isEmpty()){
                System.out.println("Nenhum livro emprestado.");

            } else borrowedBooks.add(book);

        }return borrowing;

    }
    public void blockUser(Borrowing borrowing, User user, ArrayList<Book> borrowedBooks){
        if(borrowing.getrSituation()!=false){
            System.out.println("Usuario nao pode pegar livro emprestado.");
        }


    }
}
