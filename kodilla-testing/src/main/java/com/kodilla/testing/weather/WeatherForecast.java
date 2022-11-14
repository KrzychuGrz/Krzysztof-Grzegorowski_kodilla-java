package com.kodilla.testing.weather;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    private double sum;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public double getSum() {
        return sum;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;

    }

    public Double calculateTempAvg() {
        List<Double> AvgResultMap = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            AvgResultMap.add(temperature.getValue());
        }

        for (int n = 0; n < AvgResultMap.size(); n++) {
            sum += AvgResultMap.get(n);
        }


        return sum / AvgResultMap.size();
    }
}





