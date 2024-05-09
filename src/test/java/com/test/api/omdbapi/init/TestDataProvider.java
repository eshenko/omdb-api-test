package com.test.api.omdbapi.init;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "search__check_pages_and_title")
    public Object[][] search() {
        return new Object[][]{
                {"stem", "The STEM Journals", 30},
                {"stem", "Activision: STEM - in the Videogame Industry", 30}
        };
    }

    @DataProvider(name = "get_by_title__check_plot_and_runtime")
    public Object[][] byTitle() {
        return new Object[][]{
                {"The STEM Journals", "Science, Technology, Engineering and Mat", "22 min"}
        };
    }

    @DataProvider(name = "search__check_release_and_director")
    public Object[][] byId() {
        return new Object[][]{
                {"stem", "Activision: STEM - in the Videogame Industry", "23 Nov 2010", "Mike Feurstein"}
        };
    }
}
