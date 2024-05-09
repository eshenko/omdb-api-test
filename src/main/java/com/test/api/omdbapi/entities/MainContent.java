package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Data
public class MainContent {

    String title;
    String year;
    String rated;
    String released;
    String runtime;
    String genre;
    String director;
    String writer;
    String actors;
    String plot;
    String language;
    String country;
    String awards;
    String poster;
    Rating[] ratings;
    String metascore;
    @JsonProperty("imdbRating")
    String imdbRating;
    @JsonProperty("imdbVotes")
    String imdbVotes;
    @JsonProperty("imdbID")
    String imdbID;
    String type;
    String response;
}
