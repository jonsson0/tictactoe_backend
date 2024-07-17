package com.tictactoeapi.tictactoe.db_classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "matchresults")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchResult {

    @Id
    private ObjectId id;
    private String xuserid;
    private String ouserid;
    private String winner;
}
