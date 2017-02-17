package com.gaidelfanclub.cftracker;

import android.app.Activity;
import android.os.Bundle;

import com.gaidelfanclub.cfapi.api.model.User;
import com.gaidelfanclub.cfapi.api.response.BaseResponse;
import com.gaidelfanclub.cfapi.api.service.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ApiService.getApi().loadUser("pitfall").enqueue(new Callback<BaseResponse<List<User>>>() {
            @Override
            public void onResponse(Call<BaseResponse<List<User>>> call, Response<BaseResponse<List<User>>> response) {
                //todo
            }

            @Override
            public void onFailure(Call<BaseResponse<List<User>>> call, Throwable t) {
                //todo
            }
        });

    }
}
