package Model.DAO;

import Model.Librarian;

import java.util.ArrayList;
/*Interface of the librarian*/
public interface LibrarianDAO {
    public void create(String name, String cpf, String office, int age, String nPhone, String email);
    public Librarian read(String id);
    public void update(String id, String name, String cpf, String office, int age, String nPhone, String email);
    public void delete(String id);
}
