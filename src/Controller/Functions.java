package Controller;

import java.util.Calendar;
import java.util.Random;

public class Functions {

    public String generateId(String typeId) {

        String code;

        Random random = new Random();
        int n = random.nextInt(100000000);
        String nS = String.valueOf(n);

        code = typeId + nS;

        return code;

    }
    
    public Calendar actualDater(){

        return Calendar.getInstance();
    }

    public Calendar receiveDater(){

        int plus = 7;
        Calendar date = Calendar.getInstance();

        if(date.get(Calendar.DAY_OF_MONTH) >= 25 && date.get(Calendar.MONTH) == Calendar.DECEMBER){

            int m = (date.get(Calendar.DAY_OF_MONTH) + plus) - 31;

            date.add(Calendar.YEAR,1);
            date.set(Calendar.MONTH,1);
            date.set(Calendar.DAY_OF_MONTH, m);
        }

        if(date.get(Calendar.DAY_OF_MONTH) + plus > 31){

            date.add(Calendar.MONTH,1);
            date.set(Calendar.DAY_OF_MONTH, plus);

        }
        else { date.add(Calendar.DAY_OF_MONTH,plus);}

        return date;

    }

    public int blockerDater(Calendar dEnd, Calendar devolution){

        int block = 0;
        boolean confirm = dEnd.after(devolution);

        if(confirm){

            if(dEnd.get(Calendar.MONTH) > devolution.get(Calendar.MONTH)){

            int finish = dEnd.get(Calendar.DAY_OF_MONTH);
            int expected = devolution.get(Calendar.DAY_OF_MONTH);

            block = ((31-expected) + finish) * 2;
            }
            else{

                int finish = dEnd.get(Calendar.DAY_OF_MONTH);
                int expected = devolution.get(Calendar.DAY_OF_MONTH);
                block = (finish - expected) * 2; }

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
