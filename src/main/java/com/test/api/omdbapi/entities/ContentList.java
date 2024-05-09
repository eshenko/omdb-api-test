package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ContentList {

    @JsonProperty("Search")
    List<MainContent> contentList;
    @JsonProperty("totalResults")
    String totalResults;
    @JsonProperty("Response")
    String response;
}
