package com.pet.rest.service;

import com.pet.rest.dto.Quote;
import com.pet.rest.dto.Value;
import com.pet.utils.ReplaceCamelCase;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@DisplayNameGeneration(ReplaceCamelCase.class)
@ExtendWith(MockitoExtension.class)
class QuoteServiceTest {
    @org.springframework.beans.factory.annotation.Value("${quote.random.endpoint}")
    private String randomQuoteEndpoint;

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private QuoteService quoteService;

    @Test
    void whenGetRandomQuoteTheReturnedQuoteShouldBeEqualsExpected() {
        //Arrange
        Quote expectedQuote = new Quote("type", new Value(1L, "quote"));
        when(restTemplate.getForObject(randomQuoteEndpoint, Quote.class)).thenReturn(expectedQuote);

        //Act
        Quote actualQuote = quoteService.getRandomQuote();

        //Assert
        assertEquals(expectedQuote, actualQuote);
    }
}
