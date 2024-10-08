package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Factory;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

public class Main {


        public static void main(String[] args) {
            Translator germanTranslator = Factory.erzeugeTranslator();

            // Der Client wird mit dem Translator-Objekt initialisiert
             Client client = new Client(germanTranslator);

            // Der Client nutzt die display-Methode, um die Übersetzung anzuzeigen
            client.display(1);  // Beispiel: Die Zahl 1 wird übersetzt
        }







}
