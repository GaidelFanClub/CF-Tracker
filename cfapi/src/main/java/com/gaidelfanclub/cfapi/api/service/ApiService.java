package com.gaidelfanclub.cfapi.api.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static ApiInterface apiInterface;

    public static ApiInterface getApi() {
        if (apiInterface == null) {
            synchronized (ApiService.class) {
                if (apiInterface == null) {
                    apiInterface = createInterface();
                }
            }
        }
        return apiInterface;
    }

    private static final String BASE_URL = "http://codeforces.com/api/";


    private static ApiInterface createInterface() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiInterface.class);
    }

}
