package com.example.jared.seekrmap.Remote;

import com.example.jared.seekrmap.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by jared on 3/23/2018.
 */

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);
}
