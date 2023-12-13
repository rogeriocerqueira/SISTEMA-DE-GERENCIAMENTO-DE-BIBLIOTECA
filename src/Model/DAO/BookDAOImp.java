package Model.DAO;


import Model.Book;
import com.google.gson.Gson;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

public class BookDAOImp implements BookDAO{

    @Override
    public String record(Book aBook) throws IOException {

        Gson gson = new Gson();
        String jsonBook = gson.toJson(aBook);

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        FileWriter file = new FileWriter(directory + "/src/Model/Database/bookDatabase/" + aBook.getIdBook() + ".json");
        file.write(jsonBook);
        file.close();

        return jsonBook;

    }

    @Override
    public ArrayList<File> recover(){

        ArrayList<File> books = new ArrayList<>();

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        File bookPackage = new File(directory + "/src/Model/Database/bookDatabase");

        for(File file : bookPackage.listFiles()){

            books.add(file);
        }

        return books;
    }

}
