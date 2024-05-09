package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rating {

    @JsonProperty("Source")
    String source;
    @JsonProperty("Value")
    String value;
}
