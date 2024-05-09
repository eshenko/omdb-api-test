package com.test.api.omdbapi;

import com.test.api.omdbapi.entities.*;
import com.test.api.omdbapi.utils.PagingUtil;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiClient {

    private final String baseUrl = System.getProperty("omdbApiUrl");
    private final String apiKey = System.getProperty("omdbApiKey");

    private final Logger logger = LogManager.getLogger();

    /**
     * Internal method for sending GET request with parameters to API and receiving response.
     *
     * @param queryParams parameters for GET request.
     * @return response to GET request.
     */
    private Response responseFromGETRequest(Map<String, String> queryParams) {

        return given()
                .queryParams(queryParams)
                .queryParam("apiKey", apiKey)
                .baseUri(baseUrl)
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
    }

    /**
     * Internal method for defining particular entity by unique field.
     *
     * @param response response to GET request.
     * @param search   search string.
     * @return particular content.
     */
    private MainContent getContentFromResponse(Response response, String search) {

        final String uniqueMovieField = "DVD";
        final String uniqueSeriesField = "totalSeasons";
        final String uniqueEpisodeField = "Episode";

        String responseBody = response.getBody().asString();

        if (responseBody.contains(uniqueMovieField))
            return response.as(Movie.class);
        else if (responseBody.contains(uniqueSeriesField))
            return response.as(Series.class);
        else if (responseBody.contains(uniqueEpisodeField))
            return response.as(Episode.class);
        else {
            logger.error("Content not found: {}", search);
            throw new RuntimeException("Content not found: " + search);
        }
    }

    /**
     * Receiving contents from all pages from API by search string.
     *
     * @param search search string.
     * @return found content.
     */
    public List<MainContent> searchAllByString(String search) {

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("s", search);

        logger.info("Search request with search string: <{}> was sent", search);

        ContentList contentList = responseFromGETRequest(queryParams).as(ContentList.class);
        List<MainContent> result = contentList.getContentList();

        int pageCount = PagingUtil.getPageCount(Integer.parseInt(contentList.getTotalResults()), 10);

        for (int i = 2; i <= pageCount; i++) {
            queryParams.put("page", String.valueOf(i));
            List<MainContent> contentListFromNextPage =
                    responseFromGETRequest(queryParams).as(ContentList.class).getContentList();

            result.addAll(contentListFromNextPage);
        }

        logger.info("Response for search string: <{}> was received", search);

        return result;
    }

    /**
     * Receiving content from API by ID.
     *
     * @param id search id.
     * @return found content.
     */
    public MainContent getContentById(String id) {

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("i", id);

        logger.info("Search request with ID: <{}> was sent", id);
        Response response = responseFromGETRequest(queryParams);
        logger.info("Response for ID: <{}> was received", id);

        return getContentFromResponse(response, id);
    }

    /**
     * Receiving content from API by Title.
     *
     * @param title search title.
     * @return found content.
     */
    public MainContent getContentByTitle(String title) {

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("t", title);

        logger.info("Search request with Title: <{}> was sent", title);
        Response response = responseFromGETRequest(queryParams);
        logger.info("Response for Title: <{}> was received", title);

        return getContentFromResponse(response, title);
    }
}
