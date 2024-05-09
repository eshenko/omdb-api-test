package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ContentList {

    private List<MainContent> contentList;
    private String totalResults;
    private String response;

    public ContentList(
            @JsonProperty("Search")
            List<MainContent> contentList,
            @JsonProperty("totalResults")
            String totalResults,
            @JsonProperty("Response")
            String response
    ) {
        this.contentList = contentList;
        this.totalResults = totalResults;
        this.response = response;
    }

    public List<MainContent> getContentList() {
        return contentList;
    }

    public void setContentList(List<MainContent> contentList) {
        this.contentList = contentList;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
