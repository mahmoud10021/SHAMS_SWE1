package org.hbrs.se1.ws24.exercises.uebung1.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factory {

    public static GermanTranslator erzeugeTranslator() {

        // Vorteil hier: der Typ kann hier und auch NUR hier ausgetauscht werden
        // Auch die Objektparametrisierung (z.B. das initiale Setzen eines Datums)
        // kann zentral organisiert werden
        GermanTranslator translator = new GermanTranslator();
        translator.setDate("11-11-2020");
        return translator;

    }



}
