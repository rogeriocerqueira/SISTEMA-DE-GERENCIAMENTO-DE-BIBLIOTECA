import Controller.Functions;
import Model.Book;
import Model.DAO.BookDAOImp;
import Model.DAO.UserDAOImp;
import Model.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/*Autor: João Victor Macedo dos Santos Lima e Rogério dos Santos Cerqueira
        Componente Curricular: Programação
        Concluido em: 13/12/2023
        Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
        trecho de código de outro colega ou de outro autor, tais como provindos de livros e
        apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
        de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
        do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.*/
public class Main {
    public static void main(String[] args) throws IOException {
        
        Functions fuctionTest = new Functions();

        BookDAOImp BookDAOT = new BookDAOImp();
        Book aBook = new Book();

        UserDAOImp UserDAOT = new UserDAOImp();
        User aUser = new User();

        aBook.setIdBook(fuctionTest.generateId("B"));
        aBook.setIsbn("0000");
        aBook.setTitle("Livro de autoajuda");
        aBook.setAuthor("João e Rógerio");
        aBook.setPublisher("UEFS");
        aBook.setYear("2023");
        aBook.setCategory("Autoajuda");
        aBook.setNumber(10);

        aUser.setId(fuctionTest.generateId("U"));
        aUser.setCpf("000.000.000.00");
        aUser.setName("João Rogério");
        aUser.setOffice("user"); /* Possiveis funções: user, admin, lib*/
        aUser.setAge(25);
        aUser.setnPhone("75- 9 0124 5678");
        aUser.setEmail("JR@gmail.com");
        aUser.setAddress("Rua Módulos, Bairro UEFS, n°1-7, ");
        aUser.setStatus(false);


        //Testando saídas dos metodos de salvar e ler.

        String teste2 = UserDAOT.record(aUser); /*Salva usuario*/
        String dados = UserDAOT.recover(aUser.getCpf());/* Retorna usuario em string*/
        System.out.println(teste2);
        System.out.println(dados);


        String teste = BookDAOT.record(aBook); /* Salva livro*/
        ArrayList<File> books;
        books = BookDAOT.recover(); /*Retorna livro*/

        System.out.println(books.get(0));/*Retorna o book 1*/
        System.out.println(books.get(1));/*Retorna o book 2*/
        System.out.println(teste); /*Retorna o Json em formato String*/


        /*Teste apenas na classe DAOImp pois as outras classes DAO seguem o mesmo padrão*/

    }
}