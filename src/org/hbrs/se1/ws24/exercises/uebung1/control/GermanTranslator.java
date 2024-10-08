package org.hbrs.se1.ws24.exercises.uebung1.control;

import java.util.ArrayList;

public class GermanTranslator implements Translator {

	public String date = "Okt/2024"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */

	public String translateNumber(int number) {

		if (number < 1 || number > 10) {
			return "Übersetzung der Zahl " + number + " nicht möglich (Version: " + Translator.version + ")";
		}


		ArrayList<String> numlist = new ArrayList<>();

		numlist.add(0, "Null");
		numlist.add(1, "Eins");
		numlist.add(2, "Zwei");
		numlist.add(3, "Drei");
		numlist.add(4, "Vier");
		numlist.add(5, "Fünf");
		numlist.add(6, "Sechs");
		numlist.add(7, "Sieben");
		numlist.add(8, "Acht");
		numlist.add(9, "Neun");
		numlist.add(10, "Zehn");

		return numlist.get(number);
	}


	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
	 * Das Datum sollte system-intern durch eine org.hbrs.se1.ws24.exercises.uebung1.control.Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
