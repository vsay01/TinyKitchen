package com.example.tinykitchen.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    public static final String HOST_URL = "http://172.17.4.253/PhpProjectFoods/";

    static {
        URL url = null;
        try {
            url = new URL(HOST_URL+"getFoods.php?start=0");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}