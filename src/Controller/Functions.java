package Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Functions {

    public String generateId(String typeId, ArrayList<String> specificList) {

        boolean equal = false;
        String code;

        do {

            Random random = new Random();
            int n = random.nextInt(100000000);
            String nS = String.valueOf(n);

            code = typeId + nS;

            for (String idE :specificList) {
                if (idE.equals(code)) {
                     equal = true;

                }

            }

        } while (equal == true);

        return code;

    }
    
    public Calendar actualDater(){
        Calendar date = Calendar.getInstance();
        
        return date;
    }

    public void receiveDater(){

        int plus = 7;
        Calendar date = Calendar.getInstance();

        if(date.get(Calendar.DAY_OF_MONTH) >= 25 && date.get(Calendar.MONTH) == 12){

            int m = (date.get(Calendar.DAY_OF_MONTH) + plus) - 31;

            date.add(Calendar.YEAR,1);
            date.set(Calendar.MONTH,1);
            date.set(Calendar.DAY_OF_MONTH, m);
        }

        if(date.get(Calendar.DAY_OF_MONTH) + plus > 31){

            date.add(Calendar.MONTH,1);
            date.set(Calendar.DAY_OF_MONTH, plus);

        }

    }

    public int blockerDater(Calendar dEnd, Calendar devolution){

        int block = 0;
        boolean confirm = dEnd.after(devolution);

        if(confirm == true){

            int finish = dEnd.get(Calendar.DAY_OF_MONTH);
            int expected = devolution.get(Calendar.DAY_OF_MONTH);

            block = (finish - expected) * 2;

        }


        return block;
    }

    public boolean changeStatus (){
        return true;
    }

    public boolean cofereeBlock(Calendar conferee){
        boolean status = true;

        Calendar actual = Calendar.getInstance();

        if(conferee.before(actual)){status = false;}

     return status;
    }

}
