package Model.DAO;

import Model.Administrator;
import Model.Librarian;

import java.io.IOException;
import java.util.ArrayList;
/*Interface of the librarian*/
public interface LibrarianDAO {
    public String record(Librarian aLibrarian) throws IOException;
    public String recover(String cpf);
}
