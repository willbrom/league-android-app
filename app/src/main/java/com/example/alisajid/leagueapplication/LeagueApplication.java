package com.example.alisajid.leagueapplication;

import android.app.Application;
import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LeagueApplication extends Application {

    private static final String BASE_URL = "https://euw1.api.riotgames.com/lol/";

    private static LeagueApplication leagueApplication;
    public static Retrofit retrofit;

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();

        leagueApplication = this;
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static LeagueApplication getAppInstance() {
        return leagueApplication;
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }
}
