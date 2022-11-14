package com.kodilla.testing.weather.stub;

import com.kodilla.testing.weather.Temperatures;
import com.kodilla.testing.weather.TemperaturesStub;
import com.kodilla.testing.weather.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ioeWeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        //given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
