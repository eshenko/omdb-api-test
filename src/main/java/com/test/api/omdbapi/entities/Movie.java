package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Movie extends MainContent {

    @JsonProperty("DVD")
    String dvd;
    @JsonProperty("BoxOffice")
    String boxOffice;
    @JsonProperty("Production")
    String production;
    @JsonProperty("Website")
    String website;
}
