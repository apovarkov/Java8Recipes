package com.example.weather;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class YahooWeatherForecaster {
    public static void main(String[] args) {
        YahooWeatherService service = null;
        try {
            service = new YahooWeatherService();
            Channel channel = service.getForecast("834463", DegreeUnit.CELSIUS);
            System.out.println(channel.getDescription());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
