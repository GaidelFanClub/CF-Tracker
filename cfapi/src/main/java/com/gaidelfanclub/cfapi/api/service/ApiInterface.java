package com.gaidelfanclub.cfapi.api.service;

import com.gaidelfanclub.cfapi.api.model.User;
import com.gaidelfanclub.cfapi.api.response.BaseResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("user.info")
    Call<BaseResponse<List<User>>> loadUser(@Query("handles") String handle);

}
