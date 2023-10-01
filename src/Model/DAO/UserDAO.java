package Model.DAO;

import Model.User;

import java.util.ArrayList;

public interface UserDAO {
    public void create(String name, String cpf, String office, int age, String nPhone, String email);
    public ArrayList<User> read(String cpf);
    public void update(String name, String cpf, String office, int age, String nPhone, String email);
    public void delete(String cpf);

}
