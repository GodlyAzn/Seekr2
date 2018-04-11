package com.example.seekr;

import com.example.seekr.Remote.IGoogleAPIService;
import com.example.seekr.Remote.RetrofitClient;

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
