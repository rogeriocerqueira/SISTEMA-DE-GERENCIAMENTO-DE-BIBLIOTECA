package Model.DAO;

import Model.Book;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public interface BookDAO {

    public String record(Book aBook) throws IOException;

    public ArrayList<File> recover();

}
