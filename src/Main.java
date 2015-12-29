import mx.shell.java.utils.DateInterpreter;

public class Main {
    public static void main(String[] args) {
        long val = 1451368800000l;

        String patron = "yyyy-MM-dd";
        System.out.println("Valor: " + val);
        System.out.println("Fecha: " + DateInterpreter.longToString(patron, val));
    }
}
