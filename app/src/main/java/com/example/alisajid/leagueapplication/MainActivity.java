package com.example.alisajid.leagueapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.alisajid.leagueapplication.endpoints.LeagueV3Service;
import com.example.alisajid.leagueapplication.model.ChampionRotation;
import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.summoner.Summoner;
import com.merakianalytics.orianna.types.core.staticdata.SummonerSpells;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeagueV3Service leagueV3Service = LeagueApplication.getRetrofit().create(LeagueV3Service.class);
        leagueV3Service.getChampionRotation().enqueue(new Callback<ChampionRotation>() {
            @Override
            public void onResponse(Call<ChampionRotation> call, Response<ChampionRotation> response) {
                Log.d(TAG, "onResponse");
                Log.d(TAG, response.body().getMaxNewPlayerLevel() + " max player level");
            }

            @Override
            public void onFailure(Call<ChampionRotation> call, Throwable t) {
                Log.d(TAG, "onFailure");
            }
        });

        Orianna.setRiotAPIKey(getResources().getString(R.string.api_key));
        Orianna.setDefaultRegion(Region.NORTH_AMERICA);

        SummonerSpells summonerSpells = Orianna.getSummonerSpells();
        Log.d(TAG, summonerSpells.getType() + " is level " + summonerSpells.getVersion());
    }
}
