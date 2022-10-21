package desafio;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DataSwitch {
    public static void main(String[] args) {


        if (args.length > 0) {
            switch (args[0].toLowerCase(Locale.ROOT)) {
                case "data":
                    System.out.println("A data da sua consulta é: " + DateFormat.getDateInstance().format(new Date()));
                    break;
                case "hora":
                    System.out.println("Sua consulta está marcada no horário:  " + DateFormat.getTimeInstance()
                            .format(new Date()));
                    Date date = new Date();
                    System.out.printf("Exemplo usando printf: %tT%n", date);
                    System.out.println("Exemplo usando LocalTime: " + LocalTime.now().format(DateTimeFormatter
                            .ofPattern("hh:mm:ss")));
                    break;
                case "zona":
                    System.out.println("A zona da sua consulta é: " + DateFormat.getTimeInstance().getCalendar().getTimeZone());
                    break;
                case "ano":
                    System.out.println("O ano da consulta é: " + LocalDate.now().getYear());
                    break;
                case "mes":
                    System.out.println("O mes da consulta é: " + LocalDate.now().getMonth());
                    break;
                case "amanha":
                    System.out.println("Amanhã será: "+ LocalDate.now().plusDays(1));
                    break;
                case "ontem":
                    System.out.println("Ontem foi: "+ LocalDate.now().minusDays(1));
                    break;
                case "proximahora":
                    System.out.println("A próxima hora é: "+ LocalTime.now().plusHours(1));
            }
        }
    }

}
