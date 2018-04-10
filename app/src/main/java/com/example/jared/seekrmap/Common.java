package com.example.jared.seekrmap;

import com.example.jared.seekrmap.Remote.IGoogleAPIService;
import com.example.jared.seekrmap.Remote.RetrofitClient;

/**
 * Created by jared on 3/23/2018.
 */

public class Common {

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
