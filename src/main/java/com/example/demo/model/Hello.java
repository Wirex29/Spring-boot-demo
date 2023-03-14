package com.example.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Hello {
    private final String[] randomQuote = {"The only way to write bug-free code is to write no code at all. - Anonymous",
                                    "There are two ways to write error-free programs; only the third one works. - Alan J. Perlis",
                                    "One of my most productive days was throwing away 1,000 lines of code. - Ken Thompson",
                                    "The first 90 percent of the code accounts for the first 90 percent of the development time. The remaining 10 percent of the code accounts for the other 90 percent of the development time. - Tom Cargill",
                                    "Programmer: A machine that turns coffee into code. - Unknown",
                                    "Programming is like a puzzle. You have to find the right pieces and put them together in the right way. Sometimes you have to make your own pieces or modify the existing ones. And sometimes you have to throw away the whole thing and start over. - Bing"
                                    };


}
