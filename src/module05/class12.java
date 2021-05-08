package module05;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class class12 {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();

        System.out.println(data.getTime());

        data.add(Calendar.MONTH, 1);
        System.out.println(data.getTime());

        data.add(Calendar.DAY_OF_MONTH, -30);
        System.out.println(data.getTime());

        data.set(Calendar.MONTH, Calendar.SEPTEMBER);
        System.out.println(data.getTime());

        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatarData.format(data.getTime()));
    }
}
