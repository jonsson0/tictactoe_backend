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

    @Field("MatchId")
    private int matchId;

    @Field("XUserId")
    private String xUserId;

    @Field("OUserId")
    private String oUserId;

    @Field("Winner")
    private String winner;

    @Field("WinnerSymbol")
    private String winnerSymbol;

}
