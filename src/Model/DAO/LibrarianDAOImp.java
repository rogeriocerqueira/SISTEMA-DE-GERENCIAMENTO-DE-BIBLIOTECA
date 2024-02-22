package Model.DAO;

import Model.Librarian;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class LibrarianDAOImp implements LibrarianDAO{

    @Override
    public String record(Librarian aLibrarian) throws IOException {

        Gson gson = new Gson();
        String jsonLib = gson.toJson(aLibrarian);

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        System.out.println(directory);

        FileWriter file = new FileWriter(directory + "/src/Model/Database/librarianDatabase/" + aLibrarian.getCpf() + ".json");
        file.write(jsonLib);
        file.close();

        return jsonLib;

    }

    @Override
    public String recover(String cpf) {

        Path mainPackage = FileSystems.getDefault().getPath("");
        String directory = mainPackage.toAbsolutePath().toString();

        File libPackage = new File(directory + "/src/Model/Database/librarianDatabase");

        String lib = null;

        for (File file : libPackage.listFiles()) {

            if (file.getName().equals(cpf)) {
                lib = String.valueOf(file);
            }
        }
        return lib;
    }
}
