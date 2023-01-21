package com.spring.acc.skyapp.skyapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.spring.acc.skyapp.skyapp.entity.DailyInfo;
import com.spring.acc.skyapp.skyapp.entity.Location;
import com.spring.acc.skyapp.skyapp.entity.Temperature;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@RunWith(SpringRunner.class)
public class MainControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getInfo200Ok() throws Exception {

        // Location location = new Location("128.6.5.6", "Spain", "Canary Islands", "Santa Cruz de Tenerife", "-", "28", "-16");
        // Temperature temperature = new Temperature("11", "22", "19", "rainy", true);
        // DailyInfo dailyInfo = new DailyInfo(0, "12-02-22", location, "", "", "", "", "", temperature);
        mockMvc.perform(get("/sky/info")).andExpect(status().isOk());
    }

}
