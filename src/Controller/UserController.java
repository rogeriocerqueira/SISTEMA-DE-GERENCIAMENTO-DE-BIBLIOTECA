package Controller;
import Model.User;
import java.util.ArrayList;

public class UserController {

    ArrayList <User> collection = new ArrayList<>();

    public void create(String name, String cpf, String office, int age, String nPhone, String email){
        User user = new User();

        user.setName(name);
        user.setCpf(cpf);
        user.setOffice(office);
        user.setAge(age);
        user.setnPhone(nPhone);
        user.setEmail(email);
        collection.add(user);
    }

    public ArrayList<User> readUser(String name, String cpf, String office, int age, String nPhone, String email){

        ArrayList<User> seach = new ArrayList<>();

        for (User user : collection){

            String aName = user.getName();
            String aCpf = user.getCpf();
            String aOffice = user.getOffice();
            int aAge = user.getAge();
            String anPhone = user.getnPhone();
            String aEmail = user.getEmail();

            if(aName.equals(name) || aCpf.equals(cpf) || aOffice.equals(office) || aAge == age || anPhone.equals(nPhone) || aEmail.equals(email) ){

                seach.add(user);
            }

        }
        return seach;
    }


    public void updateUser(String idUser,String nName, String nCpf, String nOffice, int nAge, String nPhone, String nEmail) {

        for (User user : collection) {

            if (user.getName().equals(idUser)) {

                if (nName != null) {
                    user.setName(nName);
                }

                if (nCpf != null){
                    user.setCpf(nCpf);
                }
                if (nOffice != null ){
                    user.setOffice(nOffice);
                }
                if (user.getAge() == 0){
                    user.setAge(nAge);
                }
                if (user.getnPhone() != null){
                    user.setnPhone(nPhone);
                }
                if (user.getEmail() != null){
                    user.setOffice(nEmail);
                }
            }

        }
    }

    public void deleteUser(String idUser){

        int index = 0;

        for (User user : collection){

            if(user.getId().equals(idUser)){
                collection.remove(index);
            }
            else{
                index = index + 1;
            }
        }
    }
}
