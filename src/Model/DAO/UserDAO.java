package Model.DAO;

import Model.User;

import java.util.ArrayList;
/*Interface of the user*/
public interface UserDAO {
    public void create(String id, String name, String cpf, String office, int age, String nPhone, String email);
    public User read(String id);
    public void update(String id, String name, String cpf, String office, int age, String nPhone, String email);
    public void delete(String id);

}
