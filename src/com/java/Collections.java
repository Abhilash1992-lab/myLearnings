package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		ArrayList<String> Countrylist = new ArrayList<String>();

		Countrylist.add("India");
		Countrylist.add("United States of America"); // NewJersey, Florida, California, Texas, Virginia
		Countrylist.add("France"); // Brittany , Burgundy, Picardy, Limousin, Lorraine
		Countrylist.add("Spain"); // Burgos, Jaen, Toledo, Cuenca, León
		Countrylist.add("Italy"); //
		Countrylist.add("Britain");
		// **********************************************//
		ArrayList<String> IndianStateslist = new ArrayList<String>();
		IndianStateslist.add("Andhra Pradesh");
		IndianStateslist.add("Telangana");
		IndianStateslist.add("Madhya Pradesh");
		IndianStateslist.add("Uttar Pradesh");
		IndianStateslist.add("Karnataka");
		IndianStateslist.add("TamilNadu");
		IndianStateslist.add("Kerala");
		
		LinkedList<String> StateCities = new LinkedList<String>();
		StateCities.size();

		
		StateCities.add("Vijayawada");
		StateCities.add("Kurnool");
		StateCities.add("Vizag");		
		StateCities.add("Bhimavaram");
		StateCities.add("Nellore");
		StateCities.add("Tirupati");
		
		Iterator it = StateCities.descendingIterator();
	
		StateCities.pop();
		// *********************************************//

		HashMap<String, List<String>> StatesMap = new HashMap<String, List<String>>();

		StatesMap.put("India", IndianStateslist);
		System.out.println(StatesMap.get("India"));
		
		HashMap<String, List<String>> CitiesMap = new HashMap<String, List<String>>();
		CitiesMap.put("Andhra Pradesh", StateCities);
		System.out.println(CitiesMap.get("Andhra Pradesh"));
	}

}
