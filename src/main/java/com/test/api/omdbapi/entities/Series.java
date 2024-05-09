package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Series extends MainContent {

    @JsonProperty("totalSeasons")
    String totalSeasons;
}
