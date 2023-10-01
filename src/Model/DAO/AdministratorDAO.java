package Model.DAO;
import Model.Administrator;
import java.util.ArrayList;

/*Interface of the administration*/
public interface AdministratorDAO {
    public void create(String name, String cpf, String office, int age, String nPhone, String email);
    public ArrayList<Administrator> read(String cpf);
    public void update(String name, String cpf, String office, int age, String nPhone, String email);
    public void delete(int id);

}
