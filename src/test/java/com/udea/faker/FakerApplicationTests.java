package com.udea.faker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class FakerApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void health() {
        assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    void version() {
        assertEquals("The actual version is 1.0.0", dataController.version());
    }

    @Test
    void nationLength() {
        assertEquals(10, dataController.getRandomNations().size());
    }

    @Test
    void nationFields() {
        for (Map<String, String> nation : dataController.getRandomNations()) {
            assertFalse(nation.get("nationality").isBlank());
            assertFalse(nation.get("capitalCity").isBlank());
            assertFalse(nation.get("flag").isBlank());
            assertFalse(nation.get("language").isBlank());
        }
    }

    @Test
    void currenciesLength() {
        assertEquals(20, dataController.getRandomCurrencies().size());
    }

    @Test
    void currenciesCodeFormat() {
        for (Map<String, String> currency : dataController.getRandomCurrencies()) {
            assertTrue(currency.get("code").matches("[A-Z]{3}"));
        }
    }

    @Test
    void aviationsLength() {
        assertEquals(20, dataController.getRandomAviation().size());
    }

    @Test
    void aviationFields() {
        for (Map<String, String> aviation : dataController.getRandomAviation()) {
            assertFalse(aviation.get("aircraft").isBlank());
            assertFalse(aviation.get("airport").isBlank());
            assertFalse(aviation.get("METAR").isBlank());
        }
    }

    @Test
    void nationsPerformance() {
        DataController controller = new DataController();
        long start = System.currentTimeMillis();
        List<Map<String, String>> nations = controller.getRandomNations();
        long elapsed = System.currentTimeMillis() - start;
        assertEquals(10, nations.size());
        assertTrue(elapsed < 2000);
    }
}
