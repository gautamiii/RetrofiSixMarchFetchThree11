package com.example.gautam.retrofisixmarchfetch;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gautam.retrofisixmarchfetch.responsebean.Responsebean;
import com.example.gautam.retrofisixmarchfetch.responsebean.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<Service> modulelist;
    private RecyclerView mrecyclerView;
    private RetroAdapter mAdapter;
    ApiInterface apiInterface;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modulelist=new ArrayList<>();
        mrecyclerView=findViewById(R.id.RecycleVieID);
        context = getApplicationContext();
        apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<Responsebean> respon=apiInterface.getData();
        respon.enqueue(new Callback<Responsebean>()
        {
            @Override
            public void onResponse(Call<Responsebean> call, Response<Responsebean> response)
            {
                if (response!=null)
                {
                    modulelist =  response.body().getServices();
                    RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
                    mrecyclerView.setLayoutManager(manager);
                    mAdapter =new RetroAdapter(MainActivity.this, modulelist);
                    mrecyclerView.setAdapter(mAdapter);
                    Toast.makeText(MainActivity.this, "Data Fetched Successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Data Could Not Fetch", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<Responsebean> call, Throwable t) {
            }
        });
    }
}
