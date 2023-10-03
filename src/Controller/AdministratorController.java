package Controller;
import Model.Administrator;
import java.util.ArrayList;

public class AdministratorController {

    ArrayList <Administrator> collection = new ArrayList<>();
    /*
    * @param name String - nome do administrador
    * @param cpf String - cpf do administrador
    * @param office String -  profissão do administrador
    * @param age int - idade do administrador
    * @param email String do administrador
    *  */
    public void create(String name, String cpf, String office, int age, String nPhone, String email){
        Administrator administrator = new Administrator();

        administrator.setName(name);
        administrator.setCpf(cpf);
        administrator.setOffice(office);
        administrator.setAge(age);
        administrator.setnPhone(nPhone);
        administrator.setEmail(email);
        collection.add(administrator);
    }

    public ArrayList<Administrator> readAdministrator(String name, String cpf, String office, int age, String nPhone, String email){

        ArrayList<Administrator> seach = new ArrayList<>();

        for (Administrator administrator : collection){

            String aName = administrator.getName();
            String aCpf = administrator.getCpf();
            String aOffice = administrator.getOffice();
            int aAge = administrator.getAge();
            String anPhone = administrator.getnPhone();
            String aEmail = administrator.getEmail();

            if(aName.equals(name) || aCpf.equals(cpf) || aOffice.equals(office) || aAge == age || anPhone.equals(nPhone) || aEmail.equals(email) ){

                seach.add(administrator);
            }

        }
        return seach;
    }


    public void updateAdministrator(String idAdministrator,String nName, String nCpf, String nOffice, int nAge, String nPhone, String nEmail) {

        for (Administrator administrator : collection) {

            if (administrator.getName().equals(idAdministrator)) {

                if (nName != null) {
                    administrator.setName(nName);
                }

                if (nCpf != null){
                    administrator.setCpf(nCpf);
                }
                if (nOffice != null ){
                    administrator.setOffice(nOffice);
                }
                if (administrator.getAge() == 0){
                    administrator.setAge(nAge);
                }
                if (administrator.getnPhone() != null){
                    administrator.setnPhone(nPhone);
                }
                if (administrator.getEmail() != null){
                    administrator.setOffice(nEmail);
                }
            }

        }
    }

/*@param idAdministrator String  - id gerado para identificação do objeto administrador*/
    public void deleteAdministrator(String idAdministrator){

        int index = 0;

        for (Administrator administrator : collection){

            if(administrator.getId().equals(idAdministrator)){
                collection.remove(index);
            }
            else{
                index = index + 1;
            }
        }
    }
}
