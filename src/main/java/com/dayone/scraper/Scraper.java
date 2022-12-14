package com.dayone.scraper;

import com.dayone.model.Company;
import com.dayone.model.ScrapeResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapeResult scrap(Company company);
}
