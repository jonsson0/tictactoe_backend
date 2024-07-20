package com.tictactoeapi.tictactoe.Services;

import com.tictactoeapi.tictactoe.db_classes.MatchResult;
import com.tictactoeapi.tictactoe.repositories.MatchResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchResultService {

    @Autowired
    private MatchResultRepository matchResultRepository;

    public List<MatchResult> getAllMatches() {
        return matchResultRepository.findAll();
    }

/*
    public Optional<MatchResult> getMatchResultsByMatchId(int matchId) {
        System.out.println(matchResultRepository.findMatchResultByMatchId(matchId).toString());
        return matchResultRepository.findMatchResultByMatchId(matchId);
    }
*/
    public MatchResult createMatchResult(MatchResult matchResult) {

        return matchResultRepository.insert(matchResult);
    }



}
