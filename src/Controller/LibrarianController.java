package Controller;
import Model.Librarian;
import java.util.ArrayList;

public class LibrarianController {

    ArrayList <Librarian> collection = new ArrayList<>();

    public void create(String name, String cpf, String office, int age, String nPhone, String email){
        Librarian librarian = new Librarian();

        librarian.setName(name);
        librarian.setCpf(cpf);
        librarian.setOffice(office);
        librarian.setAge(age);
        librarian.setnPhone(nPhone);
        librarian.setEmail(email);
        collection.add(librarian);
    }

    public ArrayList<Librarian> readLibrarian(String name, String cpf, String office, int age, String nPhone, String email){

        ArrayList<Librarian> seach = new ArrayList<>();

        for (Librarian librarian : collection){

            String aName = librarian.getName();
            String aCpf = librarian.getCpf();
            String aOffice = librarian.getOffice();
            int aAge = librarian.getAge();
            String anPhone = librarian.getnPhone();
            String aEmail = librarian.getEmail();

            if(aName.equals(name) || aCpf.equals(cpf) || aOffice.equals(office) || aAge == age || anPhone.equals(nPhone) || aEmail.equals(email) ){
                seach.add(librarian);
            }

        }
        return seach;
    }

    public void updateLibrarian(String idLibrarian,String nName, String nCpf, String nOffice, int nAge, String nPhone, String nEmail) {

        for (Librarian librarian : collection) {

            if (librarian.getName().equals(idLibrarian)) {

                if (nName != null) {
                    librarian.setName(nName);
                }

                if (nCpf != null){
                    librarian.setCpf(nCpf);
                }
                if (nOffice != null ){
                    librarian.setOffice(nOffice);
                }
                if (librarian.getAge() == 0){
                    librarian.setAge(nAge);
                }
                if (librarian.getnPhone() != null){
                    librarian.setnPhone(nPhone);
                }
                if (librarian.getEmail() != null){
                    librarian.setOffice(nEmail);
                }
            }

        }
    }

    public void deleteLibrarian(String idLibrarian){

        int index = 0;

        for (Librarian librarian : collection){

            if(librarian.getId().equals(idLibrarian)){
                collection.remove(index);
            }
            else{
                index = index + 1;
            }
        }
    }
}
