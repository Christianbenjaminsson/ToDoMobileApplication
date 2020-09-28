package com.example.todomobile.api.retrofitservices;

import com.example.todomobile.api.entities.EmployeeEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    public static final String BASE_URL = "http://10.0.2.2:8080";

    private static Retrofit getRetrofitBuild() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }


    public static APIService getAPIService() {
        return getRetrofitBuild().create(APIService.class);
    }

}
