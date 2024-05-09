package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Episode extends MainContent {

    private String season;
    private String episode;
    private String seriesID;

    public Episode(
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
            @JsonProperty("Season")
            String season,
            @JsonProperty("Episode")
            String episode,
            @JsonProperty("seriesID")
            String seriesID
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
        this.season = season;
        this.episode = episode;
        this.seriesID = seriesID;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(String seriesID) {
        this.seriesID = seriesID;
    }
}
