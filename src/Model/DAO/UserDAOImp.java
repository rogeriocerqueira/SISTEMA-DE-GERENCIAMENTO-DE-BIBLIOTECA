package Model.DAO;

import Model.User;

import java.util.ArrayList;

public class UserDAOImp implements UserDAO{

    @Override
    public void create(String id, String name, String cpf, String office, int age, String nPhone, String email){}
    @Override
    public User read(String id){
        User aUser = new User();
    return aUser;
    }
    @Override
    public void update(String id, String name, String cpf, String office, int age, String nPhone, String email){}
    @Override
    public void delete(String cpf){}
}
