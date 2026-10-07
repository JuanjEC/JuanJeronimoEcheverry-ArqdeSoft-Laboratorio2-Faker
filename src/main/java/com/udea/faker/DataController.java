package com.udea.faker;

import net.datafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
public class DataController {

    private static final int NATIONS_COUNT = 10;
    private static final int CURRENCIES_COUNT = 20;
    private static final int AVIATIONS_COUNT = 20;

    private final Faker faker = new Faker(Locale.US);

    @GetMapping("/")
    public String healthCheck() {
        return "HEALTH CHECK OK!";
    }

    @GetMapping("/version")
    public String version() {
        return "The actual version is 1.0.0";
    }

    @GetMapping("/nations")
    public List<Map<String, String>> getRandomNations() {
        List<Map<String, String>> nations = new ArrayList<>();
        for (int i = 0; i < NATIONS_COUNT; i++) {
            var nation = faker.nation();
            Map<String, String> item = new LinkedHashMap<>();
            item.put("nationality", nation.nationality());
            item.put("capitalCity", nation.capitalCity());
            item.put("flag", nation.flag());
            item.put("language", nation.language());
            nations.add(item);
        }
        return nations;
    }

    @GetMapping("/currencies")
    public List<Map<String, String>> getRandomCurrencies() {
        List<Map<String, String>> currencies = new ArrayList<>();
        for (int i = 0; i < CURRENCIES_COUNT; i++) {
            var currency = faker.currency();
            Map<String, String> item = new LinkedHashMap<>();
            item.put("name", currency.name());
            item.put("code", currency.code());
            currencies.add(item);
        }
        return currencies;
    }

    @GetMapping("/aviation")
    public List<Map<String, String>> getRandomAviation() {
        List<Map<String, String>> aviations = new ArrayList<>();
        for (int i = 0; i < AVIATIONS_COUNT; i++) {
            var aviation = faker.aviation();
            Map<String, String> item = new LinkedHashMap<>();
            item.put("aircraft", aviation.aircraft());
            item.put("airport", aviation.airport());
            item.put("METAR", aviation.METAR());
            aviations.add(item);
        }
        return aviations;
    }
}
