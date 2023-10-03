package Model.DAO;

import Model.Librarian;

import java.util.ArrayList;

public class LibrarianDAOImp implements LibrarianDAO{

    @Override
    public void create(String name, String cpf, String office, int age, String nPhone, String email){}
    @Override
    public ArrayList<Librarian> read(String cpf){ArrayList<Librarian> librarianList = new ArrayList<>();
    return librarianList;
    }
    @Override
    public void update(String name, String cpf, String office, int age, String nPhone, String email){}
    @Override
    public void delete(int id){}
}
