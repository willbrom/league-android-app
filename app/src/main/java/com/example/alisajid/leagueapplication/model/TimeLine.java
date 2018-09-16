package com.example.alisajid.leagueapplication.model;

import com.example.alisajid.leagueapplication.model.enums.Lane;
import com.example.alisajid.leagueapplication.model.enums.Role;

import java.util.Map;

public class TimeLine {
    private long participantID;
    private Map<String, Double> creepsPerMinDeltas;
    private Map<String, Double> xpPerMinDeltas;
    private Map<String, Double> goldPerMinDeltas;
    private Map<String, Double> csDiffPerMinDeltas;
    private Map<String, Double> xpDiffPerMinDeltas;
    private Map<String, Double> damageTakenPerMinDeltas;
    private Map<String, Double> damageTakenDiffPerMinDeltas;
    private Role role;
    private Lane lane;
}
