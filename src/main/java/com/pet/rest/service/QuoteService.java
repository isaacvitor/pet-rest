package com.pet.rest.service;

import com.pet.rest.dto.Quote;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class QuoteService {
    @Value("${quote.random.endpoint}")
    private String randomQuoteEndpoint;

    RestTemplate restTemplate;

    public Quote getRandomQuote() {
        return restTemplate.getForObject(randomQuoteEndpoint, Quote.class);
    }
}
