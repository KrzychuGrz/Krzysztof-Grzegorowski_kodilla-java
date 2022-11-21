package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightBrowser {

    public String findFlight(Flight flight) {
        Map<String, Boolean> canIflightThere = new HashMap<>();
        canIflightThere.put("Warszawa Modlin", true);
        canIflightThere.put("Kraków Balice", true);
        canIflightThere.put("Poznań Ławica", false);
        return canIflightThere.toString();
    }
}
