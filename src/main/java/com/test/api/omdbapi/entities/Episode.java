package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Episode extends MainContent {

    @JsonProperty("Season")
    String season;
    @JsonProperty("Episode")
    String episode;
    @JsonProperty("seriesID")
    String seriesID;
}
