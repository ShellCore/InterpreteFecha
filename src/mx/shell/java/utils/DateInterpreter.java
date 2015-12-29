package mx.shell.java.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInterpreter {

    public static String longToString(String pattern, long value) {

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = new Date(value);
        return dateFormat.format(date).toString();
    }
}
