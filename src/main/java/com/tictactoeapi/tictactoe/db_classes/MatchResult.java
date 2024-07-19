package com.tictactoeapi.tictactoe.db_classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "matchresults")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchResult {

    @Id
    private ObjectId id;

 //   @Field("MatchId")
 //   private int matchId;

    @Field("XUsername")
    private String xUsername;

    @Field("OUsername")
    private String oUsername;

    @Field("Winner")
    private String winner;

    @Field("WinnerSymbol")
    private String winnerSymbol;

    public MatchResult(String xUsername, String oUsername, String winner, String winnerSymbol) {
        this.xUsername = xUsername;
        this.oUsername = oUsername;
        this.winner = winner;
        this.winnerSymbol = winnerSymbol;
    }
}
