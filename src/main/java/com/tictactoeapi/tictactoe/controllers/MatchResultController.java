package com.tictactoeapi.tictactoe.controllers;

import com.tictactoeapi.tictactoe.Services.MatchResultService;
import com.tictactoeapi.tictactoe.db_classes.MatchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/matchresults")
public class MatchResultController {

    @Autowired
    private MatchResultService matchResultService;

    @GetMapping
    public ResponseEntity<List<MatchResult>> getMatchResults() {
        return new ResponseEntity<List<MatchResult>>(matchResultService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/{matchId}")
    public ResponseEntity<Optional<MatchResult>> getSingleMatchResults(@PathVariable int matchId) {
        return new ResponseEntity<Optional<MatchResult>>(matchResultService.getMatchResultsByMatchId(matchId), HttpStatus.OK);
    }


}
