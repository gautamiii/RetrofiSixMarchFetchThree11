package com.example.gautam.retrofisixmarchfetch;

import com.example.gautam.retrofisixmarchfetch.responsebean.Responsebean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Gautam on 3/6/2018.
 */

public interface ApiInterface {

    @GET("get/services")
    Call<Responsebean> getData();
}
