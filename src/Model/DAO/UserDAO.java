package Model.DAO;

import Model.Librarian;
import Model.User;

import java.io.IOException;
import java.util.ArrayList;
/*Interface of the user*/
public interface UserDAO {
    public String record(User aUser) throws IOException;
    public String recover(String cpf);

}
