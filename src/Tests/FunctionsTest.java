package Tests;

import Controller.Functions;
import org.junit.jupiter.api.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FunctionsTest {


    @Test
    public void testGenarateId(){

        Functions function = new Functions();

        String typeBook = "b";

        String id1 = function.generateId(typeBook);
        String id2 = function.generateId(typeBook);

        System.out.println(id1);
        System.out.println(id2);

        assertNotEquals(id1,id2);
    }

    @Test
    public void testActualDater(){

        Functions function = new Functions();
        Calendar data = function.actualDater();
        Locale place = new Locale("pt", "BR");

        DateFormat dateFormat = new SimpleDateFormat("MMMMMMMMM", place);

        System.out.println(data.get(Calendar.DAY_OF_MONTH));
        System.out.println(dateFormat.format(data.getTime()).toUpperCase());
        System.out.println(data.get(Calendar.YEAR));

        Assertions.assertNotNull(data, "VAZIO!");
    }

    @Test
    public void testReceiveDater(){

        Calendar comparative = Calendar.getInstance();
        Functions functions = new Functions();

        Calendar c = functions.receiveDater();

        Locale place = new Locale("pt", "BR");

        DateFormat dateFormat = new SimpleDateFormat("MMMMMMMMM", place);

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(dateFormat.format(c.getTime()).toUpperCase());
        System.out.println(c.get(Calendar.YEAR));

        Assertions.assertNotNull(c, "VAZIO!");



    }

    @Test
    public void testBlockerDater(){

        Functions functions = new Functions();

        Calendar devolution = Calendar.getInstance();
        Calendar dEnd = Calendar.getInstance();

        devolution.set(Calendar.DAY_OF_MONTH,25);
        devolution.set(Calendar.MONTH,8);
        devolution.set(Calendar.YEAR,2023);

        int nBD = functions.blockerDater(dEnd,devolution);

        System.out.println(nBD);
    }

    @Test
    public void testChangeStatus(){

        Functions functions = new Functions();

        boolean status = false;
        status = functions.changeStatus();

        assertTrue(status);
    }

    @Test
    public void testCofereeBlock(){

        Functions functions = new Functions();
        Calendar nowD = Calendar.getInstance();

        nowD.set(Calendar.DAY_OF_MONTH,25);
        nowD.set(Calendar.MONTH,8);
        nowD.set(Calendar.YEAR,2023);

        boolean status = functions.cofereeBlock(nowD);

        assertFalse(status);

    }


}
