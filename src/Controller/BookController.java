package Controller;

import Model.Book;
import java.util.ArrayList;

public class BookController {

    ArrayList <Book> collection = new ArrayList<>();


    public void createBook(String idBook, String isbn, String title, String author, String publisher, String year, String category, int number){

        Book book = new Book();

        book.setIdBook(idBook);
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setYear(year);
        book.setCategory(category);
        book.setNumber(number);

        collection.add(book);

    }

    public ArrayList<Book> readBook(String isbn, String title, String author, String category){

        ArrayList<Book> seach = new ArrayList<>();

        for (Book book : collection){

            String aTitle = book.getTitle();
            String aAuthor = book.getAuthor();
            String aIsbn = book.getIsbn();
            String aCategory = book.getCategory();

            if(aTitle.equals(title) || aAuthor.equals(author) || aIsbn.equals(isbn) || aCategory.equals(category) ){

                seach.add(book);
            }


        }
        return seach;
    }


    public void updateBook(String idBook,String nIsbn, String nTitle, String nAuthor, String nPublisher, String nYear, String nCategory, int nNumber){

        for (Book book : collection){

            if (book.getIdBook().equals(idBook)){

                if(nIsbn != null){
                    book.setIsbn(nIsbn);
                }
                if(nTitle != null){
                    book.setTitle(nTitle);
                }
                if(nAuthor != null){
                    book.setAuthor(nAuthor);
                }
                if(nPublisher != null){
                    book.setPublisher(nPublisher);
                }
                if(nYear != null){
                    book.setYear(nYear);
                }
                if(nCategory != null){
                    book.setCategory(nCategory);
                }
                if(nNumber != 0){
                    book.setNumber(nNumber);
                }
            }
        }
    }

    public void deleteBook(String idBook){

        int index = 0;

        for (Book book : collection){

            if(book.getIdBook().equals(idBook)){
                collection.remove(index);
            }
            else{
                index = index + 1;
            }
        }

    }


}
