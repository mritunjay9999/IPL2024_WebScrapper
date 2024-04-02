package dev.mritunjay.crickinformer.services;

import dev.mritunjay.crickinformer.models.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

//    get all matches
//    get live matches
//    get ipl point table

    List<Match> getAllMatches();

    List<Match> getLiveMatches();

    List<List<String>> getPointTable();

}
