//package com.kodilla.testing.weather.mock;
//
//import com.kodilla.testing.weather.Temperatures;
//import com.kodilla.testing.weather.WeatherForecast;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//
//public class WeatherForecastTestSuite {
//
//    @Mock
//    private Temperatures temperaturesMock;
//
//    @Test
//    void testCalculateForecastWithMock() {
//        //Given
//        Map<String, Double> temperaturesMap = new HashMap<>();
//        temperaturesMap.put("Rzeszow", 25.5);
//        temperaturesMap.put("Krakow", 26.2);
//        temperaturesMap.put("Wroclaw", 24.8);
//        temperaturesMap.put("Warszawa", 25.2);
//        temperaturesMap.put("Gdansk", 26.1);
//        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
//        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
//
//
//        //When
//        int quantityOfSensors = weatherForecast.calculateForecast().size();
//
//        //Then
//        Assertions.assertEquals(5, quantityOfSensors);
//    }
//
//    @Test
//    void testCalculateAvgTempWithMock() {
//        //Given
//        List<Double> temperaturesList = new ArrayList<>();
//        temperaturesList.add(25.5);
//        temperaturesList.add(26.2);
//        temperaturesList.add(24.8);
//        temperaturesList.add(25.2);
//        temperaturesList.add(26.1);
//        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
//        WeatherForecast average = new WeatherForecast(temperaturesMock);
//
//        //when
//       double quantityOfSensors = average.calculateTempAvg();                                                                // tutaj jako rezultat powinna się znaleźc średnia
//
//    //then
//        Assertions.assertEquals(5, quantityOfSensors);
//
//    }
//}
