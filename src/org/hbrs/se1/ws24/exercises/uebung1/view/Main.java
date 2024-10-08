package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Factory;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

public class Main {


        public static void main(String[] args) {
            Translator germanTranslator = Factory.erzeugeTranslator();
             Client client = new Client(germanTranslator);
            client.display(1);
        }







}
