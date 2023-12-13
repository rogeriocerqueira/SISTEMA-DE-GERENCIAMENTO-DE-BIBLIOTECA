package Model.DAO;

import Model.User;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class UserDAOImp implements UserDAO{

    @Override
    public String record(User aUser) throws IOException {

        Gson gson = new Gson();
        String jsonUser = gson.toJson(aUser);

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        System.out.println(directory);

        FileWriter file = new FileWriter(directory + "/src/Model/Database/userDatabase/" + aUser.getCpf() + ".json");
        file.write(jsonUser);
        file.close();

        return jsonUser;

    }

    @Override
    public String recover(String cpf) {

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        File userPackage = new File(directory + "/src/Model/Database/userDatabase");

        String user = null;

        for (File file : userPackage.listFiles()) {

            if (file.getName().equals(cpf)) {
                user = String.valueOf(file);
            }
        }
        return user;
    }
}
