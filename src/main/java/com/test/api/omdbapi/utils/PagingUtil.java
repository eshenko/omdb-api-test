package com.test.api.omdbapi.utils;

public class PagingUtil {

    /**
     * Calculating number of pages.
     *
     * @param totalResults number of all results.
     * @param pageSize     number of results on one page.
     * @return number of pages.
     */
    public static int getPageCount(int totalResults, int pageSize) {

        if (totalResults > pageSize) {
            if (totalResults % pageSize > 0)
                return totalResults / pageSize + 1;
            else
                return totalResults / pageSize;
        } else
            return 1;
    }
}
