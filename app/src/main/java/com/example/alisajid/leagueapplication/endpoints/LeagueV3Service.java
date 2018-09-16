package com.example.alisajid.leagueapplication.endpoints;

import com.example.alisajid.leagueapplication.model.ChampionRotation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface LeagueV3Service {

    @Headers({
        "Origin: https://developer.riotgames.com",
        "Accept-Charset: application/x-www-form-urlencoded; charset=UTF-8",
        "X-Riot-Token: RGAPI-0a656c7c-c336-46b6-9490-0d91614470e3",
        "Accept-Language: en-US,en;q=0.9",
        "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36"
    })
    @GET("platform/v3/champion-rotations")
    Call<ChampionRotation> getChampionRotation();
}
