package com.tictactoeapi.tictactoe.db_classes;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("xUsername")
    @Field("xUsername")
    private String xUsername;

    @JsonProperty("oUsername")
    @Field("oUsername")
    private String oUsername;

    @JsonProperty("winner")
    @Field("winner")
    private String winner;

    @JsonProperty("winnerSymbol")
    @Field("winnerSymbol")
    private String winnerSymbol;

    public MatchResult(String xUsername, String oUsername, String winner, String winnerSymbol) {
        this.xUsername = xUsername;
        this.oUsername = oUsername;
        this.winner = winner;
        this.winnerSymbol = winnerSymbol;
    }
}
