package org.hbrs.se1.ws24.exercises.uebung1.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factory {

    public static GermanTranslator erzeugeTranslator() {

            GermanTranslator translator = new GermanTranslator();

            LocalDate datum = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
            String formattedDate = datum.format(formatter);
            translator.setDate(formattedDate);

            return translator;
    }



}
