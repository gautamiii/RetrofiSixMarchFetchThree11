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

    @GET("key=8290648-8c086abda29e0376fd377dd86&q=yellow+flowers&image_type=photo&pretty=true")
    Call<> getdata1();
}
