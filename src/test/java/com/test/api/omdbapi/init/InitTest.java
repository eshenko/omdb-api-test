package com.test.api.omdbapi.init;

import com.test.api.omdbapi.ApiClient;
import com.test.api.omdbapi.entities.MainContent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;

import java.util.List;

public abstract class InitTest {

    private static ApiClient api;
    private static final Logger logger = LogManager.getLogger();

    @BeforeSuite(alwaysRun = true)
    public static void beforeSuiteSetUp() {

        api = new ApiClient();
    }

    /**
     * Step definition for searching all contents by a search string.
     *
     * @param search search string.
     * @return list of found contents.
     */
    public static List<MainContent> searchAllByString(String search) {

        return api.searchAllByString(search);
    }

    /**
     * Step definition for filtering an existing list of contents by title.
     *
     * @param list  filtering list.
     * @param title search title.
     * @return filtered content.
     */
    public static MainContent filterContentByTitle(List<MainContent> list, String title) {

        for (MainContent content : list) {
            if (content.getTitle().equals(title))
                return content;
        }

        logger.error("Content not found: {}", title);
        throw new RuntimeException("Content not found: " + title);
    }

    /**
     * Step definition for receiving a content by id.
     *
     * @param id search id.
     * @return found content.
     */
    public static MainContent findContentById(String id) {

        return api.getContentById(id);
    }

    /**
     * Step definition for receiving a content by title.
     *
     * @param title search title.
     * @return found content.
     */
    public static MainContent findContentByTitle(String title) {

        return api.getContentByTitle(title);
    }

}
