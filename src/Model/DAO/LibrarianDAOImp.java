package Model.DAO;

import Model.Librarian;

import java.util.ArrayList;

public class LibrarianDAOImp implements LibrarianDAO{

    @Override
    public void create(String name, String cpf, String office, int age, String nPhone, String email){}
    @Override
    public Librarian read(String id){
        return new Librarian();
    }
    @Override
    public void update(String id,String name, String cpf, String office, int age, String nPhone, String email){}
    @Override
    public void delete(String id){}
}
