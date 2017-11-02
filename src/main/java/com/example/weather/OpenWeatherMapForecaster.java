package com.example.weather;

import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.json.JSONException;

import java.io.IOException;

public class OpenWeatherMapForecaster {

    public static final String API_KEY = "d5e3b4470de07b97154a66f44ba0eb50";

    public static void main(String[] args) {
        OwmClient owm = new OwmClient();
        owm.setAPPID(API_KEY);
        WeatherStatusResponse currentWeather = null;
        try {
            currentWeather = owm.currentWeatherAtCity("Minsk", "BY");
            if (currentWeather.hasWeatherStatus()) {
                WeatherData weather = currentWeather.getWeatherStatus().get(0);
                if (weather.getPrecipitation() == Integer.MIN_VALUE) {
                    WeatherData.WeatherCondition weatherCondition = weather.getWeatherConditions().get(0);
                    String description = weatherCondition.getDescription();
                    if (description.contains("rain") || description.contains("shower"))
                        System.out.println("No rain measures in Tokyo but reports of " + description);
                    else
                        System.out.println("No rain measures in Tokyo: " + description);
                } else
                    System.out.println("It's raining in Tokyo: " + weather.getPrecipitation() + " mm/h");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
