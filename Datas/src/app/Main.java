package app;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1=sdf1.parse("25/06/2018");
        Date y2=sdf2.parse("25/06/2018 15:42:07");

        System.out.println(y1);
        System.out.println(y2);


        System.out.println("\n");

        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2)+"\n");

        //Data atual no formato sdf2
        Date x1=new Date();
        System.out.println("Data atual (x1) no formato 'sdf1': "+sdf1.format(x1));
        System.out.println("Data atual (x1) no formato 'sdf2': "+sdf2.format(x1));

        //Outra forma de obter a data atual
        Date x2=new Date(System.currentTimeMillis());
        System.out.println("Data atual (x2) no formato 'sdf2': "+sdf2.format(x2));

        Date x3=new Date(0);
        System.out.println("O inicio da contagem de data (01/01/1970 00:00:00) menos as 3horas de diferença do fuso horario, no formato sdf2: "+sdf2.format(x3));

        //Mostrar data correspondente as 05.00h da manhã de Janeiro de 1970
        Date x4=new Date(1000L * 60 *60L * 5L);
        System.out.println("Mostrar data correspondente as 05.00h da manhã de Janeiro de 1970 (menos 3h fuso horario): "+sdf2.format(x4));

        System.out.println("\nData no formato ISO 8601 padrão UTC");
        Date x5=Date.from(Instant.parse("2018-06-25T15:42:07z"));
        SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("x5: "+sdf3.format(x5));

        System.out.println("\n");
        Date d=Date.from(Instant.parse("2018-06-25T15:42:07z"));
        System.out.println(sdf2.format(d));
        //Acrestentar 4 horas nesta data
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        d=calendar.getTime();
        System.out.println("4 horas acrescentadas: "+sdf2.format(d));
        //Obter os minutos da data
        int minutos=calendar.get(Calendar.MINUTE);
        System.out.println("Obtendo os minutos da data: "+minutos);
        //Obtendo o mês
        int month=calendar.get(Calendar.MONTH)+1;
        System.out.println("Obtendo o mês da data: "+month);




    }
}
