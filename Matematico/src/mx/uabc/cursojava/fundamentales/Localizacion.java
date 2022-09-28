package mx.uabc.cursojava.fundamentales;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Localizacion {
    public static void main(String args[]){
        Locale locale = Locale.getDefault();

        System.out.println((locale.getDisplayLanguage()));
        System.out.println((locale.getDisplayCountry()));
        System.out.println((locale.getDisplayName()));

        Locale localeSP = new Locale("es","MX");
        System.out.println((localeSP.getDisplayLanguage()));
        System.out.println((localeSP.getDisplayCountry()));
        System.out.println((localeSP.getDisplayName()));

        Calendar calendario = Calendar.getInstance();

        DateFormat dfShort = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);
        DateFormat dfLong = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
        System.out.println(dfShort.format(calendario.getTime()));
        System.out.println(dfLong.format(calendario.getTime()));

        DateFormat dfShortSP = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, localeSP);
        DateFormat dfLongSP = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeSP);
        System.out.println(dfShortSP.format(calendario.getTime()));
        System.out.println(dfLongSP.format(calendario.getTime()));

        SimpleDateFormat formatDate = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        System.out.println(formatDate.format(calendario.getTime()));

        NumberFormat nf_default = NumberFormat.getInstance(locale);
        System.out.println(nf_default.format(123.35));
        NumberFormat nf_defaultSP = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(nf_defaultSP.format(123.35));

    }
}
