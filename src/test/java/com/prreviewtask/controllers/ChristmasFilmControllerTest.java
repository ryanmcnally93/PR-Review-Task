package com.prreviewtask.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ChristmasFilmControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getChristmasFilms_ReturnsFilmsAndOkStatus() throws Exception {
        mockMvc.perform(get("/api/christmasFilms"))
                .andExpect(status().isOk())
                .andExpect(content().string("Die Hard (Yes this counts), Elf, The Grinch Who Stole Christmas, Muppet's Christmas Carol, Home Alone, Love Actually"));
    }
}