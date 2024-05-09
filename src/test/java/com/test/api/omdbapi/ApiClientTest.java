package com.test.api.omdbapi;

import com.test.api.omdbapi.entities.MainContent;
import com.test.api.omdbapi.init.InitTest;
import com.test.api.omdbapi.init.TestDataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ApiClientTest extends InitTest {

    @Test(dataProvider = "search__check_pages_and_title", dataProviderClass = TestDataProvider.class)
    public void testSearchCheckPagesAndTitle(
            String search,
            String expectedTitle,
            int expectedCount
    ) {

        List<MainContent> contentList = searchAllByString(search);
        MainContent actualContent = filterContentByTitle(contentList, expectedTitle);

        assertTrue(contentList.size() >= expectedCount);
        assertEquals(actualContent.getTitle(), expectedTitle);
    }

    @Test(dataProvider = "get_by_title__check_plot_and_runtime", dataProviderClass = TestDataProvider.class)
    public void testGetByTitleCheckPlotAndRuntime(
            String title,
            String expectedPlot,
            String expectedRuntime
    ) {

        MainContent content = findContentByTitle(title);

        assertEquals(content.getTitle(), title);
        assertTrue(content.getPlot().toLowerCase().contains(expectedPlot.toLowerCase()));
        assertEquals(content.getRuntime(), expectedRuntime);
    }

    @Test(dataProvider = "search__check_release_and_director", dataProviderClass = TestDataProvider.class)
    public void testSearchCheckReleaseAndDirector(
            String search,
            String title,
            String expectedRelease,
            String expectedDirector
    ) {

        List<MainContent> contentList = searchAllByString(search);
        String id = filterContentByTitle(contentList, title).getImdbID();
        MainContent content = findContentById(id);

        assertEquals(content.getTitle(), title);
        assertEquals(content.getImdbID(), id);
        assertEquals(content.getReleased(), expectedRelease);
        assertEquals(content.getDirector(), expectedDirector);
    }
}