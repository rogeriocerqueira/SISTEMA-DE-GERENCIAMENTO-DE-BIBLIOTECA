package Model;

import java.util.Calendar;
import java.util.ArrayList;

public class User extends Person{

    ArrayList<Borrowing> bookList = new ArrayList<Borrowing>();
    private String address;
    private String status;
    private Calendar block;
}
