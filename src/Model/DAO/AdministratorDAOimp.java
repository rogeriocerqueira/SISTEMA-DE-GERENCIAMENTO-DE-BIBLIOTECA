package Model.DAO;

import Model.Administrator;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

public class AdministratorDAOimp implements AdministratorDAO{
    @Override
    public String record(Administrator aAdministrator) throws IOException {

        Gson gson = new Gson();
        String jsonAdmin = gson.toJson(aAdministrator);

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        System.out.println(directory);

        FileWriter file = new FileWriter(directory + "/src/Model/Database/administratorDatabase/" + aAdministrator.getCpf() + ".json");
        file.write(jsonAdmin);
        file.close();

        return jsonAdmin;

    }

    @Override
    public String recover(String cpf) {

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        File admPackage = new File(directory + "/src/Model/Database/administratorDatabase");

        String admin = null;
        for (File file : admPackage.listFiles()) {

            if (file.getName().equals(cpf)) {
                admin = String.valueOf(file);
            }
        }
        return admin;
    }
}
