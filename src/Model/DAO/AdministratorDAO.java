package Model.DAO;
import Model.Administrator;

import java.io.IOException;
import java.util.ArrayList;

/*Interface of the administration*/
public interface AdministratorDAO {
    public String record(Administrator aAdministrator) throws IOException;
    public String recover(String cpf);
}
