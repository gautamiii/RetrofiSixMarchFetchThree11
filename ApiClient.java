package com.example.gautam.retrofisixmarchfetch;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gautam on 3/6/2018.
 */

public class ApiClient {

    public static final String base_url = "http://helper.org.in/new/apis/";
    public static Retrofit retrofit = null;
    public static Retrofit retrofit1 = null;
    public static Retrofit retrofit2 = null;




    public static Retrofit getApiClient() {
        if (retrofit == null) {

            retrofit = new Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }
}
