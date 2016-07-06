package com.example.venuspc.testproj.Interface;


import com.google.gson.JsonObject;

import java.util.HashMap;

import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by VENUSPC on 7/6/2016.
 */
public interface RestService {
    //Post An PhoneNumber
    @POST("/api/create")
    public void PostAnPhoneNumber(@Body HashMap<String, String> arguments, Callback<JsonObject> cb);

}
