package com.example.jared.seekrmap.Model;

/**
 * Created by jared on 3/23/2018.
 */

public class Location {
    private String lng;

    private String lat;

    public String getLng ()
    {
        return lng;
    }

    public void setLng (String lng)
    {
        this.lng = lng;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lng = "+lng+", lat = "+lat+"]";
    }
}
