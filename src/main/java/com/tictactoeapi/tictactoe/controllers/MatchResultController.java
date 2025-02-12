package com.tictactoeapi.tictactoe.controllers;

import com.tictactoeapi.tictactoe.Services.MatchResultService;
import com.tictactoeapi.tictactoe.db_classes.MatchResult;
import org.apache.tomcat.util.json.JSONParser;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    /*
    @GetMapping("/{matchId}")
    public ResponseEntity<Optional<MatchResult>> getSingleMatchResults(@PathVariable int matchId) {
        return new ResponseEntity<Optional<MatchResult>>(matchResultService.getMatchResultsByMatchId(matchId), HttpStatus.OK);
    }n
    */

    @PostMapping()
    public ResponseEntity<MatchResult> createMatchResult(@RequestBody MatchResult bodyMatchResult) {
        // MatchResult createdMatchResult = matchResultService.createMatchResult(bodyMatchResult);
        System.out.println(bodyMatchResult.toString());

        // Save the match result and return the response
        MatchResult createdMatchResult = matchResultService.createMatchResult(bodyMatchResult);
        return new ResponseEntity<>(createdMatchResult, HttpStatus.CREATED);

       // return null; //new ResponseEntity<MatchResult>(matchResultService.createMatchResult(bodyMatchResult), HttpStatus.CREATED);
    }

}
