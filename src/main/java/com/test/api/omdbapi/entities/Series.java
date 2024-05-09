package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Series extends MainContent {

    private String totalSeasons;

    public Series(
            @JsonProperty("Title")
            String title,
            @JsonProperty("Year")
            String year,
            @JsonProperty("Rated")
            String rated,
            @JsonProperty("Released")
            String released,
            @JsonProperty("Runtime")
            String runtime,
            @JsonProperty("Genre")
            String genre,
            @JsonProperty("Director")
            String director,
            @JsonProperty("Writer")
            String writer,
            @JsonProperty("Actors")
            String actors,
            @JsonProperty("Plot")
            String plot,
            @JsonProperty("Language")
            String language,
            @JsonProperty("Country")
            String country,
            @JsonProperty("Awards")
            String awards,
            @JsonProperty("Poster")
            String poster,
            @JsonProperty("Ratings")
            Rating[] ratings,
            @JsonProperty("Metascore")
            String metascore,
            @JsonProperty("imdbRating")
            String imdbRating,
            @JsonProperty("imdbVotes")
            String imdbVotes,
            @JsonProperty("imdbID")
            String imdbID,
            @JsonProperty("Type")
            String type,
            @JsonProperty("Response")
            String response,
            @JsonProperty("totalSeasons")
            String totalSeasons
    ) {
        super(
                title,
                year,
                rated,
                released,
                runtime,
                genre,
                director,
                writer,
                actors,
                plot,
                language,
                country,
                awards,
                poster,
                ratings,
                metascore,
                imdbRating,
                imdbVotes,
                imdbID,
                type,
                response
        );
        this.totalSeasons = totalSeasons;
    }

    public String getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(String totalSeasons) {
        this.totalSeasons = totalSeasons;
    }
}
