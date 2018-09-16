package com.example.alisajid.leagueapplication.model;

import com.google.gson.annotations.SerializedName;

public class ChampionRotation {

    @SerializedName("freeChampionIds")
    public int[] freeChampionIds;
    @SerializedName("freeChampionIdsForNewPlayers")
    public int[] freeChampionIdsForNewPlayers;
    @SerializedName("maxNewPlayerLevel")
    public int maxNewPlayerLevel;

    public int[] getFreeChampionIds() {
        return freeChampionIds;
    }

    public int[] getFreeChampionIdsForNewPlayers() {
        return freeChampionIdsForNewPlayers;
    }

    public int getMaxNewPlayerLevel() {
        return maxNewPlayerLevel;
    }
}
